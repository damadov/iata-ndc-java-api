package data;

public class bookHotelParams{
	
	public String key;
	public String hotelId;
	public String roomId;
	public String source;
	public String cookie;
	public custguid[] custguid;
	public String offerId;
	public String fdate;
	public String rdate;
	public String price;
	public String currency;
	public Customer[] cust;
	public BookingDetails details;
	
	
	public BookingDetails getDetails() {
		return details;
	}
	public void setDetails(BookingDetails details) {
		this.details = details;
	}
	public Customer[] getCust() {
		return cust;
	}
	public void setCust(Customer[] cust) {
		this.cust = cust;
	}
	public String getFdate() {
		return fdate;
	}
	public void setFdate(String fdate) {
		this.fdate = fdate;
	}
	public String getRdate() {
		return rdate;
	}
	public void setRdate(String rdate) {
		this.rdate = rdate;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getOfferId() {
		return offerId;
	}
	public void setOfferId(String offerId) {
		this.offerId = offerId;
	}

	public custguid[] getCustguid() {
		return custguid;
	}
	public void setCustguid(custguid[] custguid) {
		this.custguid = custguid;
	}
	public String getCookie() {
		return cookie;
	}
	public void setCookie(String cookie) {
		this.cookie = cookie;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getHotelId() {
		return hotelId;
	}
	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}
	public String getRoomId() {
		return roomId;
	}
	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}
	
	
	
	
}