package data;

public class Pnr{
	
	
	public String pnr;
	public String lastname;
	public String basket_guid;
	public String timelimit;
	public Boolean isticketed;
	public String status;
	public String source;
	public String userguid;
	public Flights[] flights;
	public Customer[] custlist;
	public String pnrView;
	public String ltd;
	public Ticket[] tktlist;
	public String refId;
	public String action;
	public String voucher_guid;
	public Invoice invoice;
	public OfferFlightResult offer;
	public String error;
	public PaymentData[] payment;
	public Button[] services;
	public String offer_guid;
	public String onlinecheckinurl;
	
	

	public String getOnlinecheckinurl() {
		return onlinecheckinurl;
	}
	public void setOnlinecheckinurl(String onlinecheckinurl) {
		this.onlinecheckinurl = onlinecheckinurl;
	}
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
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public String getBasket_guid() {
		return basket_guid;
	}
	public void setBasket_guid(String basket_guid) {
		this.basket_guid = basket_guid;
	}
	public OfferFlightResult getOffer() {
		return offer;
	}
	public void setOffer(OfferFlightResult offer) {
		this.offer = offer;
	}
	public Invoice getInvoice() {
		return invoice;
	}
	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
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
	public String getRefId() {
		return refId;
	}
	public void setRefId(String refId) {
		this.refId = refId;
	}
	public Ticket[] getTktlist() {
		return tktlist;
	}
	public void setTktlist(Ticket[] tktlist) {
		this.tktlist = tktlist;
	}
	public String getLtd() {
		return ltd;
	}
	public void setLtd(String ltd) {
		this.ltd = ltd;
	}
	public String getPnrView() {
		return pnrView;
	}
	public void setPnrView(String pnrView) {
		this.pnrView = pnrView;
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
	public Flights[] getFlights() {
		return flights;
	}
	public void setFlights(Flights[] flights) {
		this.flights = flights;
	}

	
}