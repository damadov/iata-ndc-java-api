package data;

public class offerParams {

	public String offerid;
	public custguid[] custguid;
	public String type;
	public Boolean createTicket = false;
	public String fop = "ca";
	public Boolean isCompany = true;
	public Boolean isRepeat = false;
	
	
	public Boolean getIsRepeat() {
		return isRepeat;
	}
	public void setIsRepeat(Boolean isRepeat) {
		this.isRepeat = isRepeat;
	}
	public Boolean getIsCompany() {
		return isCompany;
	}
	public void setIsCompany(Boolean isCompany) {
		this.isCompany = isCompany;
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public custguid[] getCustguid() {
		return custguid;
	}
	public void setCustguid(custguid[] custguid) {
		this.custguid = custguid;
	}
	public String getOfferid() {
		return offerid;
	}
	public void setOfferid(String offerid) {
		this.offerid = offerid;
	}
	
	
}
