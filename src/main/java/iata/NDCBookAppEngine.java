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

import data.bookFlightParams;
import data.searchParams;
import tools.appConfig;
import tools.parsingTool;
import tools.requestTool;

@WebServlet(name = "NDCBookAppEngine", urlPatterns = { "/ndcbook" })
public class NDCBookAppEngine extends HttpServlet {



	@Override 
	  public void doOptions(HttpServletRequest request, HttpServletResponse response) throws IOException {
		 response = requestTool.setCORS(response,true);
	  }
	
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

		bookFlightParams params = new bookFlightParams();
		Gson gson = new GsonBuilder().create();
		String str = "";
		String airline = "";

		if (request != null) {
			HttpSession session = request.getSession();
			String ipAddress = requestTool.getIP(request);
			String json_req = requestTool.getJSON(request);
			response = requestTool.checkToken(request, response);

			tools.console.println("Query:" + json_req);
			tools.console.println("Offer Book Engine..");

			params = gson.fromJson(json_req, bookFlightParams.class);
			
			if(params.offer.source.equals("PC-NDC")) {
				str = TestClient.ndcBook(params, "PC",null, appConfig.pcUsername,appConfig.pcPassword, appConfig.pcUrl, "cranendc/doOrderCreate");
			}
			else {
				str = TestClient.ndcBook(params, "BA", appConfig.baKey,null,null, appConfig.baUrl+"/OrderCreate/"+appConfig.baVersion, "OrderCreate17_2_V1");
			}

			
			

		}


		response.setCharacterEncoding("UTF8");
		response.setContentType("application/xml");
		response.getWriter().print(str);

	}

}