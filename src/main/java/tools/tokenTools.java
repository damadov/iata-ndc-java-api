package tools;

import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.codec.digest.DigestUtils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.auth0.jwt.exceptions.JWTDecodeException;
import com.auth0.jwt.interfaces.DecodedJWT;

import com.google.common.hash.Hashing;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import data.Token;

public class tokenTools {


	private final static String secret = appConfig.encodeSecret;
	 
	public static String encodePwd(String pwd)
	  {

				String hashedStr = Base64.getEncoder().encodeToString(DigestUtils.sha1(pwd));
				
				return hashedStr;
				

	  }
	
	 public static String createToken(String body)
	  {
	      try {
	          return JWT.create()	
	                  .withIssuer("auth0")
	                  .withClaim("data", body)
	                  .sign(Algorithm.HMAC256(secret));
	      } catch (JWTCreationException exception){
	          throw new RuntimeException("You need to enable Algorithm.HMAC256");
	      }
	  }
	  
	  public static String getDataInToken(String token)
	  {
	      try {
	          JWTVerifier verifier = JWT.require(Algorithm.HMAC256(secret))
	                  .withIssuer("auth0")
	                  .build();
	          DecodedJWT jwt = verifier.verify(token);
	          return jwt.getClaim("data").asString();
	          
	      } catch (JWTDecodeException exception){
	          return null;
	      } 
	  }
	  
	public static String checkToken(String token_str,String ipAddress) {
		
		String str = "";
		Token token = new Token();
		 Gson gson = new GsonBuilder().create();
		 Calendar calendar = Calendar.getInstance();
		 Date expiredate = null;
		 SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
		 
		try {
			tools.console.println("Auth Key:"+token_str);
			
				str = getDataInToken(token_str);
				tools.console.println("Auth Key Decoded:"+"{\"token\":"+str+"}");
	
				
				
				token = gson.fromJson(str, Token.class);
				tools.console.println(sdf.format(calendar.getTime())+"<>"+token.expiredate);
				
				if(token.app!=null && token.app.equals("IOSAPP") && token.jsessionid.equals("eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9")) {
					tools.console.println("IOS Token active");
					calendar.add(Calendar.HOUR_OF_DAY, 1000);
				}
				else if(Double.parseDouble(sdf.format(calendar.getTime())) > Double.parseDouble(token.expiredate)  ) {
					tools.console.println("Token expired");
					return null;
				}
				else {
					tools.console.println("Token active");
					//calendar.add(Calendar.HOUR_OF_DAY, 6);
					calendar.add(Calendar.MINUTE	, 120);
				}
				tools.console.println(calendar.getTime());
				
				token.setExpiredate(sdf.format(calendar.getTime()));
				//tools.console.println("4");
				str = gson.toJson(token,Token.class);
				str = createToken(str);
				tools.console.println("New Token:"+str);
				return str;
			
		}
		catch(Exception ex) {
			tools.console.println("Error (checkToken):"+ex.getMessage());
			return null;
		}
		
		
	}


	
	
}
