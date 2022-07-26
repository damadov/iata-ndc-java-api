package data;

public class basketParams {

	public class custguid {
		public String custguid;

		public String getCustguid() {
			return custguid;
		}

		public void setCustguid(String custguid) {
			this.custguid = custguid;
		}
		
		
	}
	
	public class offerlist{
		public String offer_guid;
		public String action_type;

		public String getOffer_guid() {
			return offer_guid;
		}

		public void setOffer_guid(String offer_guid) {
			this.offer_guid = offer_guid;
		}

		public String getAction_type() {
			return action_type;
		}

		public void setAction_type(String action_type) {
			this.action_type = action_type;
		}
		
		
	}
	
	public String basket_guid;
	public String action_type;
	public String offer_guid;
	public custguid[] custguid;
	public offerlist[] offerlist;
	public Boolean isCompany = true;
	public Boolean createTicket = false;
	public String status = "READY";

	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Boolean getIsCompany() {
		return isCompany;
	}
	public void setIsCompany(Boolean isCompany) {
		this.isCompany = isCompany;
	}
	public Boolean getCreateTicket() {
		return createTicket;
	}
	public void setCreateTicket(Boolean createTicket) {
		this.createTicket = createTicket;
	}
	public offerlist[] getOfferlist() {
		return offerlist;
	}
	public void setOfferlist(offerlist[] offerlist) {
		this.offerlist = offerlist;
	}
	public custguid[] getCustguid() {
		return custguid;
	}
	public void setCustguid(custguid[] custguid) {
		this.custguid = custguid;
	}
	public String getBasket_guid() {
		return basket_guid;
	}
	public void setBasket_guid(String basket_guid) {
		this.basket_guid = basket_guid;
	}
	public String getAction_type() {
		return action_type;
	}
	public void setAction_type(String action_type) {
		this.action_type = action_type;
	}
	public String getOffer_guid() {
		return offer_guid;
	}
	public void setOffer_guid(String offer_guid) {
		this.offer_guid = offer_guid;
	}
	
	
}
