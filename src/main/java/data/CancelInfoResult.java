package data;

public class CancelInfoResult{
	
	public String pnr;
	public String currency;
	public String totalBackPrice;
	public String totalFlightPrice;
	public String totalPenaltyPrice;	
	public String totalServiceFee;
	public String getPnr() {
		return pnr;
	}
	public void setPnr(String pnr) {
		this.pnr = pnr;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getTotalBackPrice() {
		return totalBackPrice;
	}
	public void setTotalBackPrice(String totalBackPrice) {
		this.totalBackPrice = totalBackPrice;
	}
	public String getTotalFlightPrice() {
		return totalFlightPrice;
	}
	public void setTotalFlightPrice(String totalFlightPrice) {
		this.totalFlightPrice = totalFlightPrice;
	}
	public String getTotalPenaltyPrice() {
		return totalPenaltyPrice;
	}
	public void setTotalPenaltyPrice(String totalPenaltyPrice) {
		this.totalPenaltyPrice = totalPenaltyPrice;
	}
	public String getTotalServiceFee() {
		return totalServiceFee;
	}
	public void setTotalServiceFee(String totalServiceFee) {
		this.totalServiceFee = totalServiceFee;
	}
	
	
}