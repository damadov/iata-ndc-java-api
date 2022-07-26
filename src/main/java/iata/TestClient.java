package iata;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.UUID;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import data.Pnr;
import data.bookFlightParams;
import data.searchParams;
import tools.soapHeader;


public class TestClient
{
	public static String ndcAirlines_181(searchParams sparams,String airline,String key,String username,String password,String url,String soapAction) throws IOException
	{
		CloseableHttpClient httpClient = HttpClientBuilder.create().setUserAgent( "TestClient" ).build();

		try
		{
			// Make a request to the airline
			HttpPost request = new HttpPost( url ); 
			
			InputStreamReader is = new InputStreamReader(TestClient.class.getResourceAsStream( "/resources/AirShoppingRQ_181.xml" ) );
			
			
			StringBuilder sb = new StringBuilder();
			BufferedReader br = new BufferedReader( is );
			String read = br.readLine();
			
			
			String psgRef = "CR."+UUID.randomUUID().toString();
			String birthdate = "1990-01-01";
			
			String party = "";
			party = "<TravelAgency>\n"
					+ "                        <AgencyID>SINSQ08NE</AgencyID>\n"
					+ "                        <IATA_Number>12345678</IATA_Number>\n"
					+ "                    </TravelAgency>";
			
			String traveler = "";
			traveler= "<Pax>\n"
					+ "                        <PaxID>PAX1</PaxID>\n"
					+ "                        <PTC>ADT</PTC>\n"
					+ "                    </Pax>\n"
					+ "                    <Pax>\n"
					+ "                        <PaxID>PAX11</PaxID>\n"
					+ "                        <PTC>INF</PTC>\n"
					+ "                    </Pax>";
			
			String origdestination = "";
			origdestination = "<OriginDestRequest>\n"
					+ "                        <OriginDepRequest>\n"
					+ "                            <IATA_LocationCode>DEL</IATA_LocationCode>\n"
					+ "                            <Date>2021-06-08</Date>\n"
					+ "                        </OriginDepRequest>\n"
					+ "                        <DestArrivalRequest>\n"
					+ "                            <IATA_LocationCode>SIN</IATA_LocationCode>\n"
					+ "                        </DestArrivalRequest>\n"
					+ "                    </OriginDestRequest>";
			
			String criteria = "";
			criteria = "<CabinTypeCriteria>\n"
					+ "                        <CabinTypeName>ECO</CabinTypeName>\n"
					+ "                    </CabinTypeCriteria>";
			
			
			while( read != null )
			{
				read = read.replaceAll("#SOAPHEADER#",soapHeader.soapenvHeader("18.1", airline));
				read = read.replaceAll("#TRAVELAGENCY#", party).replaceAll("#AIRLINECODE#", airline.toUpperCase());
				read = read.replaceAll("#CRITERIA#", criteria).replaceAll("#TRAVELER#", traveler).replaceAll("#ORIGDEST#", origdestination);
				sb.append( read );
				read = br.readLine();

			}

			request = soapHeader.requestheader(request, airline, soapAction);
			

			StringEntity params = new StringEntity ( sb.toString() );
			request.setEntity( params );

			System.out.println( "Sending request body:" );
			System.out.println( sb.toString() );
			HttpResponse response = httpClient.execute( request );

			// Read the response
			is = new InputStreamReader( response.getEntity().getContent() );
			sb = new StringBuilder();
			br = new BufferedReader( is );
			read = br.readLine();

			while( read != null )
			{
				sb.append( read );
				read = br.readLine();
			}

			System.out.println( "------------------------------------------------------------" );
			System.out.println( "Result "+airline+" NDC 18.1 : ["+soapAction+"]" );
			System.out.println( sb.toString() );
			System.out.println( "------------------------------------------------------------" );

			
			return sb.toString();
		}
		catch ( Exception ex )
		{
			ex.printStackTrace();
			return ex.getMessage();
		}
		finally
		{
			httpClient.close();
		}
	}
	
