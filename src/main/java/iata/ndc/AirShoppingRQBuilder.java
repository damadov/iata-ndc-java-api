package iata.ndc;


import java.math.BigInteger;
import java.util.Date;
import java.util.Formatter;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.commons.codec.digest.DigestUtils;
import org.iata.ndc.schema.AgencyIDType;
import org.iata.ndc.schema.AirShopReqAttributeQueryTypeOriginDestination;
import org.iata.ndc.schema.AirShopReqAttributeQueryTypeOriginDestination.CalendarDates;
import org.iata.ndc.schema.AirShoppingRQ;
import org.iata.ndc.schema.AirlineID;
import org.iata.ndc.schema.AirlinePreferencesType;
import org.iata.ndc.schema.CabinPreferencesType;
import org.iata.ndc.schema.CabinType;
import org.iata.ndc.schema.FarePreferencesType;
import org.iata.ndc.schema.FarePreferencesType.Type;
import org.iata.ndc.schema.FlightDepartureType.AirportCode;
import org.iata.ndc.schema.MsgDocumentType;
import org.iata.ndc.schema.MsgPartiesType;
import org.iata.ndc.schema.MsgPartiesType.Sender;
import org.iata.ndc.schema.ObjectFactory;
import org.iata.ndc.schema.TravelAgencySenderType;
import org.iata.ndc.schema.TravelerCoreType.PTC;


public class AirShoppingRQBuilder {

	public enum Traveler {
		/** Adult */
		ADT,
		/** Child */
		CNN,
		/** Child */
		CHD,
		/** Infant */
		INF,
		/** Government */
		GVT,
		/** State government */
		GST
	};

	private AirShoppingRQ request;
	private static final ObjectFactory factory = new ObjectFactory();

	private Map<Traveler, Integer> anonymousTravelers;
	private Sender sender;

	private Set<String> airlines;
	private Set<String> fares;
	private Set<String> cabins;

	public AirShoppingRQBuilder() {
		anonymousTravelers = new HashMap<AirShoppingRQBuilder.Traveler, Integer>();
		airlines = new LinkedHashSet<String>();
		fares = new LinkedHashSet<String>();
		cabins = new LinkedHashSet<String>();

		request = Initializer.getObject(AirShoppingRQ.class);
		sender = null;
	}

	public AirShoppingRQBuilder addTravelAgencySender(String name, String iataNumber, String agencyId) {
		sender = factory.createMsgPartiesTypeSender();
		TravelAgencySenderType agency = factory.createTravelAgencySenderType();
		agency.setName(name);
		agency.setIATANumber(iataNumber);
		AgencyIDType agencyIDType = factory.createAgencyIDType();
		agencyIDType.setValue(agencyId);
		agency.setAgencyID(agencyIDType);
		sender.setTravelAgencySender(agency);
		return this;
	}

	public AirShoppingRQBuilder addAnonymousTraveler(Traveler traveler) {
		return addAnonymousTravelers(traveler, 1);
	}

	public AirShoppingRQBuilder addAnonymousTravelers(Traveler traveler, int count) {
		if (!anonymousTravelers.containsKey(traveler)) {
			anonymousTravelers.put(traveler, count);
			return this;
		}
		Integer total = anonymousTravelers.get(traveler) + count;
		anonymousTravelers.put(traveler, total);
		return this;
	}

	public AirShoppingRQBuilder addOriginDestination(AirShopReqAttributeQueryTypeOriginDestination originDestination) {
		request.getCoreQuery().getOriginDestinations().add(originDestination);
		return this;
	}

	public AirShoppingRQBuilder addOriginDestination(String origin, String destination, Date date) {
		return addOriginDestination(origin, destination, date, 0, 0);
	}

	public AirShoppingRQBuilder addOriginDestination(String origin, String destination, Date date, int daysBefore, int daysAfter) {
		AirShopReqAttributeQueryTypeOriginDestination originDestination = Initializer.getObject(AirShopReqAttributeQueryTypeOriginDestination.class);

		AirportCode airportCode = factory.createFlightDepartureTypeAirportCode();
		originDestination.getDeparture().setAirportCode(airportCode);
		originDestination.getDeparture().getAirportCode().setValue(origin);
		originDestination.getArrival().getAirportCode().setValue(destination);
		originDestination.getDeparture().setDate(getDate(date));

		if( daysBefore != 0 || daysAfter != 0) {
			CalendarDates dates = factory.createAirShopReqAttributeQueryTypeOriginDestinationCalendarDates();
			dates.setDaysBefore(daysBefore);
			dates.setDaysAfter(daysAfter);
			originDestination.setCalendarDates(dates);
		}

		return addOriginDestination(originDestination);
	}


	public AirShoppingRQBuilder addAirlinePreference(String airlineId) {
		airlines.add(airlineId);

		return this;
	}

	public AirShoppingRQBuilder addFarePreference(String fareCode) {
		fares.add(fareCode);

		return this;
	}

	public AirShoppingRQBuilder addCabinPreference(String cabinCode) {
		cabins.add(cabinCode);

		return this;
	}

