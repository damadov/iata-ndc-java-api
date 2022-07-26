package data;

public class BasketOffers {

	public OfferFlightResult[] flightoffers;
	public OfferHotelResult[] hoteloffers;
	public AmadeusCarResult[] caroffers;
	public Transfer[] transfers;
	public Visa[] visas;
	public String currency;
	public String basket_guid;
	public float amount;
	public int count;
	
	
	public AmadeusCarResult[] getCaroffers() {
		return caroffers;
	}
	public void setCaroffers(AmadeusCarResult[] caroffers) {
		this.caroffers = caroffers;
	}
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
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public String getBasket_guid() {
		return basket_guid;
	}
	public void setBasket_guid(String basket_guid) {
		this.basket_guid = basket_guid;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public OfferFlightResult[] getFlightoffers() {
		return flightoffers;
	}
	public void setFlightoffers(OfferFlightResult[] flightoffers) {
		this.flightoffers = flightoffers;
	}
	public OfferHotelResult[] getHoteloffers() {
		return hoteloffers;
	}
	public void setHoteloffers(OfferHotelResult[] hoteloffers) {
		this.hoteloffers = hoteloffers;
	}
	
	
}