	public static String ndcAirlines(searchParams sparams,String airline,String key,String username,String password,String url,String soapAction) throws IOException
	{
		CloseableHttpClient httpClient = HttpClientBuilder.create().setUserAgent( "TestClient" ).build();

		try
		{
			// Make a request to the airline
			HttpPost request = new HttpPost( url ); 
			
			//InputStreamReader is = new InputStreamReader(TestClient.class.getResourceAsStream( "/resources/"+airline+"_AirShoppingRQ.xml" ) );
			InputStreamReader is = new InputStreamReader(TestClient.class.getResourceAsStream( "/resources/"+airline+"_AirShoppingRQ_172.xml" ) );
			
			
			StringBuilder sb = new StringBuilder();
			BufferedReader br = new BufferedReader( is );
			String read = br.readLine();
			
			String psgRef = "CR."+UUID.randomUUID().toString();
			String birthdate = "1990-01-01";
			String traveler = "";
			
			if(sparams.custguid!=null && sparams.custguid.length>0) {
				psgRef = "C."+sparams.custguid[0].custguid;
				birthdate = sparams.custguid[0].birthdate;
			}
			//for(int i=0;i<Integer.parseInt(sparams.adt);i++) {
			 	//psgRef = "T"+Integer.toString(i+1);
				traveler = traveler + "<Passenger PassengerID=\""+psgRef+"\">" + 
						"            <PTC>ADT</PTC>" + 
						"            <Birthdate>"+birthdate+"</Birthdate>" + 
						"            <ResidenceCountryCode>TR</ResidenceCountryCode>" + 
						"            <CitizenshipCountryCode>TR</CitizenshipCountryCode>" + 
						"          </Passenger>";
			//}
			/*for(int i=0;i<Integer.parseInt(sparams.chd);i++) {
				traveler = traveler + " <Passenger PassengerID=\"SH1\">\n" + 
						"            <PTC>CHD</PTC>\n" + 
						"            <Birthdate>2010-01-01</Birthdate>\n" + 
						"            <ResidenceCountryCode>GB</ResidenceCountryCode>\n" + 
						"            <CitizenshipCountryCode>GB</CitizenshipCountryCode>\n" + 
						"          </Passenger>";
			}*/
			
			String origdestination = "";
			if(sparams.routes.length>0) {
				if(sparams.ftype.equals("RT")) {
					origdestination = origdestination + "<OriginDestination>" + 
							"                <Departure>" + 
							"                   <AirportCode>"+sparams.routes[0].dep+"</AirportCode>" + 
							"                   <Date>"+sparams.routes[0].date+"</Date>" + 
							"                </Departure>" + 
							"                <Arrival>" + 
							"                   <AirportCode>"+sparams.routes[0].arr+"</AirportCode>" + 
							"                </Arrival>" + 
							"             </OriginDestination>"
							+ "<OriginDestination>" + 
							"                <Departure>" + 
							"                   <AirportCode>"+sparams.routes[0].arr+"</AirportCode>" + 
							"                   <Date>"+sparams.routes[0].rdate+"</Date>" + 
							"                </Departure>" + 
							"                <Arrival>" + 
							"                   <AirportCode>"+sparams.routes[0].dep+"</AirportCode>" + 
							"                </Arrival>" + 
							"             </OriginDestination>";
				}else {
					for(int i=0;i<sparams.routes.length;i++) {
						
							origdestination = origdestination + "<OriginDestination>" + 
									"                <Departure>" + 
									"                   <AirportCode>"+sparams.routes[i].dep+"</AirportCode>" + 
									"                   <Date>"+sparams.routes[i].date+"</Date>" + 
									"                </Departure>" + 
									"                <Arrival>" + 
									"                   <AirportCode>"+sparams.routes[i].arr+"</AirportCode>" + 
									"                </Arrival>" + 
									"             </OriginDestination>";
						
					}
				}
			}else if(sparams.ftype.equals("RT")) {
				origdestination = origdestination + "<OriginDestination>" + 
						"                <Departure>" + 
						"                   <AirportCode>"+sparams.orig+"</AirportCode>" + 
						"                   <Date>"+sparams.fdate+"</Date>" + 
						"                </Departure>" + 
						"                <Arrival>" + 
						"                   <AirportCode>"+sparams.dest+"</AirportCode>" + 
						"                </Arrival>" + 
						"             </OriginDestination>"
						+ "<OriginDestination>" + 
						"                <Departure>" + 
						"                   <AirportCode>"+sparams.dest+"</AirportCode>" + 
						"                   <Date>"+sparams.rdate+"</Date>" + 
						"                </Departure>" + 
						"                <Arrival>" + 
						"                   <AirportCode>"+sparams.orig+"</AirportCode>" + 
						"                </Arrival>" + 
						"             </OriginDestination>";
			}else {
				origdestination = origdestination + "<OriginDestination>" + 
						"                <Departure>" + 
						"                   <AirportCode>"+sparams.orig+"</AirportCode>" + 
						"                   <Date>"+sparams.fdate+"</Date>" + 
						"                </Departure>" + 
						"                <Arrival>" + 
						"                   <AirportCode>"+sparams.dest+"</AirportCode>" + 
						"                </Arrival>" + 
						"             </OriginDestination>";
			}
			
			while( read != null )
			{
				//read = read.replaceAll("#DEP#", sparams.getOrig()).replaceAll("#ARR#", sparams.getDest()).replaceAll("#FDATE#", sparams.getFdate()).replaceAll("#TRAVELER#", traveler);
				read = read.replaceAll("#TRAVELER#", traveler).replaceAll("#ORIGDEST#", origdestination).replaceAll("#AIRLINECODE#", airline.toUpperCase());
				sb.append( read );
				read = br.readLine();

			}

			if(airline.equals("BA")) {
				request.addHeader( "content-type", "application/xml;charset=utf-8" );
				request.addHeader( "Client-Key", key ); //BA Key
				request.addHeader("SOAPAction", soapAction);
			}
			else if(airline.equals("PC")) {
				request.addHeader( "content-type", "text/xml;charset=utf-8" );
				request.addHeader( "Username", username);
				request.addHeader( "Password", password );
				request.addHeader("SOAPAction", soapAction);
			}
			
			
			//request.addHeader( "Authorization-Key", "nnpzytp6zbv7zj28wrnhrbvp" ); //IATA Key

			StringEntity params = new StringEntity ( sb.toString() );
			request.setEntity( params );

			System.out.println( "Sending request body:" );
			System.out.println( sb.toString() );
			HttpResponse response = httpClient.execute( request );

			// Read the response
			is = new InputStreamReader( response.getEntity().getContent() );
			sb = new StringBuilder();
			br = new BufferedReader( is );
			read = br.readLine();

			while( read != null )
			{
				sb.append( read );
				read = br.readLine();
			}

			System.out.println( "------------------------------------------------------------" );
			System.out.println( "Result "+airline+" NDC:" );
			System.out.println( sb.toString() );
			System.out.println( "------------------------------------------------------------" );

			// Use SAX to parse the document
//			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
//			DocumentBuilder builder = factory.newDocumentBuilder();
//			factory.setNamespaceAware( true );
//			InputSource isource = new InputSource( new StringReader( sb.toString() ) );
//
//			Document doc = builder.parse( isource );

			//System.out.println( "Selecting 1st offer" );
		
			//dumpChildren( doc.getElementsByTagName( "Offer" ).item( 0 ) );
			
			return sb.toString();
		}
		catch ( Exception ex )
		{
			ex.printStackTrace();
			return ex.getMessage();
		}
		finally
		{
			httpClient.close();
		}
	}
	
