package data;

public class HotelPnr{
	
	
	public String pnr;
	public String lastname;
	public String basket_guid;
	public String timelimit;
	public Boolean isticketed;
	public String status;
	public String source;
	public String userguid;
	public Customer[] custlist;
	public String json;
	public String hotelName;
	public String hotelCode;
	public String latitude;
	public String longitude;
	public String startDate;
	public String endDate;
	public String hotelImage;
	public String rating;
	public String MinRate;
	public String MaxRate;
	public String action;
	public String voucher_guid;
	public AmadeusRoomResult offer;
	public String Board;
	public String Comments;
	public String Policy;
	public Error[] errors;
	public PaymentData[] payment;
	public Button[] services;
public String offer_guid;
	

	public String getOffer_guid() {
	return offer_guid;
}
public void setOffer_guid(String offer_guid) {
	this.offer_guid = offer_guid;
}
	public Button[] getServices() {
		return services;
	}
	public void setServices(Button[] services) {
		this.services = services;
	}
	public PaymentData[] getPayment() {
		return payment;
	}
	public void setPayment(PaymentData[] payment) {
		this.payment = payment;
	}
	public String getBasket_guid() {
		return basket_guid;
	}
	public void setBasket_guid(String basket_guid) {
		this.basket_guid = basket_guid;
	}
	public Error[] getErrors() {
		return errors;
	}
	public void setErrors(Error[] errors) {
		this.errors = errors;
	}
	public String getBoard() {
		return Board;
	}
	public void setBoard(String board) {
		Board = board;
	}
	public String getComments() {
		return Comments;
	}
	public void setComments(String comments) {
		Comments = comments;
	}
	public String getPolicy() {
		return Policy;
	}
	public void setPolicy(String policy) {
		Policy = policy;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public AmadeusRoomResult getOffer() {
		return offer;
	}
	public void setOffer(AmadeusRoomResult offer) {
		this.offer = offer;
	}
	public String getVoucher_guid() {
		return voucher_guid;
	}
	public void setVoucher_guid(String voucher_guid) {
		this.voucher_guid = voucher_guid;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public String getMinRate() {
		return MinRate;
	}
	public void setMinRate(String minRate) {
		MinRate = minRate;
	}
	public String getMaxRate() {
		return MaxRate;
	}
	public void setMaxRate(String maxRate) {
		MaxRate = maxRate;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public String getHotelImage() {
		return hotelImage;
	}
	public void setHotelImage(String hotelImage) {
		this.hotelImage = hotelImage;
	}
	public String getJson() {
		return json;
	}
	public void setJson(String json) {
		this.json = json;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public String getHotelCode() {
		return hotelCode;
	}
	public void setHotelCode(String hotelCode) {
		this.hotelCode = hotelCode;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public Customer[] getCustlist() {
		return custlist;
	}
	public void setCustlist(Customer[] custlist) {
		this.custlist = custlist;
	}
	public String getUserguid() {
		return userguid;
	}
	public void setUserguid(String userguid) {
		this.userguid = userguid;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getPnr() {
		return pnr;
	}
	public void setPnr(String pnr) {
		this.pnr = pnr;
	}
	public String getTimelimit() {
		return timelimit;
	}
	public void setTimelimit(String timelimit) {
		this.timelimit = timelimit;
	}
	public Boolean getIsticketed() {
		return isticketed;
	}
	public void setIsticketed(Boolean isticketed) {
		this.isticketed = isticketed;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	
}