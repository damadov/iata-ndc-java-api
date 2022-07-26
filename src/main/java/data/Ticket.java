package data;

public class Ticket {

	public String tktnumber;
	public String pax;
	public String paxType;
	public String tktLink;
	public String paxNo;
	public String status;
	public String fareCalculation;
	public String ticketingDate;
	public String cust_guid;
	
	
	public String getCust_guid() {
		return cust_guid;
	}
	public void setCust_guid(String cust_guid) {
		this.cust_guid = cust_guid;
	}
	public String getTicketingDate() {
		return ticketingDate;
	}
	public void setTicketingDate(String ticketingDate) {
		this.ticketingDate = ticketingDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getFareCalculation() {
		return fareCalculation;
	}
	public void setFareCalculation(String fareCalculation) {
		this.fareCalculation = fareCalculation;
	}
	public String getPaxNo() {
		return paxNo;
	}
	public void setPaxNo(String paxNo) {
		this.paxNo = paxNo;
	}
	public String getTktLink() {
		return tktLink;
	}
	public void setTktLink(String tktLink) {
		this.tktLink = tktLink;
	}
	public String getTktnumber() {
		return tktnumber;
	}
	public void setTktnumber(String tktnumber) {
		this.tktnumber = tktnumber;
	}
	public String getPax() {
		return pax;
	}
	public void setPax(String pax) {
		this.pax = pax;
	}
	public String getPaxType() {
		return paxType;
	}
	public void setPaxType(String paxType) {
		this.paxType = paxType;
	}
	
}
