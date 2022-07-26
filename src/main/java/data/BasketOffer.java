package data;

public class BasketOffer {

	public String offer_guid;
	public OfferFlightResult[] flights;
	public AmadeusRoomResult[] hotels;
	public AmadeusCarResult[] cars;
	public Visa[] visas;
	public Transfer[] transfers;
	public String status;
	
	
	public Transfer[] getTransfers() {
		return transfers;
	}
	public void setTransfers(Transfer[] transfers) {
		this.transfers = transfers;
	}
	public Visa[] getVisas() {
		return visas;
	}
	public void setVisas(Visa[] visas) {
		this.visas = visas;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getOffer_guid() {
		return offer_guid;
	}
	public void setOffer_guid(String offer_guid) {
		this.offer_guid = offer_guid;
	}
	public OfferFlightResult[] getFlights() {
		return flights;
	}
	public void setFlights(OfferFlightResult[] flights) {
		this.flights = flights;
	}

	public AmadeusRoomResult[] getHotels() {
		return hotels;
	}
	public void setHotels(AmadeusRoomResult[] hotels) {
		this.hotels = hotels;
	}
	public AmadeusCarResult[] getCars() {
		return cars;
	}
	public void setCars(AmadeusCarResult[] cars) {
		this.cars = cars;
	}
	
	
}
