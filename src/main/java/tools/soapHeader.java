package tools;


import java.util.Calendar;
import java.util.TimeZone;
import java.util.UUID;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.http.HttpRequest;
import org.apache.http.client.methods.HttpPost;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;

import org.apache.ws.security.WSSecurityException;
import org.apache.ws.security.util.Base64;

		
public class soapHeader
{

	public static HttpPost requestheader(HttpPost request,String airline,String soapAction) 
	{
		if(airline.equals("BA")) {
			request.addHeader( "content-type", "application/xml;charset=utf-8" );
			request.addHeader( "Client-Key", appConfig.baKey ); //BA Key
			request.addHeader("SOAPAction", soapAction);
		}
		else if(airline.equals("PC")) {
			request.addHeader( "content-type", "text/xml;charset=utf-8" );
			request.addHeader( "Username", appConfig.pcUsername);
			request.addHeader( "Password", appConfig.pcPassword );
			request.addHeader("SOAPAction", soapAction);
		}
		else if(airline.equals("SQ")) {
			request.addHeader( "content-type", "text/xml;charset=utf-8" );
			request.addHeader("SOAPAction", soapAction);
		}
	
		return request;
	}
	
	
	public static String soapenvHeader(String version,String airline) throws NoSuchAlgorithmException, UnsupportedEncodingException, WSSecurityException 
	{
		String soapHeader = "";

		String created = generate_created(); //"2021-02-15T23:00:10.097Z";
		String nonce = generate_nonce();
		String password = "";
		
		if(airline.equals("BA")) {
			soapHeader = " <SOAP-ENV:Header />";
		}
		else if(airline.equals("PC")) {
			soapHeader = " <SOAP-ENV:Header />";
		}
		else if(airline.equals("SQ"))
		{
			password= password_digest(password_encrypt(appConfig.sqPassword,"SHA-1"),nonce,created);
			
			soapHeader = "<soapenv:Header xmlns:wsa=\"http://www.w3.org/2005/08/addressing\">\n"
					+ "        <sec:AMA_SecurityHostedUser>\n"
					+ "            <sec:UserID POS_Type=\"1\" RequestorType=\"U\" PseudoCityCode=\"SYDSQ08NH\" AgentDutyCode=\"SU\">\n"
					+ "                <typ:RequestorID xmlns:typ=\"http://xml.amadeus.com/2010/06/Types_v1\" xmlns:iat=\"http://www.iata.org/IATA/2007/00/IATA2010.1\">\n"
					+ "                    <iat:CompanyName>"+airline+"</iat:CompanyName>\n"
					+ "                </typ:RequestorID>\n"
					+ "            </sec:UserID>\n"
					+ "        </sec:AMA_SecurityHostedUser>\n"
					+ "        <wsa:To>"+appConfig.sqUrl+"</wsa:To>\n"
					+ "        <wsa:Action>http://webservices.amadeus.com/NDC_AirShopping_18.1</wsa:Action>\n"
					+ "        <wsa:MessageID>"+UUID.randomUUID().toString()+"</wsa:MessageID>\n"
					+ "        <wsse:Security xmlns:wsse=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\">\n"
					+ "         <wsse:UsernameToken>\n"
					+ "            <wsse:Username>"+appConfig.sqUsername+"</wsse:Username>\n"
					+ "            <wsse:Password Type=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0#PasswordDigest\">"+password+"</wsse:Password>\n"
					+ "            <wsse:Nonce EncodingType=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-soap-message-security-1.0#Base64Binary\">"+nonce+"</wsse:Nonce>\n"
					+ "            <wsu:Created>"+created+"</wsu:Created>\n"
					+ "         </wsse:UsernameToken>\n"
					+ "        </wsse:Security>\n"
					+ "    </soapenv:Header>";
		}
		
		return soapHeader;
		
		
	}
	
	public static String generate_created() {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
		Calendar cal = Calendar.getInstance();
		format.setTimeZone(TimeZone.getTimeZone("Zulu"));	
		return format.format(cal.getTime());
	}
	
	public static String generate_nonce() throws NoSuchAlgorithmException {	
		SecureRandom random = SecureRandom.getInstance("SHA1PRNG");
		random.setSeed(System.currentTimeMillis());
		byte[] nonceValue = new byte[16];
		random.nextBytes(nonceValue);
		
		return Base64.encode(nonceValue);
//		
//		return Base64.getEncoder()
//				.encodeToString(DigestUtils.sha1(nonceValue));
	}
	
	public static byte[] password_encrypt(String password,String algorithm) throws NoSuchAlgorithmException, UnsupportedEncodingException {
		MessageDigest sha = MessageDigest.getInstance(algorithm);
		sha.reset();
		byte[] b1 = password.getBytes("UTF-8");
		sha.update(b1);

		return sha.digest();
	}

	public static String password_digest(byte[] password,String nonce,String created) throws UnsupportedEncodingException, NoSuchAlgorithmException, WSSecurityException {
		String passwdDigest = null;
		byte[] b1 = nonce != null ? Base64.decode(nonce) : new byte[0];
		byte[] b2 = created != null ? created.getBytes("UTF-8") : new byte[0];
		byte[] b3 = password;	
		byte[] b4 = new byte[b1.length + b2.length + b3.length];
		int offset = 0;
		System.arraycopy(b1, 0, b4, offset, b1.length);
		offset += b1.length;
		System.arraycopy(b2, 0, b4, offset, b2.length);
		offset += b2.length;
		System.arraycopy(b3, 0, b4, offset, b3.length);
		MessageDigest sha = MessageDigest.getInstance("SHA-1");
		sha.reset();
		sha.update(b4);
		passwdDigest = Base64.encode(sha.digest());
		return passwdDigest;
	}

}