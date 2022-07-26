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
import org.iata.ndc.schema.MsgDocumentType;
import org.iata.ndc.schema.MsgPartiesType;
import org.iata.ndc.schema.MsgPartiesType.Sender;
import org.iata.ndc.schema.ObjectFactory;
import org.iata.ndc.schema.SeatAvailabilityRQ;
import org.iata.ndc.schema.TravelAgencySenderType;
import org.iata.ndc.schema.TravelerCoreType.PTC;

public class SeatAvailabilityRQBuilder {

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

	private SeatAvailabilityRQ request;
	private static final ObjectFactory factory = new ObjectFactory();

	private Map<Traveler, Integer> anonymousTravelers;
	private Sender sender;

	private Set<String> airlines;
	private Set<String> fares;
	private Set<String> cabins;

	public SeatAvailabilityRQBuilder() {
		anonymousTravelers = new HashMap<SeatAvailabilityRQBuilder.Traveler, Integer>();
		airlines = new LinkedHashSet<String>();
		fares = new LinkedHashSet<String>();
		cabins = new LinkedHashSet<String>();

		request = Initializer.getObject(SeatAvailabilityRQ.class);
		sender = null;
	}

	public SeatAvailabilityRQBuilder addTravelAgencySender(String name, String iataNumber, String agencyId) {
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

	public SeatAvailabilityRQBuilder addAnonymousTraveler(Traveler traveler) {
		return addAnonymousTravelers(traveler, 1);
	}

	public SeatAvailabilityRQBuilder addAnonymousTravelers(Traveler traveler, int count) {
		if (!anonymousTravelers.containsKey(traveler)) {
			anonymousTravelers.put(traveler, count);
			return this;
		}
		Integer total = anonymousTravelers.get(traveler) + count;
		anonymousTravelers.put(traveler, total);
		return this;
	}

	public SeatAvailabilityRQBuilder addAirlinePreference(String airlineId) {
		airlines.add(airlineId);

		return this;
	}

	public SeatAvailabilityRQBuilder addFarePreference(String fareCode) {
		fares.add(fareCode);

		return this;
	}

	public SeatAvailabilityRQBuilder addCabinPreference(String cabinCode) {
		cabins.add(cabinCode);

		return this;
	}

	public SeatAvailabilityRQ build() {
		setDefaults();

		addRequestAttributes();
		addDocumentNode();
		addPartyNode();
		addTravelers();



		return request;
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
		document.setName("NDC SeatAvailabilityRQ Message");
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