	public static String ndcOfferPrice(bookFlightParams sparams,String airline,String key,String url,String soapAction) throws IOException
	{
		CloseableHttpClient httpClient = HttpClientBuilder.create().setUserAgent( "TestClient" ).build();

		try
		{
			// Make a request to the airline
			HttpPost request = new HttpPost( url ); 
			
			InputStreamReader is = new InputStreamReader(TestClient.class.getResourceAsStream( "/resources/"+airline+"_OfferPriceRQ_172.xml" ) );
			
			StringBuilder sb = new StringBuilder();
			BufferedReader br = new BufferedReader( is );
			String read = br.readLine();
			String traveler = "";
			String psgRef = "C."+sparams.customer[0].cust_guid;
			
			//for(int i=0;i<sparams.customer.length;i++) {
			//psgRef = "T"+Integer.toString(i+1);
				traveler = traveler + "<Passenger PassengerID=\""+psgRef+"\">\n" + 
						"            <PTC>ADT</PTC>\n" + 
						"            <Birthdate>"+sparams.customer[0].birthdate+"</Birthdate>\n" + 
						"            <ResidenceCountryCode>TR</ResidenceCountryCode>\n" + 
						"            <CitizenshipCountryCode>TR</CitizenshipCountryCode>\n" + 
						"          </Passenger>";
			//}
			
			String offerstr = "<Offer OfferID=\""+sparams.offer.ndcOfferID+"\" Owner=\""+airline+"\" ResponseID=\""+sparams.offer.key+"\">\n" + 
					"          <OfferItem OfferItemID=\""+sparams.offer.ndcOfferItemID+"\">\n" + 
					"            <PassengerRefs>"+psgRef+"</PassengerRefs>\n" + 
					"          </OfferItem>\n" + 
					"        </Offer>";
			
			while( read != null )
			{
				//read = read.replaceAll("#DEP#", sparams.getOrig()).replaceAll("#ARR#", sparams.getDest()).replaceAll("#FDATE#", sparams.getFdate()).replaceAll("#TRAVELER#", traveler);
				read = read.replaceAll("#TRAVELER#", traveler).replaceAll("#AIRLINECODE#", airline.toUpperCase()).replaceAll("#OFFER#", offerstr);
				sb.append( read );
				read = br.readLine();

			}

			request.addHeader( "content-type", "application/xml;charset=utf-8" );
			request.addHeader( "Client-Key", key ); //BA Key
			request.addHeader("SOAPAction", soapAction);
			//request.addHeader( "Authorization-Key", "nnpzytp6zbv7zj28wrnhrbvp" ); //IATA Key

			StringEntity params = new StringEntity ( sb.toString() );
			request.setEntity( params );

			System.out.println( "Sending request body:" );
			System.out.println( sb.toString() );
			HttpResponse response = httpClient.execute( request );

			// Read the response
			is = new InputStreamReader( response.getEntity().getContent() );
			sb = new StringBuilder();
			br = new BufferedReader( is );
			read = br.readLine();

			while( read != null )
			{
				sb.append( read );
				read = br.readLine();
			}

			System.out.println( "------------------------------------------------------------" );
			System.out.println( "Result "+airline+" NDC:" );
			System.out.println( sb.toString() );
			System.out.println( "------------------------------------------------------------" );

			
			return sb.toString();
		}
		catch ( Exception ex )
		{
			ex.printStackTrace();
			return ex.getMessage();
		}
		finally
		{
			httpClient.close();
		}
	}
	
	public static String ndcBook(bookFlightParams sparams,String airline,String key,String username,String password,String url,String soapAction) throws IOException
	{
		CloseableHttpClient httpClient = HttpClientBuilder.create().setUserAgent( "TestClient" ).build();

		try
		{
			// Make a request to the airline
			HttpPost request = new HttpPost( url ); 
			
			InputStreamReader is = new InputStreamReader(TestClient.class.getResourceAsStream( "/resources/"+airline+"_OrderCreateRQ_172.xml" ) );
			
			StringBuilder sb = new StringBuilder();
			BufferedReader br = new BufferedReader( is );
			String read = br.readLine();
			String traveler = "";
			String psgRef = "C."+sparams.customer[0].cust_guid;
			String identityDoc = "<IdentityDocument/>";
			
			
			for(int i=0;i<sparams.customer.length;i++) {
			//psgRef = "T"+Integer.toString(i+1);
			 if(sparams.customer[i].national_id!=null && sparams.customer[i].national_id.length()>3)
				identityDoc = "<IdentityDocument>\n" + 
						"    <IdentityDocumentNumber>"+sparams.customer[i].national_id+"</IdentityDocumentNumber>\n" + 
						"    </IdentityDocument>";
			
			 if(sparams.customer[i].passenger_type.equals("ADT")) {
				traveler = traveler + "<Passenger PassengerID=\""+psgRef+"\">" + 
						"              <PTC>ADT</PTC>" + 
						//"              <Birthdate>"+sparams.customer[i].birthdate+"</Birthdate>" + 
						"              <ResidenceCountryCode>TR</ResidenceCountryCode>" + 
						"              <CitizenshipCountryCode>TR</CitizenshipCountryCode>" + 
						"              <Individual>" + 
						"                <Gender>Male</Gender>" + 
						"                <NameTitle>"+sparams.customer[i].title.toUpperCase()+"</NameTitle>" + 
						"                <GivenName>"+sparams.customer[i].firstname.toUpperCase()+"</GivenName>" + 
						"                <Surname>"+sparams.customer[i].lastname.toUpperCase()+"</Surname>" + 
						"              </Individual>" + identityDoc +
						"              <ContactInfoRef>pisoco-contact</ContactInfoRef>" + 
						"            </Passenger>";
			 }
			}
				
			String offerstr = "<Offer OfferID=\""+sparams.offer.ndcOfferID+"\" Owner=\""+airline+"\" ResponseID=\""+sparams.offer.key+"\">\n" + 
					"          <OfferItem OfferItemID=\""+sparams.offer.ndcOfferItemID+"\">\n" + 
					"            <PassengerRefs>"+psgRef+"</PassengerRefs>\n" + 
					"          </OfferItem>\n" + 
					"        </Offer>";
			
			String paymentstr= "<Payments>\n" + 
					"          <Payment>\n" + 
					"            <Type>CC</Type>\n" + 
					"            <Method>\n" + 
					"              <PaymentCard>\n" + 
					"                <CardType>Credit</CardType>\n" + 
					"                <CardCode>VI</CardCode>\n" + 
					"                <CardNumber>4111111111111111</CardNumber>\n" + 
					"                <SeriesCode>123</SeriesCode>\n" + 
					"                <CardHolderName>MR ISMAIL KAHRAMAN</CardHolderName>\n" + 
					"                <CardHolderBillingAddress>\n" + 
					"                  <Street>SmartOffice Degirmen sk Nida Kule</Street>\n" + 
					"                  <CityName>IST</CityName>\n" + 
					"                  <PostalCode>34782</PostalCode>\n" + 
					"                  <CountryCode>TR</CountryCode>\n" + 
					"                </CardHolderBillingAddress>\n" + 
					"                <Surcharge>\n" + 
					"                  <Amount Code=\""+sparams.offer.OrgCurrency+"\">0</Amount>\n" + 
					"                </Surcharge>\n" + 
					"                <EffectiveExpireDate>\n" + 
					"                  <Expiration>1220</Expiration>\n" + 
					"                </EffectiveExpireDate>\n" + 
					"              </PaymentCard>\n" + 
					"            </Method>\n" + 
					"            <Amount Code=\""+sparams.offer.OrgCurrency+"\">"+sparams.offer.OrgAmount+"</Amount>\n" + 
					"            <Payer>\n" + 
					"              <ContactInfoRefs>PP1</ContactInfoRefs>\n" + 
					"            </Payer>\n" + 
					"          </Payment>\n" + 
					"        </Payments>";
			

			
			String paymentContact = "<ContactInformation ContactID=\""+psgRef+"\">" + 
					"               <ContactType>Payment</ContactType>" + 
					"                  <ContactProvided>" + 
					"                     <EmailAddress>" + 
					"                        <EmailAddressValue>izmael@gmail.com</EmailAddressValue>" + 
					"                     </EmailAddress>" + 
					"                  </ContactProvided>" + 
					"                  <ContactProvided>" + 
					"                     <Phone>" + 
					"                        <Label>mobile</Label>" + 
					"                        <CountryDialingCode>90</CountryDialingCode>" + 
					"                        <AreaCode>533</AreaCode>" + 
					"                        <PhoneNumber>2423126</PhoneNumber>" + 
					"                     </Phone>" + 
					"                  </ContactProvided>" + 
					"                  <Individual>" + 
					"                     <NameTitle>MR</NameTitle>" + 
					"                     <GivenName>ISMAIL</GivenName>" + 
					"                     <Surname>KAHRAMAN</Surname>" + 
					"                  </Individual>" + 
					"               </ContactInformation>";
			
			String baggageAllowance = "<BaggageAllowanceList/>";
			
			/*if(airline.equals("PC")) {
				baggageAllowance = "<BaggageAllowanceList>\n" + 
						"                        <BaggageAllowance BaggageAllowanceID=\"FreeBaggageAllowance1\">\n" + 
						"                            <BaggageCategory>CarryOn</BaggageCategory>\n" + 
						"                            <WeightAllowance>\n" + 
						"                                <MaximumWeight>\n" + 
						"                                    <Value>15</Value>\n" + 
						"                                    <UOM>KG</UOM>\n" + 
						"                                </MaximumWeight>\n" + 
						"                            </WeightAllowance>\n" + 
						"                        </BaggageAllowance>\n" + 
						"                    </BaggageAllowanceList>";
			}*/
			
			if(!sparams.createTicket) {
				paymentstr= "";
				paymentContact = "";
			}
			
			while( read != null )
			{
				//read = read.replaceAll("#DEP#", sparams.getOrig()).replaceAll("#ARR#", sparams.getDest()).replaceAll("#FDATE#", sparams.getFdate()).replaceAll("#TRAVELER#", traveler);
				read = read.replaceAll("#AIRLINECODE#", airline.toUpperCase()).replaceAll("#TRAVELER#", traveler).replaceAll("#PAYMENT#",paymentstr).replaceAll("#OFFER#", offerstr).replaceAll("#CONTACTPAYMENT#", paymentContact).replaceAll("#BAGGAEALLOWANCE#", baggageAllowance);
				sb.append( read );
				read = br.readLine();

			}

			if(airline.equals("BA")) {
				request.addHeader( "content-type", "application/xml;charset=utf-8" );
				request.addHeader( "Client-Key", key ); //BA Key
				request.addHeader("SOAPAction", soapAction);
			}
			else if(airline.equals("PC")) {
				request.addHeader( "content-type", "text/xml;charset=utf-8" );
				request.addHeader( "Username", username);
				request.addHeader( "Password", password );
				request.addHeader("SOAPAction", soapAction);
			}
			
			
			StringEntity params = new StringEntity ( sb.toString() );
			request.setEntity( params );

			System.out.println( "Sending request body:" );
			System.out.println( sb.toString() );
			HttpResponse response = httpClient.execute( request );

			// Read the response
			is = new InputStreamReader( response.getEntity().getContent() );
			sb = new StringBuilder();
			br = new BufferedReader( is );
			read = br.readLine();

			while( read != null )
			{
				sb.append( read );
				read = br.readLine();
			}

			System.out.println( "------------------------------------------------------------" );
			System.out.println( "Result "+airline+" NDC:" );
			System.out.println( sb.toString() );
			System.out.println( "------------------------------------------------------------" );

			
			return sb.toString();
		}
		catch ( Exception ex )
		{
			ex.printStackTrace();
			return ex.getMessage();
		}
		finally
		{
			httpClient.close();
		}
	}
	
