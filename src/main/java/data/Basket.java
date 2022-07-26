package data;

public class Basket {

	public String basket_guid;
	public String status;
	public String currency;
	public BasketOffer[] items;
	public int flight_count;
	public int hotel_count;
	public int car_count;
	public Customer[] custlist;
	public User user;
	public String creation_date;
	public String start_date;
	public String end_date;
	
	

	public String getStart_date() {
		return start_date;
	}

	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}

	public String getEnd_date() {
		return end_date;
	}

	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getCreation_date() {
		return creation_date;
	}

	public void setCreation_date(String creation_date) {
		this.creation_date = creation_date;
	}

	public Customer[] getCustlist() {
		return custlist;
	}

	public void setCustlist(Customer[] custlist) {
		this.custlist = custlist;
	}

	public int getFlight_count() {
		return flight_count;
	}

	public void setFlight_count(int flight_count) {
		this.flight_count = flight_count;
	}

	public int getHotel_count() {
		return hotel_count;
	}

	public void setHotel_count(int hotel_count) {
		this.hotel_count = hotel_count;
	}

	public int getCar_count() {
		return car_count;
	}

	public void setCar_count(int car_count) {
		this.car_count = car_count;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getBasket_guid() {
		return basket_guid;
	}

	public void setBasket_guid(String basket_guid) {
		this.basket_guid = basket_guid;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public BasketOffer[] getItems() {
		return items;
	}

	public void setItems(BasketOffer[] items) {
		this.items = items;
	}
	
	
	
}
