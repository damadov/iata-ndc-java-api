package data;

public class bookFlightParams{
	
	public String key;
	public String recommendationId;
	public String combinationId;
	public custguid[] custguid;
	public String cookie;
	public String offerId;
	public Boolean createTicket = false;
	public String fop;
	public Customer[] customer;
	public OfferFlightResult offer;
	
	
	public OfferFlightResult getOffer() {
		return offer;
	}
	public void setOffer(OfferFlightResult offer) {
		this.offer = offer;
	}
	public Customer[] getCustomer() {
		return customer;
	}
	public void setCustomer(Customer[] customer) {
		this.customer = customer;
	}
	public String getFop() {
		return fop;
	}
	public void setFop(String fop) {
		this.fop = fop;
	}
	public Boolean getCreateTicket() {
		return createTicket;
	}
	public void setCreateTicket(Boolean createTicket) {
		this.createTicket = createTicket;
	}
	public String getOfferId() {
		return offerId;
	}
	public void setOfferId(String offerId) {
		this.offerId = offerId;
	}
	public String getCookie() {
		return cookie;
	}
	public void setCookie(String cookie) {
		this.cookie = cookie;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getRecommendationId() {
		return recommendationId;
	}
	public void setRecommendationId(String recommendationId) {
		this.recommendationId = recommendationId;
	}
	public String getCombinationId() {
		return combinationId;
	}
	public void setCombinationId(String combinationId) {
		this.combinationId = combinationId;
	}
	public custguid[] getCustguid() {
		return custguid;
	}
	public void setCustguid(custguid[] custguid) {
		this.custguid = custguid;
	}
	
	
	
	
}