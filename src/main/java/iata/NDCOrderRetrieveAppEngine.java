package iata;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import data.Pnr;
import data.bookFlightParams;
import data.searchParams;
import tools.appConfig;
import tools.parsingTool;
import tools.requestTool;

@WebServlet(name = "NDCOrderRetrieveAppEngine", urlPatterns = { "/ndcgetpnr" })

public class NDCOrderRetrieveAppEngine extends HttpServlet {



	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override 
	  public void doOptions(HttpServletRequest request, HttpServletResponse response) throws IOException {
		 response = requestTool.setCORS(response,true);
	  }
	
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

		Pnr pnr = new Pnr();
		Gson gson = new GsonBuilder().create();
		String str = "";
		String airline = "";

		if (request != null) {
			HttpSession session = request.getSession();
			String ipAddress = requestTool.getIP(request);
			String json_req = requestTool.getJSON(request);
			response = requestTool.checkToken(request, response);

			tools.console.println("Query:" + json_req);
			tools.console.println("Get Pnr Engine..");

			pnr = gson.fromJson(json_req, Pnr.class);
			if(pnr !=null ) {
				
				if(pnr.source.equals("BA-NDC"))
					airline = "BA";
				else 
					airline = pnr.source.replaceAll("-NDC", "");

				if(airline.equals("BA"))
					str = TestClient.ndcOrderRetrieve(pnr, airline, appConfig.baKey, null,null,appConfig.baUrl+"/OrderRetrieve/"+appConfig.baVersion, "OrderRetrieve17_2_V1");
				else
					str = TestClient.ndcOrderRetrieve(pnr, airline, null, appConfig.pcUsername,appConfig.pcPassword,appConfig.pcUrl, "cranendc/doOrderRetrieve");
				
				
				try {
					DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
					DocumentBuilder builder = factory.newDocumentBuilder();
					factory.setNamespaceAware(true);
					InputSource isource = new InputSource(new StringReader(str));

					Document doc = builder.parse(isource);
					Node order = doc.getElementsByTagName("Order").item(0);
					if(doc.getElementsByTagName("Order")!=null && doc.getElementsByTagName("Order").getLength()>0) {
						tools.console.println(parsingTool.getAttribute(doc.getElementsByTagName("Order").item(0), "OrderID"));
					}
					if(doc.getElementsByTagName("Errors")!=null && doc.getElementsByTagName("Errors").getLength()>0) {
						tools.console.println(parsingTool.findValue(doc.getElementsByTagName("Erros").item(0), "Error"));
						response.setCharacterEncoding("UTF8");
						response.setContentType("application/xml");
						response.getWriter().print(parsingTool.findValue(doc.getElementsByTagName("Erros").item(0), "Error"));
					}
					

				} catch (Exception ex1) {
					tools.console.println("Xml Document Parsing Error:" + ex1.getMessage());
				}
				
				response.setCharacterEncoding("UTF8");
				response.setContentType("application/xml");
				response.getWriter().print(str);
			}else {
				response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
				response.setCharacterEncoding("UTF8");
				response.setContentType("application/xml");
			
			}
			

		}


		

	}

}