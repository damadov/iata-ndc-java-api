package tools;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.io.StringWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import data.Customer;
import data.Flights;
import data.HotelPnr;
import data.OriginDestination;
import data.Passenger;
import data.Pnr;
import data.Ticket;

public class parsingTool {

	private static String tempValue = null;
	private static Node tempNode = null;
	
	public static Document string2Document(String xml) throws IOException, SAXException, ParserConfigurationException {

	    if (xml == null)
	    return null;

	    return inputStream2Document(new ByteArrayInputStream(xml.getBytes()));

	}

	public static Document inputStream2Document(InputStream inputStream) throws IOException, SAXException, ParserConfigurationException {
	    DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
	    newInstance.setNamespaceAware(true);
	    Document parse = newInstance.newDocumentBuilder().parse(inputStream);
	    return parse;
	}
	
	public static String findInnerXML(Node item) {
		StringBuilder resultBuilder = new StringBuilder();
	    try {

	        TransformerFactory transfac = TransformerFactory.newInstance();
	        Transformer trans = transfac.newTransformer();
	        trans.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
	        trans.setOutputProperty(OutputKeys.INDENT, "yes");
	        StringWriter stringWriter = new StringWriter();
	        StreamResult streamResult = new StreamResult(stringWriter);

	            Node child = item;

	            DOMSource source = new DOMSource(child);
	            trans.transform(source, streamResult);

	            resultBuilder.append(stringWriter.toString());
	    } catch (TransformerException e) {
	        //Error handling goes here
	    }
	    return resultBuilder.toString();
		 
	 }
	public static String findValue(Node item,String nodeName) {
		 tempValue = null;
		 parseNode(item,nodeName,"","NODE");
		 return tempValue;
		 
	 }
	 public static String findAttribute(Node item,String nodeName,String attName) {
		 tempValue = null;
		 parseNode(item,nodeName,attName,"ATTR");
		 return tempValue;
		 
	 }
	 public static String findAttribute(Node item,String nodeName,String parentName,String attName) {
		 tempValue = null;
		 parseNode(item,nodeName,attName,"ATTR");
		 return tempValue;
		 
	 }
	 public static String getAttribute(Node item,String attName) {
		 tempValue = null;
		 NamedNodeMap nnm = item.getAttributes();
		 
		 for(int i=0;i<nnm.getLength();i++) {
			 if(nnm.item( i ).toString().startsWith(attName)) {
				 tempValue = nnm.item( i ).getTextContent();
			 }
		 }
		 return tempValue;
		 
	 }
	 
	 public static Node getNode(Node item,String nodeName) {
		 tempNode = null;
		 //parseNode(item,nodeName,"","NODE");
		 searchNode(item,nodeName);
		 return tempNode;
	 }
	 
	 public static String atlasClassDesc(String classCode) {
		 if(classCode.startsWith("C"))
			 return "Business";
		 else if(classCode.startsWith("Y"))
			 return "Economy";
		 else return "Economy";
		 
	 }
	 public static String amadeusClassDesc(String classCode) {
		 if(classCode.equals("A"))
			 return "First";
		 else if(classCode.equals("B"))
			 return "Economy";
		 else if(classCode.equals("C"))
			 return "Business";
		 else if(classCode.equals("D"))
			 return "Business";
		 else if(classCode.equals("E"))
			 return "Shuttle";
		 else if(classCode.equals("F"))
			 return "First";
		 else if(classCode.equals("G"))
			 return "Economy";
		 else if(classCode.equals("H"))
			 return "Economy";
		 else if(classCode.equals("I"))
			 return "Business";
		 else if(classCode.equals("J"))
			 return "Business";
		 else if(classCode.equals("K"))
			 return "Economy";
		 else if(classCode.equals("L"))
			 return "Economy";
		 else if(classCode.equals("M"))
			 return "Economy";
		 else if(classCode.equals("N"))
			 return "Economy";
		 else if(classCode.equals("O"))
			 return "Economy";
		 else if(classCode.equals("P"))
			 return "First";
		 else if(classCode.equals("Q"))
			 return "Economy";
		 else if(classCode.equals("R"))
			 return "Economy";
		 else if(classCode.equals("S"))
			 return "Economy";
		 else if(classCode.equals("T"))
			 return "Economy";
		 else if(classCode.equals("U"))
			 return "Shuttle";
		 else if(classCode.equals("V"))
			 return "Economy";
		 else if(classCode.equals("W"))
			 return "Economy";
		 else if(classCode.equals("X"))
			 return "Economy";
		 else if(classCode.equals("Y"))
			 return "Economy";
		 else if(classCode.equals("Z"))
			 return "Business";
		 else return "Economy";
					 
	 }

/* 
	 A	First Class	N	Economy Class
	 B	Economy Class	O	Economy Class
	 C	Business Class	P	First Class
	 D	Business Class	Q	Economy Class
	 E	Shuttle Class Service	R	Economy Class
	 F	First Class	S	Economy Class
	 G	Economy Class	T	Economy Class
	 H	Economy Class	U	Shuttle Class Service
	 I	Business Class	V	Economy Class
	 J	Business Class Premium	W	Economy Class
	 K	Economy Class	X	Economy Class
	 L	Economy Class	Y	Economy Class
	 M	Economy Class	Z	Business Class
*/
	 
	 public static String node2String(Node node) throws TransformerFactoryConfigurationError, TransformerException {

	        StreamResult xmlOutput = new StreamResult(new StringWriter());
	        Transformer transformer = TransformerFactory.newInstance().newTransformer();
	        transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
	        transformer.transform(new DOMSource(node), xmlOutput);
	        return xmlOutput.getWriter().toString();
	    }
	 
	 public static OriginDestination findOrigDest(OriginDestination[] itemlist,String index,String refNo) {

		 for(int j=0;j<itemlist.length;j++) {
			 if(itemlist[j].getDirectionId().equals(index) && itemlist[j].getRefNumber().equals(refNo)) {
				 return itemlist[j];
			 }
		 }
		 
		 return null;
	 }
	 public static OriginDestination[] findOrigDests(OriginDestination[] itemlist,String index,String refNo) {

		 OriginDestination[] segments = null;
		 
		 for(int j=0;j<itemlist.length;j++) {
			 if(itemlist[j].getDirectionId().equals(index) && itemlist[j].getRefNumber().equals(refNo)) {
				 segments = appendPool.appendOrigDest(segments, itemlist[j]);
			 }
		 }
		 
		 return segments;
	 }
	 
