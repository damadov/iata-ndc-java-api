package iata.httpclient;

import java.io.IOException;
import java.io.InputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.iata.ndc.schema.SeatAvailabilityRS;

import iata.ndc.ClientException;

public class ApacheHttpClient {

    private static final String API_KEY = "nnpzytp6zbv7zj28wrnhrbvp";

	private static final String CONTENT_TYPE = "application/xml";
 
    private static final String POST_URL = "http://iata.api.mashery.com/athena/api";
	
    public static SeatAvailabilityRS seatAvailability(String xml) throws IOException {
    	return sendPOST(xml);
    }
    
	private static <T> T sendPOST(String xml) throws IOException {
		 
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpPost httpPost = new HttpPost(POST_URL);
        httpPost.addHeader("Content-Type", CONTENT_TYPE);
        httpPost.addHeader("Authorization-Key", API_KEY);
 
//        List<NameValuePair> urlParameters = new ArrayList<NameValuePair>();
//        urlParameters.add(new BasicNameValuePair("userName", "Pankaj Kumar"));
 
//        HttpEntity postParams = new UrlEncodedFormEntity(urlParameters);
        
        HttpEntity entity = new ByteArrayEntity(xml.getBytes("UTF-8"));
        httpPost.setEntity(entity);
 
        CloseableHttpResponse httpResponse = httpClient.execute(httpPost);
 
        System.out.println("POST Response Status:: "
                + httpResponse.getStatusLine().getStatusCode());
 
        InputStream content = httpResponse.getEntity().getContent();
        T result;
		try {
			JAXBContext context = JAXBContext.newInstance("org.iata.ndc.schema");
			Unmarshaller unmarshaller = context.createUnmarshaller();
			result = (T) unmarshaller.unmarshal(content);
		} catch (JAXBException e) {
			throw new ClientException(e);
		}
        /*
		BufferedReader reader = new BufferedReader(new InputStreamReader(
                content));
 
        String inputLine;
        StringBuffer response = new StringBuffer();
 
        while ((inputLine = reader.readLine()) != null) {
            response.append(inputLine);
        }
        
        reader.close();
 
        // print result
        System.out.println(response.toString());
        */
        httpClient.close();
 
        return result;
    }
	
}