	public static String ndcOrderCancel(Pnr pnr,String airline,String key,String username,String password,String url,String soapAction) throws IOException
	{
		CloseableHttpClient httpClient = HttpClientBuilder.create().setUserAgent( "TestClient" ).build();

		try
		{
			// Make a request to the airline
			HttpPost request = new HttpPost( url ); 
			
			InputStreamReader is = new InputStreamReader(TestClient.class.getResourceAsStream( "/resources/"+airline+"_OrderCancelRQ_172.xml" ) );
			
			StringBuilder sb = new StringBuilder();
			BufferedReader br = new BufferedReader( is );
			String read = br.readLine();

			while( read != null )
			{
				read = read.replaceAll("#AIRLINECODE#", airline.toUpperCase()).replaceAll("#PNRNO#", pnr.refId);
				sb.append( read );
				read = br.readLine();

			}

			
			
			//request.addHeader( "Authorization-Key", "nnpzytp6zbv7zj28wrnhrbvp" ); //IATA Key

			if(airline.equals("BA")) {
				request.addHeader( "content-type", "application/xml;charset=utf-8" );
				request.addHeader( "Client-Key", key ); //BA Key
				request.addHeader("SOAPAction", soapAction);
			}
			else if(airline.equals("PC")) {
				request.addHeader( "content-type", "text/xml;charset=utf-8" );
				request.addHeader( "Username", username);
				request.addHeader( "Password", password );
				request.addHeader("SOAPAction", soapAction);
			}
			
			
			StringEntity params = new StringEntity ( sb.toString() );
			request.setEntity( params );

			System.out.println( "Sending request body:" );
			System.out.println( sb.toString() );
			HttpResponse response = httpClient.execute( request );

			// Read the response
			is = new InputStreamReader( response.getEntity().getContent() );
			sb = new StringBuilder();
			br = new BufferedReader( is );
			read = br.readLine();

			while( read != null )
			{
				sb.append( read );
				read = br.readLine();
			}

			System.out.println( "------------------------------------------------------------" );
			System.out.println( "Result "+airline+" NDC:" );
			System.out.println( sb.toString() );
			System.out.println( "------------------------------------------------------------" );

			
			return sb.toString();
		}
		catch ( Exception ex )
		{
			ex.printStackTrace();
			return ex.getMessage();
		}
		finally
		{
			httpClient.close();
		}
	}
	
