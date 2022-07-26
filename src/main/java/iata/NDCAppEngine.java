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
import org.xml.sax.InputSource;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import data.searchParams;
import tools.appConfig;
import tools.requestTool;

@WebServlet(name = "NDCAppEngine", urlPatterns = { "/ndcoffers" })
public class NDCAppEngine extends HttpServlet {

	private static final long serialVersionUID = 8105437641299494845L;

	@Override 
	  public void doOptions(HttpServletRequest request, HttpServletResponse response) throws IOException {
		 response = requestTool.setCORS(response,true);
	  }
	
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

		searchParams params = new searchParams();
		Gson gson = new GsonBuilder().create();
		String str = "";

		if (request != null) {
			
			HttpSession session = request.getSession();
			String ipAddress = requestTool.getIP(request);
			String json_req = requestTool.getJSON(request);
			

			tools.console.println("Query:" + json_req);
			tools.console.println("Offer Search Engine..");

			params = gson.fromJson(json_req, searchParams.class);
			

			if(params.airline.equals("BA"))
				str = TestClient.ndcAirlines(params, params.airline, appConfig.baKey,null,null, appConfig.baUrl+"/AirShopping/"+appConfig.baVersion, "AirShopping17_2_V1");
			else if(params.airline.equals("PC"))
				str = TestClient.ndcAirlines(params, params.airline, null, appConfig.pcUsername,appConfig.pcPassword, appConfig.pcUrl, "cranendc/doAirShopping");
			else if(params.airline.equals("SQ"))
				str = TestClient.ndcAirlines_181(params, params.airline, null, appConfig.sqUsername,appConfig.sqPassword, appConfig.sqUrl, "http://webservices.amadeus.com/NDC_AirShopping_18.1");
			
			/*try {
				DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
				DocumentBuilder builder = factory.newDocumentBuilder();
				factory.setNamespaceAware(true);
				InputSource isource = new InputSource(new StringReader(str));

				Document doc = builder.parse(isource);
				if(doc.getElementsByTagName("ShoppingResponseID")!=null)
					tools.console.println(doc.getElementsByTagName("ShoppingResponseID").item(0).getTextContent());

			} catch (Exception ex1) {
				tools.console.println("Xml Document Parsing Error:" + ex1.getMessage());
			}

			/*
			 * if(params.getAirline().equals("AF")) str =
			 * TestClient.ndcAirFranceKLM(params); if(params.getAirline().equals("KL")) str
			 * = TestClient.ndcAirFranceKLM(params);
			 */

		}


		response.setCharacterEncoding("UTF8");
		response.setContentType("application/xml");
		response.getWriter().print(str);

	}

}