	 public static void searchNode(Node node ,String nodeName) {
		 //tempNode = null;
		 	NodeList nl = node.getChildNodes();
			for ( int i = 0; i < nl.getLength(); i++ )
		  	{
				Node n = nl.item( i );
				
				if(n.getNodeName().equals(nodeName))	
				{
					tempNode = n; 

				}
				
				if ( n.hasChildNodes() )
					searchNode( n ,nodeName);
				
		  	}
			
	 }
	 public static void searchNode(Node node ,String nodeName,String parentName,String attName) {
		 tempNode = null;
		 	NodeList nl = node.getChildNodes();
		 	try {
			for ( int i = 0; i < nl.getLength(); i++ )
		  	{
				Node n = nl.item( i );
				
				if(n.getNodeName().equals(nodeName))	
				{
					tempNode = n; 
						tools.console.println("*******"+nodeName+"->"+node2String(tempNode));
					
				}
				
				if ( n.hasChildNodes() )
					searchNode( n ,nodeName);
				
		  	}
		 	}catch(Exception ex) {
		 		tools.console.println(ex.getMessage());
		 	}
			
	 }

	 private static void parseNode(Node node ,String nodeName,String attrName,String type)
	  {
	  	NodeList nl = node.getChildNodes();
	  	
	  try {
	  	for ( int i = 0; i < nl.getLength(); i++ )
	  	{
	  		Node n = nl.item( i );
	  		
	  		if ( !"#text".equals( n.getNodeName() ) )
	  		{
	  			
	  			NodeList nl2 = n.getChildNodes();
	  			int index = 0;
	  			while ( index < nl2.getLength() && !"#text".equals( nl2.item( index ).getNodeName() ) )
	  				index++;

	  			if ( index < nl2.getLength()  ) {

		  			if(type.equals("NODE") && n.getNodeName().equals(nodeName))	
			  		{
		  				tempNode = n;
			  			tempValue = nl2.item( index ).getNodeValue();
			  			
			  		}
	  			  
	  			}

	  			NamedNodeMap nnm = n.getAttributes();

	  			if ( nnm != null && nnm.getLength() > 0 )
	  			{
	  			  for ( int j = 0; j < nnm.getLength(); j++ ) {
		  				if(n.getNodeName().equals(nodeName) && type.equals("ATTR") && nnm.item( j ).toString().startsWith(attrName))	
				  		{
				  			tempValue = nnm.item( j ).getTextContent();
				  			//tools.console.println("#######"+attrName+"->"+tempValue);
				  		}
	  			  }
	  			}

	  			//tools.console.println( sb.toString() );

	  			if ( n.hasChildNodes() )
	  			  parseNode( n ,nodeName,attrName,type);
	
	  		}
	  	}
	  	
	  	
	  	}catch(Exception ex) {
	  		tools.console.println(ex.getMessage());
	  	}
	  
	  	

	  }
	 