	public static String ndcOrderRetrieve(Pnr pnr,String airline,String key,String username,String password,String url,String soapAction) throws IOException
	{
		CloseableHttpClient httpClient = HttpClientBuilder.create().setUserAgent( "TestClient" ).build();

		try
		{
			tools.console.println(url);
			// Make a request to the airline
			HttpPost request = new HttpPost( url ); 
			String orderNo = pnr.pnr;
			
			if(airline.equals("BA")) {
				request.addHeader( "content-type", "application/xml;charset=utf-8" );
				request.addHeader( "Client-Key", key ); //BA Key
				request.addHeader("SOAPAction", soapAction);
			}
			else if(airline.equals("PC")) {
				request.addHeader( "content-type", "text/xml;charset=utf-8" );
				request.addHeader( "Username", username);
				request.addHeader( "Password", password );
				request.addHeader("SOAPAction", soapAction);
				orderNo = pnr.refId;
			}

			tools.console.println(1);
			InputStreamReader is = new InputStreamReader(TestClient.class.getResourceAsStream( "/resources/"+airline+"_OrderRetreiveRQ_172.xml" ) );
			
			StringBuilder sb = new StringBuilder();
			BufferedReader br = new BufferedReader( is );
			String read = br.readLine();
			tools.console.println(2);
			while( read != null )
			{
				read = read.replaceAll("#AIRLINECODE#", airline.toUpperCase()).replaceAll("#ORDERNO#", orderNo);
				sb.append( read );
				read = br.readLine();

			}

			
			StringEntity params = new StringEntity ( sb.toString() );
			request.setEntity( params );

			System.out.println( "Sending request body:" );
			System.out.println( sb.toString() );
			HttpResponse response = httpClient.execute( request );

			// Read the response
			is = new InputStreamReader( response.getEntity().getContent() );
			sb = new StringBuilder();
			br = new BufferedReader( is );
			read = br.readLine();

			while( read != null )
			{
				sb.append( read );
				read = br.readLine();
			}

			System.out.println( "------------------------------------------------------------" );
			System.out.println( "Result "+airline+" NDC:" );
			System.out.println( sb.toString() );
			System.out.println( "------------------------------------------------------------" );

			
			return sb.toString();
		}
		catch ( Exception ex )
		{
			ex.printStackTrace();
			return ex.getMessage();
		}
		finally
		{
			httpClient.close();
		}
	}
	
	public static String ndcOrderRequote(Pnr pnr,String airline,String key,String username,String password,String url,String soapAction) throws IOException
	{
		CloseableHttpClient httpClient = HttpClientBuilder.create().setUserAgent( "TestClient" ).build();

		try
		{
			//tools.console.println(url);
			// Make a request to the airline
			HttpPost request = new HttpPost( url ); 
			
			InputStreamReader is = new InputStreamReader(TestClient.class.getResourceAsStream( "/resources/"+airline+"_OrderRequoteRQ_172.xml" ) );
			
			StringBuilder sb = new StringBuilder();
			BufferedReader br = new BufferedReader( is );
			String read = br.readLine();
			String traveler = "";
			String psgRef = "C."+pnr.custlist[0].cust_guid;
			
			//for(int i=0;i<sparams.custlist.length;i++) {
			//psgRef = "T"+Integer.toString(i+1);
				traveler = traveler + "<Passenger PassengerID=\""+psgRef+"\">" + 
						"              <PTC>ADT</PTC>" + 
						"              <Individual>" + 
						"              	<Birthdate>"+pnr.custlist[0].birthdate+"</Birthdate>" + 	
						"                <Gender>Male</Gender>" + 
						"                <NameTitle>"+pnr.custlist[0].title.toUpperCase()+"</NameTitle>" + 
						"                <GivenName>"+pnr.custlist[0].firstname+"</GivenName>" + 
						"                <Surname>"+pnr.custlist[0].lastname+"</Surname>" + 
						"              </Individual>" + 
						"            </Passenger>";
			//}

			while( read != null )
			{
				read = read.replaceAll("#AIRLINECODE#", airline.toUpperCase()).replaceAll("#TRAVELER#", traveler).replaceAll("#PNRNO#", pnr.pnr).replaceAll("#PSGREF#", psgRef);
				sb.append( read );
				read = br.readLine();

			}

			if(airline.equals("BA")) {
				request.addHeader( "content-type", "application/xml;charset=utf-8" );
				request.addHeader( "Client-Key", key ); //BA Key
				request.addHeader("SOAPAction", soapAction);
			}
			else if(airline.equals("PC")) {
				request.addHeader( "content-type", "text/xml;charset=utf-8" );
				request.addHeader( "Username", username);
				request.addHeader( "Password", password );
				request.addHeader("SOAPAction", soapAction);
			}

			StringEntity params = new StringEntity ( sb.toString() );
			request.setEntity( params );

			System.out.println( "Sending request body:" );
			System.out.println( sb.toString() );
			HttpResponse response = httpClient.execute( request );

			// Read the response
			is = new InputStreamReader( response.getEntity().getContent() );
			sb = new StringBuilder();
			br = new BufferedReader( is );
			read = br.readLine();

			while( read != null )
			{
				sb.append( read );
				read = br.readLine();
			}

			System.out.println( "------------------------------------------------------------" );
			System.out.println( "Result "+airline+" NDC:" );
			System.out.println( sb.toString() );
			System.out.println( "------------------------------------------------------------" );

			
			return sb.toString();
		}
		catch ( Exception ex )
		{
			ex.printStackTrace();
			return ex.getMessage();
		}
		finally
		{
			httpClient.close();
		}
	}
	
