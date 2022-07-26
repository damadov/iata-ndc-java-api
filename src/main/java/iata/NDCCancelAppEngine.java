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

@WebServlet(name = "NDCCancelAppEngine", urlPatterns = { "/ndccancel" })

public class NDCCancelAppEngine extends HttpServlet {



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
			tools.console.println("Cancel Pnr Engine..");

			pnr = gson.fromJson(json_req, Pnr.class);
			if(pnr !=null ) {
				
				if(pnr.source.equals("BA-NDC")) {
					airline = "BA";
					str = TestClient.ndcOrderCancel(pnr, "BA",appConfig.baKey,null,null , appConfig.baUrl+"/OrderCancel/"+appConfig.baVersion, "OrderCancel17_2_V1");
					
				}
				else if(pnr.source.equals("PC-NDC")) {
					airline = "PC";
					str = TestClient.ndcOrderCancel(pnr, "PC", null,appConfig.pcUsername,appConfig.pcPassword ,appConfig.pcUrl, "cranendc/doCancelCommitRequest");
				}
				else {
					response.setStatus(HttpServletResponse.SC_NO_CONTENT);
					response.setCharacterEncoding("UTF8");
					response.setContentType("application/xml");
				}

				
				try {
					DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
					DocumentBuilder builder = factory.newDocumentBuilder();
					factory.setNamespaceAware(true);
					InputSource isource = new InputSource(new StringReader(str));

					Document doc = builder.parse(isource);
					Node order = doc.getElementsByTagName("Order").item(0);
					tools.console.println(parsingTool.getAttribute(order, "OrderID"));

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