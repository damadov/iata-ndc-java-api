package data;

public class AiritineraryPrice {

	
	public Float BaseFare;
	public Float MarkupFare;
	public Float TotalFare;
	public Float TotalTax = (float) 0;
	public Tax[] Tax;
	public PassengerFare[] paxfares;
	public TicketDesignator[] tktdesigns;
	
	

	public Float getTotalTax() {
		return TotalTax;
	}
	public void setTotalTax(Float totalTax) {
		TotalTax = totalTax;
	}
	public Tax[] getTax() {
		return Tax;
	}
	public void setTax(Tax[] tax) {
		Tax = tax;
	}
	public Float getBaseFare() {
		return BaseFare;
	}
	public void setBaseFare(Float baseFare) {
		BaseFare = baseFare;
	}
	public Float getMarkupFare() {
		return MarkupFare;
	}
	public void setMarkupFare(Float markupFare) {
		MarkupFare = markupFare;
	}
	public Float getTotalFare() {
		return TotalFare;
	}
	public void setTotalFare(Float totalFare) {
		TotalFare = totalFare;
	}
	public PassengerFare[] getPaxfares() {
		return paxfares;
	}
	public void setPaxfares(PassengerFare[] paxfares) {
		this.paxfares = paxfares;
	}
	public TicketDesignator[] getTktdesigns() {
		return tktdesigns;
	}
	public void setTktdesigns(TicketDesignator[] tktdesigns) {
		this.tktdesigns = tktdesigns;
	}
}