	public static String ndcOrderConfirm(Pnr pnr,String airline,String key,String username,String password,String url,String soapAction) throws IOException
	{
		CloseableHttpClient httpClient = HttpClientBuilder.create().setUserAgent( "TestClient" ).build();

		try
		{
			//tools.console.println(url);
			// Make a request to the airline
			HttpPost request = new HttpPost( url ); 
			
			InputStreamReader is = new InputStreamReader(TestClient.class.getResourceAsStream( "/resources/"+airline+"_OrderConfirmRQ_172.xml" ) );
			
			StringBuilder sb = new StringBuilder();
			BufferedReader br = new BufferedReader( is );
			String read = br.readLine();
			String traveler = "";
			String psgRef = "C."+pnr.custlist[0].cust_guid;
			
			//for(int i=0;i<sparams.custlist.length;i++) {
			//psgRef = "T"+Integer.toString(i+1);
				traveler = traveler + "<Passenger PassengerID=\""+psgRef+"\">" + 
						"              <Individual>" + 
						"                <NameTitle>"+pnr.custlist[0].title.toUpperCase()+"</NameTitle>" + 
						"                <GivenName>"+pnr.custlist[0].firstname+"</GivenName>" + 
						"                <Surname>"+pnr.custlist[0].lastname+"</Surname>" + 
						"              </Individual>" + 
						"            </Passenger>";
			//}

				String paymentstr= "<Payments>" + 
						"          <Payment>" + 
						"            <Type>CC</Type>" + 
						"            <Method>" + 
						"              <PaymentCard>" +
						"				 <CardType>Credit</CardType>" + 
						"                <CardCode>VI</CardCode>" + 
						"                <CardNumber>4111111111111111</CardNumber>" + 
						"                <SeriesCode>123</SeriesCode>" + 
						"                <CardHolderName>MR ISMAIL KAHRAMAN</CardHolderName>" + 
						"                <CardHolderBillingAddress>" + 
						"                  <Street>SmartOffice Degirmen sk Nida Kule</Street>" + 
						"                  <Street>No:18/19 B1013</Street>" + 
						"                  <CityName>IST</CityName>" + 
						"                  <PostalCode>34782</PostalCode>" + 
						"                  <CountryCode>TR</CountryCode>" + 
						"                </CardHolderBillingAddress>" + 
						"                <Surcharge>" + 
						"                  <Amount Code=\""+pnr.offer.OrgCurrency+"\">0.00</Amount>" + 
						"                </Surcharge>" + 
						"                <EffectiveExpireDate>" + 
						"                  <Expiration>1220</Expiration>" + 
						"                </EffectiveExpireDate>" + 
						"              </PaymentCard>" + 
						"            </Method>" + 
						"            <Amount Code=\""+pnr.offer.OrgCurrency+"\">"+pnr.offer.OrgAmount+"</Amount>" + 
						"            <Payer>" + 
						"              <ContactInfoRefs>PP1</ContactInfoRefs>" + 
						"            </Payer>" + 
						"          </Payment>" + 
						"        </Payments>";

				String paymentContact = "<ContactInformation ContactID=\"PP1\">" + 
						"               <ContactType>Payment</ContactType>" + 
						"                  <ContactProvided>" + 
						"                     <EmailAddress>" + 
						"                        <EmailAddressValue>izmael@gmail.com</EmailAddressValue>" + 
						"                     </EmailAddress>" + 
						"                  </ContactProvided>" + 
						"                  <ContactProvided>" + 
						"                     <Phone>" + 
						"                        <Label>mobile</Label>" + 
						"                        <CountryDialingCode>90</CountryDialingCode>" + 
						"                        <AreaCode>533</AreaCode>" + 
						"                        <PhoneNumber>2423126</PhoneNumber>" + 
						"                     </Phone>" + 
						"                  </ContactProvided>" + 
						"                  <Individual>" + 
						"                     <NameTitle>MR</NameTitle>" + 
						"                     <GivenName>ISMAIL</GivenName>" + 
						"                     <Surname>KAHRAMAN</Surname>" + 
						"                  </Individual>" + 
						"               </ContactInformation>";
				
			while( read != null )
			{
				read = read.replaceAll("#RESPONSEID#", pnr.refId).replaceAll("#AIRLINECODE#", airline.toUpperCase()).replaceAll("#TRAVELER#", traveler).replaceAll("#PNRNO#", pnr.pnr).replaceAll("#CUSTGUID#", psgRef).replaceAll("#PAYMENT#", paymentstr).replaceAll("#CONTACTPAYMENT#", paymentContact);
				sb.append( read );
				read = br.readLine();

			}

			if(airline.equals("BA")) {
				request.addHeader( "content-type", "application/xml;charset=utf-8" );
				request.addHeader( "Client-Key", key ); //BA Key
				request.addHeader("SOAPAction", soapAction);
			}
			else if(airline.equals("PC")) {
				request.addHeader( "content-type", "text/xml;charset=utf-8" );
				request.addHeader( "Username", username);
				request.addHeader( "Password", password );
				request.addHeader("SOAPAction", soapAction);
			}

			StringEntity params = new StringEntity ( sb.toString() );
			request.setEntity( params );

			System.out.println( "Sending request body:" );
			System.out.println( sb.toString() );
			HttpResponse response = httpClient.execute( request );

			// Read the response
			is = new InputStreamReader( response.getEntity().getContent() );
			sb = new StringBuilder();
			br = new BufferedReader( is );
			read = br.readLine();

			while( read != null )
			{
				sb.append( read );
				read = br.readLine();
			}

			System.out.println( "------------------------------------------------------------" );
			System.out.println( "Result "+airline+" NDC:" );
			System.out.println( sb.toString() );
			System.out.println( "------------------------------------------------------------" );

			
			return sb.toString();
		}
		catch ( Exception ex )
		{
			ex.printStackTrace();
			return ex.getMessage();
		}
		finally
		{
			httpClient.close();
		}
	}
	
	public static String ndcIssueTicket(Pnr pnr,String airline,String key,String username,String password,String url,String soapAction) throws IOException
	{
		CloseableHttpClient httpClient = HttpClientBuilder.create().setUserAgent( "TestClient" ).build();

		try
		{
			//tools.console.println(url);
			// Make a request to the airline
			HttpPost request = new HttpPost( url ); 
			
			InputStreamReader is = new InputStreamReader(TestClient.class.getResourceAsStream( "/resources/"+airline+"_AirDocIssueRQ_172.xml" ) );
			
			StringBuilder sb = new StringBuilder();
			BufferedReader br = new BufferedReader( is );
			String read = br.readLine();
			String traveler = "";
			String psgRef = "SH1";
			int psgCnt = pnr.custlist.length;
			
			for(int i=1;i<pnr.custlist.length+1;i++) {
			//psgRef = "T"+Integer.toString(i+1);
				traveler = traveler + "<Passenger PassengerID=\"SH"+i+"\">" + 
						" 				<PTC>"+pnr.custlist[0].passenger_type.toUpperCase()+"</PTC>"+		
						"              <Individual>" + 
						//"                <NameTitle>"+pnr.custlist[0].title.toUpperCase()+"</NameTitle>" + 
						"                <GivenName>"+pnr.custlist[0].firstname+"</GivenName>" + 
						"                <Surname>"+pnr.custlist[0].lastname+"</Surname>" + 
						"              </Individual>" + 
						"                    <IdentityDocument>\n" + 
						"                        <IdentityDocumentNumber>11111111111</IdentityDocumentNumber>\n" + 
						"                        <IdentityDocumentType/>\n" + 
						"                    </IdentityDocument>"+
						"            </Passenger>";
			}

				String paymentstr= "<Payments>" + 
						"          <Payment>" + 
						"            <Type>CC</Type>" + 
						"            <Method>" + 
						"              <PaymentCard>" +
						//"				 <CardType>Credit</CardType>" + 
						//"                <CardCode>VI</CardCode>" + 
						"                <CardNumber>4242424242424242</CardNumber>" + 
						"                <SeriesCode>4242</SeriesCode>" + 
						"                <CardHolderName>HOLDER NAME</CardHolderName>" + 
						"                <EffectiveExpireDate>" + 
						"                  <Expiration>1219</Expiration>" + 
						"                </EffectiveExpireDate>" + 
						"              </PaymentCard>" + 
						"            </Method>" + 
						"            <Amount Code=\""+pnr.offer.OrgCurrency+"\">"+pnr.offer.OrgAmount+"</Amount>" + 
						"            <Order OrderID=\""+pnr.refId+"\" Owner=\""+airline+"\"></Order>" + 
						"          </Payment>" + 
						"        </Payments>";

				
			while( read != null )
			{
				read = read.replaceAll("#AIRLINECODE#", airline.toUpperCase()).replaceAll("#TRAVELER#", traveler).replaceAll("#PAYMENT#", paymentstr).replaceAll("#PSGREF#", psgRef).replaceAll("#TKTCOUNT#", Integer.toString(psgCnt) );
				sb.append( read );
				read = br.readLine();

			}

			if(airline.equals("BA")) {
				request.addHeader( "content-type", "application/xml;charset=utf-8" );
				request.addHeader( "Client-Key", key ); //BA Key
				request.addHeader("SOAPAction", soapAction);
			}
			else if(airline.equals("PC")) {
				request.addHeader( "content-type", "text/xml;charset=utf-8" );
				request.addHeader( "Username", username);
				request.addHeader( "Password", password );
				request.addHeader("SOAPAction", soapAction);
			}

			StringEntity params = new StringEntity ( sb.toString() );
			request.setEntity( params );

			System.out.println( "Sending request body:" );
			System.out.println( sb.toString() );
			HttpResponse response = httpClient.execute( request );

			// Read the response
			is = new InputStreamReader( response.getEntity().getContent() );
			sb = new StringBuilder();
			br = new BufferedReader( is );
			read = br.readLine();

			while( read != null )
			{
				sb.append( read );
				read = br.readLine();
			}

			System.out.println( "------------------------------------------------------------" );
			System.out.println( "Result "+airline+" NDC:" );
			System.out.println( sb.toString() );
			System.out.println( "------------------------------------------------------------" );

			
			return sb.toString();
		}
		catch ( Exception ex )
		{
			ex.printStackTrace();
			return ex.getMessage();
		}
		finally
		{
			httpClient.close();
		}
	}
	