	 public static Pnr parseAmadeusPnr(String res) {
		 Pnr pnr = new Pnr();
		 Customer cust = null;
		 Customer[] custlist = null;
		 Flights flight = new Flights();
		 Flights[] fltlist = null;
		 Ticket ticket = null;
		 Ticket[] tkts = null;
		 
		 try {
				// Use SAX to parse the document
					DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
					DocumentBuilder builder = factory.newDocumentBuilder();
					factory.setNamespaceAware( true );
					InputSource isource = new InputSource( new StringReader( res) );
	
					Document doc = builder.parse( isource );
					
					Node bookRef = doc.getElementsByTagName("BookingReferenceID").item(0);
					pnr.setPnr(parsingTool.getAttribute(bookRef,"ID_Context"));
					
					Node ticketing = doc.getElementsByTagName("Ticketing").item(0);
					pnr.setTimelimit(parsingTool.getAttribute(ticketing,"TicketTimeLimit"));
					if(parsingTool.getAttribute(ticketing,"TicketType").equals("ETicketInstant")) {
						pnr.setIsticketed(true);
					}
					else if(parsingTool.getAttribute(ticketing,"TicketType").equals("BookingOnly")) {
						pnr.setIsticketed(false);
					}
					else {
						pnr.setIsticketed(true);
					}
					
					if(doc.getElementsByTagName("OTA_AirBookRS").getLength()>0) {
						Node ota_airbook = doc.getElementsByTagName("OTA_AirBookRS").item(0);
						String iscancelled = parsingTool.getAttribute(ota_airbook,"Cancel");
						if(iscancelled!=null && iscancelled.equals("true")) {
							pnr.setStatus("CANCELLED");
						}else {
							if(pnr.getIsticketed())
								pnr.setStatus("TICKETED");
							else
								pnr.setStatus("NOTTICKETED");
						}
					}
						
					NodeList travellers = doc.getElementsByTagName("AirTraveler");	
					for(int i=0;i<travellers.getLength();i++) {
						Node item = travellers.item(i);
						cust = new Customer();
						cust.setLastname(parsingTool.findValue(item,"Surname"));
						cust.setFirstname(parsingTool.findValue(item,"GivenName"));
						cust.setTitle(parsingTool.findValue(item,"NamePrefix"));
						cust.setCustomer_type(parsingTool.getAttribute(item,"PassengerTypeCode"));
						cust.setBirthdate(parsingTool.findValue(item,"Birthdate"));
						cust.setEmail(parsingTool.findValue(item,"Email"));
						cust.setTelephone(parsingTool.findValue(item,"Telephone"));

						custlist = appendPool.appendCustomer(custlist,cust);
					}
					if(custlist != null)
						pnr.setCustlist(custlist);
					
					NodeList airitinerary = doc.getElementsByTagName("OriginDestinationOption");	
					for(int i=0;i<airitinerary.getLength();i++) {
						Node item = airitinerary.item(i);
						flight = new Flights();
						String deptime = parsingTool.findAttribute(item,"FlightSegment","DepartureDateTime");
						flight.setDep(parsingTool.findAttribute(item,"DepartureAirport","LocationCode"));
						flight.setArr(parsingTool.findAttribute(item,"ArrivalAirport","LocationCode"));
						flight.setFnumber(parsingTool.findAttribute(item,"FlightSegment","FlightNumber"));
						if(deptime.replaceAll("-", "").length()>8)
							flight.setFdate(deptime.replaceAll("-", "").substring(0, 8));
						flight.setMarketing(parsingTool.findAttribute(item,"MarketingAirline","Code"));
						flight.setOperating(parsingTool.findAttribute(item,"OperatingAirline","Code"));
						if(deptime.split("T")[1].length()>5)
							flight.setFlighttime(deptime.split("T")[1].substring(0, 5));
						fltlist = appendPool.appendFlight(fltlist,flight);
					}
					if(fltlist != null)
						pnr.setFlights(fltlist);
					
					NodeList etickets = doc.getElementsByTagName("ETicketInfo");	
					for(int i=0;i<etickets.getLength();i++) {
						ticket = new Ticket();
						ticket.setPaxNo(Integer.toString(i));
						ticket.setPax(parsingTool.findValue(etickets.item(i), "PassengerName_Surname"));
						ticket.setTktnumber(parsingTool.getAttribute(etickets.item(i), "TicketNumber").replaceAll("-", ""));
						tkts = appendPool.appendTicket(tkts, ticket);
					}
					if(tkts != null) {
						pnr.setTktlist(tkts);
						pnr.setIsticketed(true);
					}
					pnr.setPnrView(" ");
					
				 }catch(Exception ex) {
					 tools.console.println(ex.getMessage());
				 }
		 
		 return pnr;
	 }
	 public static HotelPnr parseAmadeusHotelPnr(String res) {
		 HotelPnr pnr = new HotelPnr();
		 Customer cust = null;
		 Customer[] custlist = null;
		 //Flights flight = new Flights();
		 //Flights[] fltlist = null;
		 //Ticket ticket = null;
		 //Ticket[] tkts = null;
		 
		 try {
				// Use SAX to parse the document
					DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
					DocumentBuilder builder = factory.newDocumentBuilder();
					factory.setNamespaceAware( true );
					InputSource isource = new InputSource( new StringReader( res) );
	
					Document doc = builder.parse( isource );
					
					Node bookRef = doc.getElementsByTagName("UniqueID").item(0);
					pnr.setPnr(parsingTool.getAttribute(bookRef,"ID_Context"));
					
					pnr.setIsticketed(true);
//					Node ticketing = doc.getElementsByTagName("Ticketing").item(0);
//					pnr.setTimelimit(parsingTool.getAttribute(ticketing,"TicketTimeLimit"));
//					if(parsingTool.getAttribute(ticketing,"TicketType").equals("ETicketInstant")) {
//						pnr.setIsticketed(true);
//					}
//					else if(parsingTool.getAttribute(ticketing,"TicketType").equals("BookingOnly")) {
//						pnr.setIsticketed(false);
//					}
//					else {
//						pnr.setIsticketed(true);
//					}
					pnr.setStatus("TICKETED");
//					if(doc.getElementsByTagName("OTA_AirBookRS").getLength()>0) {
//						Node ota_airbook = doc.getElementsByTagName("OTA_AirBookRS").item(0);
//						String iscancelled = parsingTool.getAttribute(ota_airbook,"Cancel");
//						if(iscancelled!=null && iscancelled.equals("true")) {
//							pnr.setStatus("CANCELLED");
//						}else {
//							if(pnr.getIsticketed())
//								pnr.setStatus("TICKETED");
//							else
//								pnr.setStatus("NOTTICKETED");
//						}
//					}
						
					NodeList travellers = doc.getElementsByTagName("ResGuest");	
					for(int i=0;i<travellers.getLength();i++) {
						Node item = travellers.item(i);
						cust = new Customer();
						cust.setLastname(parsingTool.findValue(item,"Surname"));
						cust.setFirstname(parsingTool.findValue(item,"GivenName"));
						cust.setTitle(parsingTool.findValue(item,"NamePrefix"));
//						cust.setCusttype(parsingTool.getAttribute(item,"PassengerTypeCode"));
//						cust.setBirthdate(parsingTool.findValue(item,"Birthdate"));
//						cust.setEmail(parsingTool.findValue(item,"Email"));
//						cust.setTelephone(parsingTool.findValue(item,"Telephone"));

						custlist = appendPool.appendCustomer(custlist,cust);
					}
					if(custlist != null)
						pnr.setCustlist(custlist);
					
					Node hotelstay = doc.getElementsByTagName("HotelStay").item(0);	
					if(hotelstay!=null) {
						pnr.setHotelCode(parsingTool.getAttribute(hotelstay, "HotelCode"));
						pnr.setHotelName(parsingTool.getAttribute(hotelstay, "HotelName"));
						pnr.setHotelImage(parsingTool.findValue(hotelstay, "ThumbnailImage"));
						pnr.setLatitude(parsingTool.findAttribute(hotelstay, "Position", "Latitude"));
						pnr.setLongitude(parsingTool.findAttribute(hotelstay, "Position", "Longitude"));
						pnr.setRating(parsingTool.findAttribute(hotelstay, "Award", "Rating"));
						pnr.setMinRate(parsingTool.findAttribute(hotelstay, "RateRange", "MinRate"));
						pnr.setMaxRate(parsingTool.findAttribute(hotelstay, "RateRange", "MaxRate"));
					}
					
//					for(int i=0;i<airitinerary.getLength();i++) {
//						Node item = airitinerary.item(i);
//						flight = new Flights();
//						String deptime = parsingTool.findAttribute(item,"FlightSegment","DepartureDateTime");
//						flight.setDep(parsingTool.findAttribute(item,"DepartureAirport","LocationCode"));
//						flight.setArr(parsingTool.findAttribute(item,"ArrivalAirport","LocationCode"));
//						flight.setFnumber(parsingTool.findAttribute(item,"FlightSegment","FlightNumber"));
//						if(deptime.replaceAll("-", "").length()>8)
//							flight.setFdate(deptime.replaceAll("-", "").substring(0, 8));
//						flight.setMarketing(parsingTool.findAttribute(item,"MarketingAirline","Code"));
//						flight.setOperating(parsingTool.findAttribute(item,"OperatingAirline","Code"));
//						if(deptime.split("T")[1].length()>5)
//							flight.setFlighttime(deptime.split("T")[1].substring(0, 5));
//						fltlist = appendPool.appendFlight(fltlist,flight);
//					}
//					if(fltlist != null)
//						pnr.setFlights(fltlist);
					
//					NodeList etickets = doc.getElementsByTagName("ETicketInfo");	
//					for(int i=0;i<etickets.getLength();i++) {
//						ticket = new Ticket();
//						ticket.setPaxNo(Integer.toString(i));
//						ticket.setPax(parsingTool.findValue(etickets.item(i), "PassengerName_Surname"));
//						ticket.setTktnumber(parsingTool.getAttribute(etickets.item(i), "TicketNumber").replaceAll("-", ""));
//						tkts = appendPool.appendTicket(tkts, ticket);
//					}
//					if(tkts != null) {
//						pnr.setTktlist(tkts);
//						pnr.setIsticketed(true);
//					}
//					pnr.setPnrView(" ");
					
				 }catch(Exception ex) {
					 tools.console.println(ex.getMessage());
				 }
		 
		 return pnr;
	 }
	 public static Pnr parseAtlasPnr(String res) {
		 Pnr pnr = new Pnr();
		 Customer cust = null;
		 Customer[] custlist = null;
		 Flights flight = new Flights();
		 Flights[] fltlist = null;
		 Ticket ticket= new Ticket();
		 Ticket[] tktlist = null;
		 
		 try {
		// Use SAX to parse the document
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			factory.setNamespaceAware( true );
			InputSource isource = new InputSource( new StringReader( res) );
	
			Document doc = builder.parse( isource );
			
			Node bookRef = doc.getElementsByTagName("bookingInfoReturn").item(0);
			for(int i=0;i<bookRef.getChildNodes().getLength();i++) {
				if(bookRef.getChildNodes().item(i).getNodeName().equals("pnrnumber"))
					pnr.setPnr(bookRef.getChildNodes().item(i).getTextContent());
				if(bookRef.getChildNodes().item(i).getNodeName().equals("status"))
					pnr.setStatus(bookRef.getChildNodes().item(i).getTextContent());
			}
			pnr.setTimelimit("");
			if(pnr.getStatus().equals("TICKETED")) {
				pnr.setIsticketed(true);
			}else {
				pnr.setIsticketed(false);
			}

			NodeList travellers = doc.getElementsByTagName("BookingInfoPassengersData");	
			for(int i=0;i<travellers.getLength();i++) {
				Node item = travellers.item(i);
				cust = new Customer();
				String pax = parsingTool.findValue(item,"passengerName");
				cust.setLastname(pax.split(" ")[0]);
				cust.setTitle(pax.split(" ")[pax.split(" ").length-1]);
				cust.setFirstname(pax.replaceAll(cust.getLastname(), "").replaceAll(cust.getTitle(), "").replaceAll(" ", ""));
				cust.setCustomer_type(parsingTool.findValue(item,"passengerType"));
				cust.setBirthdate(parsingTool.findValue(item,"birthDate"));
				cust.setEmail(parsingTool.findValue(item,"email"));
				cust.setTelephone(parsingTool.findValue(item,"phoneNumber"));
				
				custlist = appendPool.appendCustomer(custlist,cust);
				
				ticket = new Ticket();
				ticket.setPaxNo(Integer.toString(i));
				ticket.setTktnumber(parsingTool.findValue(item, "ticketNumber"));

				tktlist = appendPool.appendTicket(tktlist,ticket);
			}
			if(custlist != null)
				pnr.setCustlist(custlist);
			if(tktlist != null)
				pnr.setTktlist(tktlist);
			
			NodeList airitinerary = doc.getElementsByTagName("leg");	
			for(int i=0;i<airitinerary.getLength();i++) {
				Node item = airitinerary.item(i);
				flight = new Flights();
				flight.setDep(parsingTool.findValue(item,"depcode"));
				flight.setArr(parsingTool.findValue(item,"arrcode"));
				flight.setFnumber(parsingTool.findValue(item,"flightno").replaceAll("KK", ""));
				flight.setMarketing("KK");
				flight.setOperating(parsingTool.findValue(item,"opcarrier"));
				flight.setFdate(formatYYYYMMDD(parsingTool.findValue(item, "depdate")));
				flight.setFlighttime(parsingTool.findValue(item, "deptime"));
				fltlist = appendPool.appendFlight(fltlist,flight);
			}
			if(fltlist != null)
				pnr.setFlights(fltlist);
			
			pnr.setPnrView(" ");
			
		 }catch(Exception ex) {
			 tools.console.println(ex.getMessage());
			 return null;
		 }
		 
		 return pnr;
	 }
	 
