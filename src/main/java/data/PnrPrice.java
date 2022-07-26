package data;

public class PnrPrice {

	public String pnr;
	public Customer[] custlist;
	public Airitinerary airitin;
	public AiritineraryPrice airitinprice;
	public Invoice invoice;
	public PaymentCard payinfo;
	public String timelimit;
	public String tickettype;
	public PassengerFare[] paxfares;
	
	public String getPnr() {
		return pnr;
	}
	public void setPnr(String pnr) {
		this.pnr = pnr;
	}
	public Customer[] getCustlist() {
		return custlist;
	}
	public void setCustlist(Customer[] custlist) {
		this.custlist = custlist;
	}
	public Airitinerary getAiritin() {
		return airitin;
	}
	public void setAiritin(Airitinerary airitin) {
		this.airitin = airitin;
	}
	public AiritineraryPrice getAiritinprice() {
		return airitinprice;
	}
	public void setAiritinprice(AiritineraryPrice airitinprice) {
		this.airitinprice = airitinprice;
	}
	public Invoice getInvoice() {
		return invoice;
	}
	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}
	public PaymentCard getPayinfo() {
		return payinfo;
	}
	public void setPayinfo(PaymentCard payinfo) {
		this.payinfo = payinfo;
	}
	public String getTimelimit() {
		return timelimit;
	}
	public void setTimelimit(String timelimit) {
		this.timelimit = timelimit;
	}
	public String getTickettype() {
		return tickettype;
	}
	public void setTickettype(String tickettype) {
		this.tickettype = tickettype;
	}
	public PassengerFare[] getPaxfares() {
		return paxfares;
	}
	public void setPaxfares(PassengerFare[] paxfares) {
		this.paxfares = paxfares;
	}
	
	
}