	/*<Passenger PassengerID="SH1">
                  <PTC>ADT</PTC>
                  <Individual>
                     <Birthdate>1989-09-13</Birthdate>
                     <Gender>Male</Gender>
                     <NameTitle>Mr</NameTitle>
                     <GivenName>ismail</GivenName>
                     <Surname>kahraman</Surname>
                  </Individual>
               </Passenger>*/

	public static String ndcBrisithAirways(searchParams sparams,String airline,String key,String url,String soapAction) throws IOException
	{
		CloseableHttpClient httpClient = HttpClientBuilder.create().setUserAgent( "TestClient" ).build();

		try
		{
			// Make a request to the airline
			HttpPost request = new HttpPost( url ); 
			//HttpPost request = new HttpPost( "https://test.api.ba.com/selling-distribution/AirShopping/V2" ); 
			//HttpPost request = new HttpPost( "http://iata.api.mashery.com/Zeus/NDC" ); 
			//HttpPost request = new HttpPost( "http://iata.api.mashery.com/kronos/ndc162api" ); 
			//HttpPost request = new HttpPost("https://test.api.iberia.com/iberia/beta/ndc/AirShopping/v1");
			//HttpPost request = new HttpPost("http://xq.airgtwy.com:8181/sunexpress");
			
			InputStreamReader is = new InputStreamReader(TestClient.class.getResourceAsStream( "/resources/"+airline+"_AirShoppingRQ.xml" ) );
			
			StringBuilder sb = new StringBuilder();
			BufferedReader br = new BufferedReader( is );
			String read = br.readLine();
			
			String traveler = "";
			for(int i=0;i<Integer.parseInt(sparams.adt);i++) {
				traveler = traveler + " <Traveler>\n" + 
						"             <AnonymousTraveler>\n" + 
						"                <PTC>ADT</PTC>\n" + 
						"             </AnonymousTraveler>\n" + 
						"          </Traveler>";
			}
			for(int i=0;i<Integer.parseInt(sparams.chd);i++) {
				traveler = traveler + " <Traveler>\n" + 
						"             <AnonymousTraveler>\n" + 
						"                <PTC>CHD</PTC>\n" + 
						"             </AnonymousTraveler>\n" + 
						"          </Traveler>";
			}
			
			String origdestination = "";
			if(sparams.routes.length>1) {
				for(int i=0;i<sparams.routes.length;i++) {
					origdestination = origdestination + "<OriginDestination>\n" + 
							"                <Departure>\n" + 
							"                   <AirportCode>"+sparams.routes[i].dep+"</AirportCode>\n" + 
							"                   <Date>"+sparams.routes[i].date+"</Date>\n" + 
							"                </Departure>\n" + 
							"                <Arrival>\n" + 
							"                   <AirportCode>"+sparams.routes[i].arr+"</AirportCode>\n" + 
							"                </Arrival>\n" + 
							"             </OriginDestination>";
				}
			}else if(sparams.ftype.equals("RT")) {
				origdestination = origdestination + "<OriginDestination>\n" + 
						"                <Departure>\n" + 
						"                   <AirportCode>"+sparams.orig+"</AirportCode>\n" + 
						"                   <Date>"+sparams.fdate+"</Date>\n" + 
						"                </Departure>\n" + 
						"                <Arrival>\n" + 
						"                   <AirportCode>"+sparams.dest+"</AirportCode>\n" + 
						"                </Arrival>\n" + 
						"             </OriginDestination>"
						+ "<OriginDestination>\n" + 
						"                <Departure>\n" + 
						"                   <AirportCode>"+sparams.dest+"</AirportCode>\n" + 
						"                   <Date>"+sparams.rdate+"</Date>\n" + 
						"                </Departure>\n" + 
						"                <Arrival>\n" + 
						"                   <AirportCode>"+sparams.orig+"</AirportCode>\n" + 
						"                </Arrival>\n" + 
						"             </OriginDestination>";
			}else {
				origdestination = origdestination + "<OriginDestination>\n" + 
						"                <Departure>\n" + 
						"                   <AirportCode>"+sparams.orig+"</AirportCode>\n" + 
						"                   <Date>"+sparams.fdate+"</Date>\n" + 
						"                </Departure>\n" + 
						"                <Arrival>\n" + 
						"                   <AirportCode>"+sparams.dest+"</AirportCode>\n" + 
						"                </Arrival>\n" + 
						"             </OriginDestination>";
			}
			
			while( read != null )
			{
				//read = read.replaceAll("#DEP#", sparams.getOrig()).replaceAll("#ARR#", sparams.getDest()).replaceAll("#FDATE#", sparams.getFdate()).replaceAll("#TRAVELER#", traveler);
				read = read.replaceAll("#TRAVELER#", traveler).replaceAll("#ORIGDEST#", origdestination);
				sb.append( read );
				read = br.readLine();

			}

			request.addHeader( "content-type", "application/xml;charset=utf-8" );
			request.addHeader( "Client-Key", key ); //BA Key
			request.addHeader("SOAPAction", soapAction);
			//request.addHeader( "Authorization-Key", "nnpzytp6zbv7zj28wrnhrbvp" ); //IATA Key
			
			//request.addHeader( "username", "iflyxmluser0" ); //SunExpress User
			//request.addHeader( "password", "v1KlFYrcfecw" ); //SunExpress Pwd

			StringEntity params = new StringEntity ( sb.toString() );
			request.setEntity( params );

			System.out.println( "Sending request body:" );
			System.out.println( sb.toString() );
			HttpResponse response = httpClient.execute( request );

			// Read the response
			is = new InputStreamReader( response.getEntity().getContent() );
			sb = new StringBuilder();
			br = new BufferedReader( is );
			read = br.readLine();

			while( read != null )
			{
				sb.append( read );
				read = br.readLine();
			}

			System.out.println( "------------------------------------------------------------" );
			System.out.println( "Result BA NDC:" );
			System.out.println( sb.toString() );
			System.out.println( "------------------------------------------------------------" );

			// Use SAX to parse the document
//			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
//			DocumentBuilder builder = factory.newDocumentBuilder();
//			factory.setNamespaceAware( true );
//			InputSource isource = new InputSource( new StringReader( sb.toString() ) );
//
//			Document doc = builder.parse( isource );

			//System.out.println( "Selecting 1st offer" );
		
			//dumpChildren( doc.getElementsByTagName( "Offer" ).item( 0 ) );
			
			return sb.toString();
		}
		catch ( Exception ex )
		{
			ex.printStackTrace();
			return ex.getMessage();
		}
		finally
		{
			httpClient.close();
		}
	}
	