	 public static Pnr parseTKPnr(String res) {
		 Pnr pnr = new Pnr();
		 Customer cust = null;
		 Customer[] custlist = null;
		 Flights flight = new Flights();
		 Flights[] fltlist = null;
		 Ticket ticket = new Ticket();
		 Ticket[] tktlist = null;
		 
		 try {
				// Use SAX to parse the document
					DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
					DocumentBuilder builder = factory.newDocumentBuilder();
					factory.setNamespaceAware( true );
					InputSource isource = new InputSource( new StringReader( res) );
	
					Document doc = builder.parse( isource );
					
					if(doc.getElementsByTagName( "m:getPnrResponse" ).getLength()>0) {
						String temp = doc.getElementsByTagName( "m:getPnrResponse" ).item(0).getTextContent();
						//tools.console.println("Text:"+temp);
						InputSource source = new InputSource( new StringReader( temp) );
						Document pnrdoc = builder.parse( source );
						//tools.console.println("Content:"+pnrdoc.getElementsByTagName("PNR").item(0).getTextContent());
						
						Node bookref = pnrdoc.getElementsByTagName("PNR").item(0);
						
						pnr.setPnr(parsingTool.findValue(bookref, "pnrNumber").replaceAll("TK", ""));
						
						pnr.setTimelimit("");
						if(res.split("SSRTKNETKHK1").length>1) {
							pnr.setIsticketed(true);
						}
						else
							pnr.setIsticketed(false);
						
						if(pnr.getIsticketed())
							pnr.setStatus("TICKETED");
						else
							pnr.setStatus("NOTTICKETED");
						
						/*if(parsingTool.findValue(bookref, "itinerary").equals("NO ITIN")) {
							pnr.setIsticketed(false);
						}else {
							pnr.setIsticketed(true);
						}
						if(pnr.getIsticketed())
							pnr.setStatus("TICKETED");
						else
							pnr.setStatus("NOTTICKETED");
						*/
						//
					tools.console.println("Data:"+parsingTool.node2String(pnrdoc.getElementsByTagName("data").item(0)));
						NodeList fields1 = pnrdoc.getElementsByTagName("field");	
						for(int i=0;i<fields1.getLength();i++) {
							Node item = fields1.item(i);
							
							if(parsingTool.getAttribute(item, "name").equals("TKT")) {
								NodeList tickets = item.getChildNodes();
								for(int j=0;j<tickets.getLength();j++) {
									Node subitem = tickets.item(j);
									ticket = new Ticket();
									try{ticket.setTktnumber(parsingTool.findValue(subitem, "text").split(" ")[1]);}catch(Exception ex){}
									
									tktlist = appendPool.appendTicket(tktlist, ticket);
								}
								
							}
							
							
						}
						pnr.setTktlist(tktlist);
						
						NodeList segments = pnrdoc.getElementsByTagName("segment");	
						for(int i=0;i<segments.getLength();i++) {
							Node item = segments.item(i);
							flight = new Flights();
							//tools.console.println("Segment:"+parsingTool.node2String(item));
							//tools.console.println("Flight:"+parsingTool.findValue(item, "flightNumber").replaceAll("TK", ""));
							flight.setIndex(parsingTool.findValue(item, "index"));
							flight.setFnumber(parsingTool.findValue(item, "flightNumber").replaceAll("TK", ""));
							flight.setArr(parsingTool.findValue(item, "to"));
							flight.setDep(parsingTool.findValue(item, "from"));
							
							flight.setFdate(formatDDMMM(parsingTool.findValue(item, "date")));
							flight.setMarketing("TK");
							flight.setOperating(parsingTool.findValue(item, "operatingAirline"));
							flight.setStatus(parsingTool.findValue(item, "actionCode"));
							flight.setFlighttime(parsingTool.findValue(item, "departureTime").substring(0, 2)+":"+parsingTool.findValue(item, "departureTime").substring(2, 4));
						
							//flight.setArrivalOnNextDay(Boolean.parseBoolean(parsingTool.findValue(item, "isArrivalOnNextDay")));
							//tools.console.println("Flight:"+flight.getFnumber());
							fltlist = appendPool.appendFlight(fltlist, flight);
							
						}
						pnr.setFlights(fltlist);
						
						NodeList travellers = pnrdoc.getElementsByTagName("Passenger");	
						//tools.console.println(parsingTool.node2String(travellers.item(0)));
						for(int i=0;i<travellers.getLength();i++) {
							Node item = travellers.item(i);
							cust = new Customer();
							cust.setLastname(parsingTool.findValue(item, "surname"));
							cust.setTitle(parsingTool.findValue(item, "title"));
							cust.setFirstname(parsingTool.findValue(item, "name"));
							cust.setIndex(Integer.toString(i));
							//cust.setCusttype(parsingTool.findValue(item,"passengerType"));
							//cust.setBirthdate(parsingTool.findValue(item,"birthDate"));
							//cust.setEmail(parsingTool.findValue(item,"email"));
							//cust.setTelephone(parsingTool.findValue(item,"phoneNumber"));

							custlist = appendPool.appendCustomer(custlist,cust);
						}
						if(custlist != null)
							pnr.setCustlist(custlist);
						tools.console.println("0");
						//pnr.setPnrView(parsingTool.findValue(bookref, "pnrView"));
						NodeList fields = pnrdoc.getElementsByTagName("field");	
						for(int i=0;i<fields.getLength();i++) {		
							if(parsingTool.getAttribute(fields.item(i), "name").equals("TL")) {
								String timelimit = parsingTool.findValue(fields.item(i), "text");
								//tools.console.println("Time Limit:"+timelimit);
								//pnr.setTimelimit(timelimit.split("/")[timelimit.split("/").length-1].substring(0, 5)+" "+timelimit.split("/")[1]);
							}
							else if(parsingTool.getAttribute(fields.item(i), "name").equals("AP FAX")) {
								//NodeList items = fields.item(i).getChildNodes();
								//for(int j=0;j<items.getLength();j++) {
								//	Node subitem = items.item(j);
									//if(parsingTool.findValue(subitem, "text").split("SSRTKNETKHK1").length>1) {
										//tools.console.println(parsingTool.findValue(subitem, "text"));
										//ticket = new Ticket();
										//ticket.setTktnumber(parsingTool.findValue(items.item(j), "text").split("SSRTKNETKHK1")[1].replaceAll(" ", ""));
									//}
								//}
							}
							/*else if(parsingTool.getAttribute(fields.item(i), "name").equals("TKT")) {
								NodeList tickets = fields.item(i).getChildNodes();
								//tools.console.println("3");

									//tools.console.println(parsingTool.node2String(fields.item(i)));
									String tkttext = parsingTool.findValue(fields.item(i), "text").split(" ")[1];  
									//tools.console.println("TKT:"+tkttext);
									for(int z=0;z<tkttext.split("/").length;z++) {
										String str = tkttext.split("/")[z];
										ticket = new Ticket();
										try{
											//tools.console.println("TKT:"+str);
											if(str.length()<10) {
												str = tkttext.split("/")[0].substring(0, tkttext.split("/")[0].length()-str.length())+str;
											}
											ticket.setTktnumber(str);
											//ticket.setPaxNo();
										}catch(Exception ex){}
										
										tktlist = appendPool.appendTicket(tktlist, ticket);
									}
								
								
							}*/
							
						}
						pnr.setTktlist(tktlist);
						
						
					}
					
					
				 }catch(Exception ex) {
					 tools.console.println(ex.getMessage());
				 }
		 
		 return pnr;
	 }
	 
