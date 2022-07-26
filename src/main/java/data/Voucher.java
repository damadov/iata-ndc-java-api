package data;

public class Voucher {

	public String voucher_guid;
	public String voucher_code;
	Pnr[] flights;
	HotelPnr[] hotels;
	Customer[] custlist;
	String user_guid;
	
	
	public String getVoucher_code() {
		return voucher_code;
	}
	public void setVoucher_code(String voucher_code) {
		this.voucher_code = voucher_code;
	}
	public String getUser_guid() {
		return user_guid;
	}
	public void setUser_guid(String user_guid) {
		this.user_guid = user_guid;
	}
	public Customer[] getCustlist() {
		return custlist;
	}
	public void setCustlist(Customer[] custlist) {
		this.custlist = custlist;
	}
	public String getVoucher_guid() {
		return voucher_guid;
	}
	public void setVoucher_guid(String voucher_guid) {
		this.voucher_guid = voucher_guid;
	}
	public Pnr[] getFlights() {
		return flights;
	}
	public void setFlights(Pnr[] flights) {
		this.flights = flights;
	}
	public HotelPnr[] getHotels() {
		return hotels;
	}
	public void setHotels(HotelPnr[] hotels) {
		this.hotels = hotels;
	}
	
	
}
