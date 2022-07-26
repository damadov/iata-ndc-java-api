package tools;

import java.text.SimpleDateFormat;

public class appConfig {

	public static Boolean isLive=false;
	public static Boolean debugOn=true; 
	public static Boolean isProduction=false; 
	public static Boolean isBookingEnabled = true;
	  
	public static String xmlContentType = "text/xml;charset=utf-8";
	public static String jsonContentType = "application/json;charset=utf-8";
	public static Boolean isGZIP = true;
	public static String encoding = "UTF-8";
	public static String defaultCurr = "TRY";
	public static String postgreTimeZone = "Europe/Istanbul";
	
	//DEV->
	public static String webUrl = "<your_web_url>";
//	public static String postgredb = "<your_db_ip>"; 
//	public static String postgrepwd = "<your_db_pwd>"; 
	
	public static String encodeSecret = "<your_secret>";
	
	public static Boolean is10Round = false;
	public static Boolean is20Round = false;
	public static Boolean is50Round = false;
	public static Boolean is100Round = false;
	public static int defaultHotelMarkupRatio = 0;
	public int penExtraDays = 0;
	
	public static String radiusUnit = "km";
	public static int radiusValue = 20;
	
	public static int std_timeout = 60; //in seconds
	public static int mid_timeout = 120; //in seconds
	
	
	public static int approve_timelimit = 24; //Hours
	public static SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd");  
	public static SimpleDateFormat sdf_=new SimpleDateFormat("yyyy-MM-dd");  
	public static SimpleDateFormat sdfDetail =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
	
	public static String xmlns_xsd = "http://www.w3.org/2001/XMLSchema";
	public static String xmlns_xsi = "http://www.w3.org/2001/XMLSchema-instance"; 

	
	//KLM Airline Parameters
	public static String klmKey = "<your_klm_key>";
	public static String klmURI = "https://api.klm.com/opendata/flightoffers";
	
	//BA Airline Parameters
	public static String baVersion = "17.2/V1"; //V2
	public static String baUrl = "https://test.api.ba.com/selling-distribution";
	public static String baKey = "<your_ba_key>";
	
	//PC Airline Parameters
	public static String pcVersion = "17.2"; //V2
	public static String pcUrl = "https://prepndc.flypgs.com/CraneNDC/CraneNDCService?wsdl";
	public static String pcUsername = "<your_pc_user>";
	public static String pcPassword = "<your_pc_pwd>";
	
	//SQ Airline Parameters
	public static String sqVersion = "18.1"; 
	public static String sqUrl = "https://nodeA1.test.webservices.amadeus.com/1ASIWNDCSQ";
	public static String sqUsername = "<your_sq_user>";
	public static String sqPassword = "<your_sq_pwd>";
	public static String sqOID = "<your_sq_id>";
	public static String sqWSAP = "<your_sq_wsap>";

}

