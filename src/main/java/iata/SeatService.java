package iata;


import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.iata.ndc.schema.ListOfSeatType;
import org.iata.ndc.schema.SeatAvailabilityRS;
import org.iata.ndc.schema.SeatLocationType;
import org.iata.ndc.schema.SeatMapRowNbrType;

import iata.objects.Compartment;
import iata.objects.Seat;
import iata.objects.SeatPosition;
import iata.httpclient.ApacheHttpClient;

public final class SeatService {

	private SeatAvailabilityRS seatAvailability;
	private HashMap<String, Seat> availableSeats = new HashMap<>();
	private HashMap<String, Seat> ndcAvailableSeats = new HashMap<>();

	public SeatService() {
		String xmlRequest;
		try {
			URI uri = ClassLoader.getSystemResource("seatAvailabilityRQ").toURI();
			Path path = Paths.get(uri);
			byte[] readAllBytes = Files.readAllBytes(path);
			xmlRequest = new String(readAllBytes);
			seatAvailability = ApacheHttpClient.seatAvailability(xmlRequest);
			findNDCAvailableSeats();
			setUpFakeSeats();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
		
	}

	public Seat getSeat(String key) {
		if(availableSeats.get(key) != null) {
			 Seat seat = availableSeats.get(key);
			 // finish auction if time passed
			 if (seat.getBidStart()!=null && LocalDateTime.now().isAfter(seat.getBidStart().plusMinutes(5))) {
					seat.setSold(true);
					// do nothing
					System.out.println("auction is finished");
				}
			 return seat;
		} else {
			return new Seat();
		}
	}
	
	public List<Seat> getAvailableSeats() {
		 return new ArrayList<Seat>(availableSeats.values());
	}
	
	public Seat bitOnSeat(String key, int value, String user) {
		Seat seat = availableSeats.get(key);
		
		// check if bidding is allowed
		if(!seat.isSold()) {
		
		// if time is 0 start time
			if(seat.getBidStart() == null) {
				seat.setBidStart(LocalDateTime.now());
			}
			if (LocalDateTime.now().isAfter(seat.getBidStart().plusMinutes(5))) {
				seat.setSold(true);
				// do nothing
				System.out.println("auction is finished");
			} else {
				// bid (must be higher)
				if(value > seat.getPrice()) {
					seat.setPrice(value);
					seat.setCurrentBidder(user);
				} else {
					System.out.println("bid must be higher then current bid");
				}
			}
		

		}
		
		return seat;
	}
	
	private void setUpFakeSeats() {
		Seat seatFirst = new Seat();
		seatFirst.setCompartment(Compartment.FIRST);
		seatFirst.setColumn("A");
		seatFirst.setRow(1);
		seatFirst.setMinutesLeft(5);
		seatFirst.setSecondsLeft(0);
		seatFirst.setSeatPosition(SeatPosition.WINDOW);
		seatFirst.setTemperature(21);
		seatFirst.setPrice(999);
		seatFirst.setSold(false);
		
		Seat seatBusiness = new Seat();
		seatBusiness.setCompartment(Compartment.BUSINESS);
		seatBusiness.setColumn("C");
		seatBusiness.setRow(12);
		seatBusiness.setMinutesLeft(5);
		seatBusiness.setSecondsLeft(0);
		seatBusiness.setSeatPosition(SeatPosition.AISLE);
		seatBusiness.setTemperature(21);
		seatBusiness.setPrice(450);
		seatBusiness.setSold(false);
		
		Seat seatPE = new Seat();
		seatPE.setCompartment(Compartment.PREMIUM_ECO);
		seatPE.setColumn("D");
		seatPE.setRow(27);
		seatPE.setMinutesLeft(5);
		seatPE.setSecondsLeft(0);
		seatPE.setSeatPosition(SeatPosition.MIDDLE);
		seatPE.setTemperature(23);
		seatPE.setPrice(99);
		seatPE.setSold(false);
		
		availableSeats.put(seatFirst.getRow()+""+seatFirst.getColumn(), seatFirst);
		availableSeats.put(seatBusiness.getRow()+""+seatBusiness.getColumn(), seatBusiness);
		availableSeats.put(seatPE.getRow()+""+seatPE.getColumn(), seatPE);
	}
	
	private void findNDCAvailableSeats() {
		// find empty (isAssociateInd) seats
		for (ListOfSeatType listOfSeats : seatAvailability.getDataLists().getSeatList()) {
			for (SeatLocationType.Characteristic characteristic :listOfSeats.getLocation().getCharacteristics()) {
//				if(characteristic.isExitRowInd() != null && !characteristic.isAssociateInd()) {
					String column = listOfSeats.getLocation().getColumn();
					String row = listOfSeats.getLocation().getRow().getNumber().getValue();
					Seat seat = new Seat();
					seat.setColumn(column);
					seat.setRow(Integer.valueOf(row));
					
					ndcAvailableSeats.put(row+""+column, seat);
//				}
			}
		}
	}
	
	
	public Seat getSeat() {
		String column = seatAvailability.getDataLists().getSeatList().get(0).getLocation().getColumn();
		SeatMapRowNbrType row = seatAvailability.getDataLists().getSeatList().get(0).getLocation().getRow().getNumber();

		Seat seat = new Seat();
		seat.setColumn(column);
		seat.setRow(Integer.valueOf(row.getValue()));
		return seat;
	}

	public boolean restSeats() {
		availableSeats.clear();
		setUpFakeSeats();
		return true;
	}
	
}