	 public static Pnr parseTKPnrTktt(Pnr pnr,String res) {

		//Pnr pnr = new Pnr();
			Customer cust = null;
			Customer[] custlist = null;
			Flights flight = new Flights();
			Flights[] fltlist = null;
			Ticket ticket = new Ticket();
			Ticket[] tktlist = null;
			Gson gson = new GsonBuilder().create();
			Passenger pax=null;
			Passenger paxes = null;

			try {
				// Use SAX to parse the document
				DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
				DocumentBuilder builder = factory.newDocumentBuilder();
				factory.setNamespaceAware(true);
				InputSource isource = new InputSource(new StringReader(res));

				Document doc = builder.parse(isource);

				if(pnr ==null)
					pnr = new Pnr();
					
				//if (doc.getElementsByTagName("m:getPnrResponse").getLength() > 0) {
				//	String temp = doc.getElementsByTagName("m:getPnrResponse").item(0).getTextContent();
				if (doc.getElementsByTagName("m:return").getLength() > 0) {
					String temp = doc.getElementsByTagName("m:return").item(0).getTextContent();	
					Node tempnode = parsingTool.string2Document(temp);
					if(parsingTool.findValue(tempnode, "itinerary").contains("NO ITIN")) {
						pnr.setStatus("CANCELLED");
					}
					
					// tools.console.println("Text:"+temp);
					InputSource pnrsource = new InputSource(new StringReader(temp));
					Document pnrdoc = builder.parse(pnrsource);
					tools.console.println("Data:"+temp);

					tools.console.println("Cnt:"+pnrdoc.getElementsByTagName("Passenger").getLength());
					NodeList travellers = pnrdoc.getElementsByTagName("Passenger");
					// tools.console.println(parsingTool.node2String(travellers.item(0)));
					for (int i = 0; i < travellers.getLength(); i++) {
						Node item = travellers.item(i);
						cust = new Customer();
						cust.setLastname(parsingTool.findValue(item, "surname"));
						cust.setTitle(parsingTool.findValue(item, "title"));
						cust.setFirstname(parsingTool.findValue(item, "name"));
						cust.setIndex(Integer.toString(i));

						custlist = appendPool.appendCustomer(custlist, cust);
					}

					tools.console.println("0");
					// pnr.setPnrView(parsingTool.findValue(bookref, "pnrView"));
				for(int it =0;it<pnrdoc.getElementsByTagName("data").getLength();it++)
				{
					NodeList fields = pnrdoc.getElementsByTagName("field");
					for (int i = 0; i < fields.getLength(); i++) {
						if (parsingTool.getAttribute(fields.item(i), "name").equals("TKT")) {
							//NodeList tickets = fields.item(i).getChildNodes();
							// tools.console.println("3");

							// tools.console.println(parsingTool.node2String(fields.item(i)));
							String tkttext = parsingTool.findValue(fields.item(i), "text").split(" ")[1];
							 tools.console.println("TKT:"+tkttext);
							 /*
							  * <field name="TKT" >
								<item>
								<index>1</index>
								<text>Y27DEC1PCWS 2352341626767</text>
								</item>
								</field>
							  */
							if(tkttext.contains("/")) {
							for (int z = 0; z < tkttext.split("/").length; z++) {
								String str = tkttext.split("/")[z];
								if(str.toCharArray().length>10) {
									ticket = new Ticket();
									try {
										// tools.console.println("TKT:"+str);
										if (str.length() < 10) {
											str = tkttext.split("/")[0].substring(0,
													tkttext.split("/")[0].length() - str.length()) + str;
										}
										ticket.setTktnumber(str);
										ticket.setPaxType("ADT");
										ticket.setPaxNo("0");
										ticket.setStatus("OK");
										ticket.setFareCalculation("");
										ticket.setTicketingDate("");
										ticket.setPax("");
										
										
									} catch (Exception ex) {
									}

								tktlist = appendPool.appendTicket(tktlist, ticket);
								}
							}
							}else {
								if(tkttext.toCharArray().length>10) {
									ticket = new Ticket();
									ticket.setTktnumber(tkttext);
									ticket.setPaxType("ADT");
									ticket.setPaxNo("0");
									ticket.setStatus("OK");
									ticket.setFareCalculation("");
									ticket.setTicketingDate("");
									ticket.setPax("");
									
									tktlist = appendPool.appendTicket(tktlist, ticket);
								}
								
							}

						}

					}
				}
					
				
				
				if(tktlist!=null) {
					tools.console.println(gson.toJson(tktlist,Ticket[].class));
					pnr.setStatus("TICKETED");
					tools.console.println("TK Tickets:"+gson.toJson(tktlist,Ticket[].class));
					for(int cl=0;cl<custlist.length;cl++) {
						for(int tk=0;tk<tktlist.length;tk++) {
							if(cl==tk) {
								tktlist[tk].setPax(custlist[cl].lastname +"/"+ custlist[cl].firstname +" "+ custlist[cl].title);
							}
						}
					}
					pnr.setTktlist(tktlist);
				}

				}

			} catch (Exception ex) {
				tools.console.println(ex.getMessage());
			}

			return pnr;
					
	 }
	 public static Pnr parseTKPnrN(Pnr pnr,String res) {
			//Pnr pnr = new Pnr();
			Customer cust = null;
			Customer[] custlist = null;
			Flights flight = new Flights();
			Flights[] fltlist = null;
			Ticket ticket = new Ticket();
			Ticket[] tktlist = null;
			Gson gson = new GsonBuilder().create();
			Passenger pax=null;
			Passenger paxes = null;

			try {
				// Use SAX to parse the document
				DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
				DocumentBuilder builder = factory.newDocumentBuilder();
				factory.setNamespaceAware(true);
				InputSource isource = new InputSource(new StringReader(res));

				Document doc = builder.parse(isource);

				if(pnr ==null)
					pnr = new Pnr();
					
				//if (doc.getElementsByTagName("m:getPnrResponse").getLength() > 0) {
				//	String temp = doc.getElementsByTagName("m:getPnrResponse").item(0).getTextContent();
				if (doc.getElementsByTagName("m:return").getLength() > 0) {
					String temp = doc.getElementsByTagName("m:return").item(0).getTextContent();	
					Node tempnode = parsingTool.string2Document(temp);
					if(parsingTool.findValue(tempnode, "itinerary").contains("NO ITIN")) {
						pnr.setStatus("CANCELLED");
					}
					
					// tools.console.println("Text:"+temp);
					InputSource pnrsource = new InputSource(new StringReader(temp));
					Document pnrdoc = builder.parse(pnrsource);
					tools.console.println("Data:"+temp);

					
					Node bookref = doc.getElementsByTagName("PNR").item(0);
					
						
					pnr.setPnr(parsingTool.findValue(bookref, "pnrNumber").replaceAll("TK", ""));
					//tools.console.println("Pnr:"+parsingTool.findValue(bookref, "pnrNumber"));
					pnr.setTimelimit("");
					if (res.split("SSRTKNETKHK1").length > 1) {
						pnr.setIsticketed(true);
					} else
						pnr.setIsticketed(false);

					if (pnr.getIsticketed())
						pnr.setStatus("TICKETED");
					else
						pnr.setStatus("NOTTICKETED");

					/*
					 * if(parsingTool.findValue(bookref, "itinerary").equals("NO ITIN")) {
					 * pnr.setIsticketed(false); }else { pnr.setIsticketed(true); }
					 * if(pnr.getIsticketed()) pnr.setStatus("TICKETED"); else
					 * pnr.setStatus("NOTTICKETED");
					 */
					//
					//tools.console.println("Data:" + parsingTool.node2String(pnrdoc.getElementsByTagName("data").item(0)));
					/*
					 * NodeList fields = pnrdoc.getElementsByTagName("field"); for(int
					 * i=0;i<fields.getLength();i++) { Node item = fields.item(i);
					 * 
					 * if(parsingTool.getAttribute(item, "name").equals("TKT")) { NodeList tickets =
					 * item.getChildNodes(); for(int j=0;j<tickets.getLength();j++) { Node subitem =
					 * tickets.item(j); ticket = new Ticket();
					 * try{ticket.setTktnumber(parsingTool.findValue(subitem,
					 * "text").split(" ")[1]);}catch(Exception ex){}
					 * 
					 * tktlist = appendPool.appendTicket(tktlist, ticket); }
					 * 
					 * }
					 * 
					 * 
					 * } pnr.setTktlist(tktlist);
					 */

				/*	NodeList segments = pnrdoc.getElementsByTagName("segment");
					for (int i = 0; i < segments.getLength(); i++) {
						Node item = segments.item(i);
						flight = new Flights();
						// tools.console.println("Segment:"+parsingTool.node2String(item));
						// tools.console.println("Flight:"+parsingTool.findValue(item,
						// "flightNumber").replaceAll("TK", ""));
						flight.setIndex(parsingTool.findValue(item, "index"));
						flight.setFnumber(parsingTool.findValue(item, "flightNumber").replaceAll("TK", ""));
						flight.setArr(parsingTool.findValue(item, "to"));
						flight.setDep(parsingTool.findValue(item, "from"));

						flight.setFdate(formatDDMMM(parsingTool.findValue(item, "date")));
						flight.setMarketing("TK");
						flight.setOperating(parsingTool.findValue(item, "operatingAirline"));
						flight.setStatus(parsingTool.findValue(item, "actionCode"));
						flight.setFlighttime(parsingTool.findValue(item, "departureTime").substring(0, 2) + ":"
								+ parsingTool.findValue(item, "departureTime").substring(2, 4));

						// flight.setArrivalOnNextDay(Boolean.parseBoolean(parsingTool.findValue(item,
						// "isArrivalOnNextDay")));
						// tools.console.println("Flight:"+flight.getFnumber());
						fltlist = appendPool.appendFlight(fltlist, flight);

					}
					pnr.setFlights(fltlist);*/

					NodeList travellers = pnrdoc.getElementsByTagName("Passenger");
					// tools.console.println(parsingTool.node2String(travellers.item(0)));
					for (int i = 0; i < travellers.getLength(); i++) {
						Node item = travellers.item(i);
						cust = new Customer();
						cust.setLastname(parsingTool.findValue(item, "surname"));
						cust.setTitle(parsingTool.findValue(item, "title"));
						cust.setFirstname(parsingTool.findValue(item, "name"));
						cust.setIndex(Integer.toString(i));
						// cust.setCusttype(parsingTool.findValue(item,"passengerType"));
						// cust.setBirthdate(parsingTool.findValue(item,"birthDate"));
						// cust.setEmail(parsingTool.findValue(item,"email"));
						// cust.setTelephone(parsingTool.findValue(item,"phoneNumber"));

						custlist = appendPool.appendCustomer(custlist, cust);
					}
					//if (custlist != null)
					//	pnr.setCustlist(custlist);
					
					tools.console.println("0");
					// pnr.setPnrView(parsingTool.findValue(bookref, "pnrView"));
				for(int it =0;it<pnrdoc.getElementsByTagName("data").getLength();it++)
				{
					//Node parnode = pnrdoc.getElementsByTagName("data").item(it);
					//NodeList fields = parnode.getChildNodes();
					NodeList fields = pnrdoc.getElementsByTagName("field");
					for (int i = 0; i < fields.getLength(); i++) {
						if (parsingTool.getAttribute(fields.item(i), "name").equals("TL")) {
							//String timelimit = parsingTool.findValue(fields.item(i), "text");
							// tools.console.println("Time Limit:"+timelimit);
							// pnr.setTimelimit(timelimit.split("/")[timelimit.split("/").length-1].substring(0,
							// 5)+" "+timelimit.split("/")[1]);
						} else if (parsingTool.getAttribute(fields.item(i), "name").equals("AP FAX")) {
							// NodeList items = fields.item(i).getChildNodes();
							// for(int j=0;j<items.getLength();j++) {
							// Node subitem = items.item(j);
							// if(parsingTool.findValue(subitem, "text").split("SSRTKNETKHK1").length>1) {
							// tools.console.println(parsingTool.findValue(subitem, "text"));
							// ticket = new Ticket();
							// ticket.setTktnumber(parsingTool.findValue(items.item(j),
							// "text").split("SSRTKNETKHK1")[1].replaceAll(" ", ""));
							// }
							// }
						} else if (parsingTool.getAttribute(fields.item(i), "name").equals("TKT")) {
							//NodeList tickets = fields.item(i).getChildNodes();
							// tools.console.println("3");

							// tools.console.println(parsingTool.node2String(fields.item(i)));
							String tkttext = parsingTool.findValue(fields.item(i), "text").split(" ")[1];
							 tools.console.println("TKT:"+tkttext);
							if(tkttext.contains("/")) {
							for (int z = 0; z < tkttext.split("/").length; z++) {
								String str = tkttext.split("/")[z];
								ticket = new Ticket();
								try {
									// tools.console.println("TKT:"+str);
									if (str.length() < 10) {
										str = tkttext.split("/")[0].substring(0,
												tkttext.split("/")[0].length() - str.length()) + str;
									}
									ticket.setTktnumber(str);
									ticket.setPaxType("ADT");
									ticket.setPaxNo("0");
									ticket.setStatus("OK");
									ticket.setFareCalculation("");
									ticket.setTicketingDate("");
									ticket.setPax("");
									
									
								} catch (Exception ex) {
								}

								tktlist = appendPool.appendTicket(tktlist, ticket);
							}
							}else {
								ticket = new Ticket();
								ticket.setTktnumber(tkttext);
								ticket.setPaxType("ADT");
								ticket.setPaxNo("0");
								ticket.setStatus("OK");
								ticket.setFareCalculation("");
								ticket.setTicketingDate("");
								ticket.setPax("");
								
								tktlist = appendPool.appendTicket(tktlist, ticket);
								
								/*
								 * "tktnumber": "2202676027903",
							      "pax": "AKDOGAN/SERMIN MRS",
							      "paxNo": "0",
							      "status": "OK",
							      "fareCalculation": "IST LH FRA118.00NUC118.00END ROE1.000000",
							      "ticketingDate": "2018-12-09T02:49:43.3875906+00:00",
							      "cust_guid": "3143bf87-4770-444f-8de8-2c1b76ae7458"
								 */
							}

						}

					}
				}
					
				
				
				if(tktlist!=null) {
					tools.console.println("TK Tickets:"+gson.toJson(tktlist,Ticket[].class));
					for(int cl=0;cl<custlist.length;cl++) {
						for(int tk=0;tk<tktlist.length;tk++) {
							if(cl==tk) {
								tktlist[tk].setPax(custlist[cl].lastname +"/"+ custlist[cl].firstname +" "+ custlist[cl].title);
							}
						}
					}
					pnr.setTktlist(tktlist);
				}

				}

			} catch (Exception ex) {
				tools.console.println(ex.getMessage());
			}

			return pnr;
		}
	 
