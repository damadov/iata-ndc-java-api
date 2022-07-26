package tools;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.CookiePolicy;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.config.CookieSpecs;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.params.ClientPNames;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpParams;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import data.AmadeusRoomResult;
import data.Customer;
import data.searchParams;


public class requestTool {

	private static String reqStr = "";
	private static String resStr = "";
	private static String reqCookie = "";
	private static String resCookie = "";
	
	public static HttpServletResponse checkToken(HttpServletRequest request,HttpServletResponse response) {
		
		try {
			
			response = setCORS(response,true);
		    String ipAddress = requestTool.getIP(request);
			//if(!requestTool.getIP(request).equals("127.0.0.1")) {
				if(request != null && request.getHeader("Authorization-Key")!=null) {
				
					String chk = tokenTools.checkToken(request.getHeader("Authorization-Key").toString(),ipAddress);
					//tools.console.println("Chk:"+chk);
					if(chk != null) {
						response.setHeader("Authorization-Key", chk);
						response.setStatus(HttpServletResponse.SC_OK);
					}
					else {
						response.setHeader("Authorization-Key", "");
						response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
					}
					
				}else response.setStatus(HttpServletResponse.SC_OK);
			//}else {
			//	String chk = tokenTools.checkToken(request.getHeader("Authorization-Key"),requestTool.getIP(request));
			//	response.setHeader("Authorization-Key", chk);
			//	response.setStatus(HttpServletResponse.SC_OK);
			//}
			
			return response;
			
		}catch(Exception ex) {
			return null;
		}
		
	}
	
	public static HttpServletResponse setCORS(HttpServletResponse response,Boolean isSet) {
		try {
			

			if(appConfig.isProduction) {
				response.setHeader("Access-Control-Allow-Origin", appConfig.webUrl);
			    response.setHeader("Access-Control-Allow-Credentials", "true");
			    response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE,PUT,PATCH");
			    response.setHeader("Access-Control-Max-Age", "3600");
			    response.setHeader("Access-Control-Allow-Headers", "Content-Type, Accept, X-Requested-With, remember-me, Authorization-Key,AmadeusCookie,AmadeusRoomId");
			    response.setHeader("Access-Control-Expose-Headers", "Authorization-Key,AmadeusCookie,AmadeusRoomId");
			}
			else if(isSet) {
				response.setHeader("Access-Control-Allow-Origin", "*");
			    response.setHeader("Access-Control-Allow-Credentials", "true");
			    response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE,PUT,PATCH");
			    response.setHeader("Access-Control-Max-Age", "3600");
			    response.setHeader("Access-Control-Allow-Headers", "Content-Type, Accept, X-Requested-With, remember-me, Authorization-Key,AmadeusCookie,AmadeusRoomId");
			    response.setHeader("Access-Control-Expose-Headers", "Authorization-Key,AmadeusCookie,AmadeusRoomId");
			    
			}else {
				response.setHeader("Access-Control-Allow-Origin", "https://www.trippep.com");
			    response.setHeader("Access-Control-Allow-Credentials", "true");
			    response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE,PUT,PATCH");
			    response.setHeader("Access-Control-Max-Age", "3600");
			    response.setHeader("Access-Control-Allow-Headers", "Content-Type, Accept, X-Requested-With, remember-me, Authorization-Key,AmadeusCookie,AmadeusRoomId");
			    response.setHeader("Access-Control-Expose-Headers", "Authorization-Key,AmadeusCookie,AmadeusRoomId");
			}
				
			return response;
		}catch(Exception ex){
			return response;
		}
		
		
	}
	
	
	
	public static String callSOAPsignature(String actionName, String username, String password, String json_req, String url,
			searchParams sparams,String authtoken,String apiKey,String secret) throws IOException {
		CloseableHttpClient httpClient = HttpClientBuilder.create().setUserAgent("HBHotelAppEngine").build();

		try {

			String signature = org.apache.commons.codec.digest.DigestUtils.sha256Hex(apiKey + secret + System.currentTimeMillis() / 1000);

	
			HttpPost request = new HttpPost(url);

			request.addHeader("X-Signature", signature);
			request.addHeader("Api-key", apiKey);
			request.addHeader("Accept", "application/json");

			StringEntity params = new StringEntity(json_req);
			request.setEntity(params);

			tools.console.println("Sending request body:");
			tools.console.println(json_req);
			HttpResponse response = httpClient.execute(request);

			// Read the response
			InputStreamReader is = new InputStreamReader(response.getEntity().getContent());
			StringBuilder sb = new StringBuilder();
			BufferedReader br = new BufferedReader(is);
			String read = br.readLine();

			while (read != null) {
				sb.append(read);
				read = br.readLine();
			}

			tools.console.println("------------------------------------------------------------");
			tools.console.println("Result  :");
			tools.console.println(sb.toString());
			tools.console.println("------------------------------------------------------------");

			return sb.toString();
		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		} finally {
			httpClient.close();
		}
	}
	
	 
	public static String getJSON(HttpServletRequest request) {
		String json_req = "";

		try {
		if(request.getParameter("myData")!=null) {
			  json_req = request.getParameter("myData");
 
		  }
		else if(request.getParameter("newData")!=null) {
			json_req = request.getParameter("newData");
			tools.console.println("Requets parameter updated:"+json_req);
		}
		else if(request.getParameter("key")!=null) {
			json_req = request.getParameter("key");
			tools.console.println("Requets parameter updated:"+json_req);
		}
		else {

			  BufferedReader br = new BufferedReader(new InputStreamReader(request.getInputStream()));
//			  
//		        if(br != null){
//		        		json_req = br.readLine();
//		        }
			  String read = br.readLine();

		  		while( read != null )
		  		{
		  			json_req = json_req + read ;
		  			read = br.readLine();
		  		}

		  }
		}catch(Exception ex) {
			tools.console.println("PArsing Request Error"+ex.getMessage());
		}
		
		return json_req;
	}
	
	public static String getIP(HttpServletRequest request) {
		 String ipAddress = request.getHeader("X-FORWARDED-FOR");  
	       if (ipAddress == null) {  
	         ipAddress = request.getRemoteAddr();  
	       }
		
		return ipAddress;
	}
	public static String getInfo(HttpServletRequest request) {
		try {
			return request.getHeader("user-agent")+"\n"+request.getHeader("from");
		}catch(Exception ex) {
			return "";
			
		}
	}
	
}