	public AirShoppingRQ build() {
		setDefaults();

		addRequestAttributes();
		addDocumentNode();
		addPartyNode();
		addTravelers();

		addAirlinePreferences();
		addFarePreferences();
		addCabinPreferences();

		return request;
	}

	private void addCabinPreferences() {
		if (cabins.size() == 0) {
			return;
		}
		CabinPreferencesType cabinPreferencesType = factory.createCabinPreferencesType();
		for (String code: cabins) {
			CabinType cabin = factory.createCabinType();
			cabin.setCode(code);
			cabinPreferencesType.getCabinType().add(cabin);
		}
		org.iata.ndc.schema.AirShoppingRQ.Preference preferenceElement = factory.createAirShoppingRQPreference();
		preferenceElement.setCabinPreferences(cabinPreferencesType);
		request.getPreferences().add(preferenceElement);
	}

	private void addFarePreferences() {
		if (fares.size() == 0) {
			return;
		}
		FarePreferencesType farePreferences = factory.createFarePreferencesType();
		for (String code : fares) {
			Type type = factory.createFarePreferencesTypeType();
			type.setCode(code);
			farePreferences.getTypes().add(type);
		}
		org.iata.ndc.schema.AirShoppingRQ.Preference preferenceElement = factory.createAirShoppingRQPreference();
		preferenceElement.setFarePreferences(farePreferences);
		request.getPreferences().add(preferenceElement);
	}

	private void addAirlinePreferences() {
		if (airlines.size() == 0) {
			return;
		}
		AirlinePreferencesType airlinePreferences = factory.createAirlinePreferencesType();
		for (String code : airlines) {
			AirlinePreferencesType.Airline airline = factory.createAirlinePreferencesTypeAirline();
			AirlineID airlineID = factory.createAirlineID();
			airlineID.setValue(code);
			airline.setAirlineID(airlineID);
			airlinePreferences.getAirline().add(airline);
		}
		org.iata.ndc.schema.AirShoppingRQ.Preference preferenceElement = factory.createAirShoppingRQPreference();
		preferenceElement.setAirlinePreferences(airlinePreferences);
		request.getPreferences().add(preferenceElement);
	}

	private void setDefaults() {
		if (anonymousTravelers.size() == 0) {
			addAnonymousTraveler(Traveler.ADT);
		}
	}

	private void addPartyNode() {
		MsgPartiesType party = factory.createMsgPartiesType();

		party.setSender(sender);

		request.setParty(party);
	}

	private void addTravelers() {
		for (Traveler t: anonymousTravelers.keySet()) {
			org.iata.ndc.schema.TravelersTraveler traveler = factory.createTravelersTraveler();
			traveler.setAnonymousTraveler(factory.createAnonymousTravelerType());
			PTC ptc = factory.createTravelerCoreTypePTC();
			ptc.setValue(t.name());
			ptc.setQuantity(BigInteger.valueOf(anonymousTravelers.get(t)));
			traveler.getAnonymousTraveler().setPTC(ptc);
			request.getTravelers().add(traveler);
		}
	}

	private void addDocumentNode() {
		MsgDocumentType document = factory.createMsgDocumentType();
		document.setName("NDC AirShoppingRQ Message");
		document.setReferenceVersion("1.0");
		request.setDocument(document);
	}

	private void addRequestAttributes() {
		request.setVersion("1.1.5");
		XMLGregorianCalendar xmlgc = toUTC(new GregorianCalendar());
		request.setTimeStamp(xmlgc);
		request.setEchoToken(byteToHex(DigestUtils.sha512(xmlgc.toString())));
	}

	private static XMLGregorianCalendar toUTC(GregorianCalendar gregorianCalendar) {
		XMLGregorianCalendar xmlgc = null;
		DatatypeFactory df = null;
		try {
			df = DatatypeFactory.newInstance();
		} catch (DatatypeConfigurationException e) {
			throw new ClientException(e);
		}
		xmlgc = df.newXMLGregorianCalendar(gregorianCalendar);
		xmlgc = xmlgc.normalize();
		xmlgc.setMillisecond(DatatypeConstants.FIELD_UNDEFINED);
		return xmlgc;
	}

	private static XMLGregorianCalendar getDate(Date date) {
		XMLGregorianCalendar xmlgc = null;
		DatatypeFactory df = null;
		try {
			df = DatatypeFactory.newInstance();
		} catch (DatatypeConfigurationException e) {
			throw new ClientException(e);
		}
		GregorianCalendar gc = new GregorianCalendar();
		gc.setTime(date);
		xmlgc = df.newXMLGregorianCalendar(gc);
		xmlgc.setMillisecond(DatatypeConstants.FIELD_UNDEFINED);
		xmlgc.setSecond(DatatypeConstants.FIELD_UNDEFINED);
		xmlgc.setMinute(DatatypeConstants.FIELD_UNDEFINED);
		xmlgc.setHour(DatatypeConstants.FIELD_UNDEFINED);
		xmlgc.setTimezone(DatatypeConstants.FIELD_UNDEFINED);
		return xmlgc;
	}

	private static String byteToHex(final byte[] hash) {
		Formatter formatter = new Formatter();
		for (byte b : hash) {
			formatter.format("%02x", b);
		}
		String result = formatter.toString();
		formatter.close();
		return result;
	}
}