	 public static String parseTime(String str) {
		 String res = "P0DT1H15M0.000S";
		 String day = "0";
		 String hour = "0";
		 String min = "0";
		 //P0DT1H15M0.000S
		 
		 res = res.replaceAll("P", "");
		 day = res.split("DT")[0];
		 hour = res.split("DT")[1].split("H")[0];
		 min = res.split("DT")[1].split("H")[1].split("M")[0];
		 
		 //res = res.split("DT")[1].split("H")[0]+" saat "+res.split("DT")[1].split("H")[1].split("M")[0]+" dakika ";
		 if(hour.toCharArray().length == 1)
			 hour = "0"+hour;
		 
		 res = hour+min;
		 
		 return res;
	 }
	 
	 public static String formatDate(String currdate) {
		 String str = "01SEP";
		 Date date;
		try {
			
			date = new SimpleDateFormat("yyyy-MM-dd").parse(currdate);
			str = new SimpleDateFormat("ddMMM").format(date);
			tools.console.println("Date Formatted:"+str);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		 
		 return str;
	 }
	 
	 public static String formatYYYYMMDD(String currdate) {
		 String str = "01SEP";
		 Date date;
		try {
			
			date = new SimpleDateFormat("yyyyMMdd").parse(currdate);
			str = new SimpleDateFormat("yyyy-MM-dd").format(date);

		} catch (ParseException e) {
			e.printStackTrace();
		}
		 
		 return str;
	 }
	 

	 
	 public static String formatDDMMM(String currdate) {
		 String str="";
		 Date date;

		 int year = Calendar.getInstance().get(Calendar.YEAR);

		try {
			
			date = new SimpleDateFormat("ddMMM").parse(currdate);
			str = new SimpleDateFormat(year+"-MM-dd").format(date);

		if(!isBigger(str)) {
			year = year + 1;
			str = new SimpleDateFormat(year+"-MM-dd").format(date);
		}
		
			//tools.console.println("Date Formatted:"+str);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		 
		 return str;
	 }
	 
	 public static Boolean isBigger(String stringDate) {
		 //final String stringDate = "2014-07-17 23:59";

		    SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd");
		    Date date;
			try {
				date = inputFormat.parse(stringDate);
			
	
			    Calendar calendarDate = Calendar.getInstance();
			    calendarDate.setTime(date);
	
			    Calendar midnight = Calendar.getInstance();
			    midnight.set(Calendar.HOUR_OF_DAY, 0);
			    midnight.set(Calendar.MINUTE, 0);
			    midnight.set(Calendar.SECOND, 0);
			    midnight.set(Calendar.MILLISECOND, 0);
	
			    if (calendarDate.compareTo(midnight) >= 0)
			    {
			        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm");
			        tools.console.println(timeFormat.format(date));
			        return true;
			    }
			    else
			    {
			        SimpleDateFormat dateTimeForm = new SimpleDateFormat("dd/MM/yyyy HH:mm");
			        tools.console.println(dateTimeForm.format(date));
			        return false;
			    }
			} catch (ParseException e) {

				e.printStackTrace();
				return false;
			}
	 }
}