	public static String ndcAirFranceKLM(searchParams sparams) throws IOException
	{
		CloseableHttpClient httpClient = HttpClientBuilder.create().setUserAgent( "TestClient" ).build();

		try
		{
			// Make a request to the airline
			HttpPost request = new HttpPost( "https://test.api.ba.com/selling-distribution/AirShopping/V2" ); 
			//HttpPost request = new HttpPost( "http://iata.api.mashery.com/Zeus/NDC" ); 
			//HttpPost request = new HttpPost( "http://iata.api.mashery.com/kronos/ndc162api" ); 
			//HttpPost request = new HttpPost("https://test.api.iberia.com/iberia/beta/ndc/AirShopping/v1");
			//HttpPost request = new HttpPost("http://xq.airgtwy.com:8181/sunexpress");
			
			InputStreamReader is = new InputStreamReader(TestClient.class.getResourceAsStream( "/resources/AF_AirShoppingRQ.xml" ) );
			
			StringBuilder sb = new StringBuilder();
			BufferedReader br = new BufferedReader( is );
			String read = br.readLine();
			
			while( read != null )
			{
				read = read.replaceAll("#DEP#", sparams.getOrig()).replaceAll("#ARR#", sparams.getDest()).replaceAll("#FDATE#", sparams.getFdate());
				sb.append( read );
				read = br.readLine();

			}

			request.addHeader( "content-type", "application/xml;charset=utf-8" );
			request.addHeader( "Client-Key", "u9drgxp3czmbqmgq7n7uspe7" ); //BA Key
			request.addHeader("SOAPAction", "AirShoppingV01");
			//request.addHeader( "Authorization-Key", "nnpzytp6zbv7zj28wrnhrbvp" ); //IATA Key
			
			//request.addHeader( "username", "iflyxmluser0" ); //SunExpress User
			//request.addHeader( "password", "v1KlFYrcfecw" ); //SunExpress Pwd

			StringEntity params = new StringEntity ( sb.toString() );
			request.setEntity( params );

			System.out.println( "Sending request body:" );
			System.out.println( sb.toString() );
			HttpResponse response = httpClient.execute( request );

			// Read the response
			is = new InputStreamReader( response.getEntity().getContent() );
			sb = new StringBuilder();
			br = new BufferedReader( is );
			read = br.readLine();

			while( read != null )
			{
				sb.append( read );
				read = br.readLine();
			}

			System.out.println( "------------------------------------------------------------" );
			System.out.println( "Result AF NDC:" );
			System.out.println( sb.toString() );
			System.out.println( "------------------------------------------------------------" );

			// Use SAX to parse the document
//			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
//			DocumentBuilder builder = factory.newDocumentBuilder();
//			factory.setNamespaceAware( true );
//			InputSource isource = new InputSource( new StringReader( sb.toString() ) );
//
//			Document doc = builder.parse( isource );

			//System.out.println( "Selecting 1st offer" );
		
			//dumpChildren( doc.getElementsByTagName( "Offer" ).item( 0 ) );
			
			return sb.toString();
		}
		catch ( Exception ex )
		{
			ex.printStackTrace();
			return ex.getMessage();
		}
		finally
		{
			httpClient.close();
		}
	}
	
	private static void dumpChildren( Node node )
	{
		NodeList nl = node.getChildNodes();

		for ( int i = 0; i < nl.getLength(); i++ )
		{
			Node n = nl.item( i );
			
			if ( !"#text".equals( n.getNodeName() ) )
			{
				StringBuffer sb = new StringBuffer();
				sb.append( "Node " ).append( n.getNodeName() );

				NodeList nl2 = n.getChildNodes();
				int index = 0;
				while ( index < nl2.getLength() && !"#text".equals( nl2.item( index ).getNodeName() ) )
					index++;

				if ( index < nl2.getLength() )
				  sb.append( ", value = " ).append( nl2.item( index ).getNodeValue() );
				else
				  sb.append( ", this node has no value" );

				NamedNodeMap nnm = n.getAttributes();

				if ( nnm != null && nnm.getLength() > 0 )
				{
				  sb.append( "\nAttributes:\n" );

				  for ( int j = 0; j < nnm.getLength(); j++ )
					  sb.append( nnm.item( j ).toString() ).append( "\n" );
				}
				else
				  sb.append( "\nThis node has no attributes\n" );

				System.out.println( sb.toString() );

				if ( n.hasChildNodes() )
				  dumpChildren( n );
			}
		}
	}
}