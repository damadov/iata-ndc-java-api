package data;

public class HotelRules {
	public String  FirstDayCostCancellation;
	public String CancellationPolicy;
	public Rule[] rules;
	public String status;
	public String BookingCode;
	public String IntCode;
	
	public String getFirstDayCostCancellation() {
		return FirstDayCostCancellation;
	}
	public void setFirstDayCostCancellation(String firstDayCostCancellation) {
		FirstDayCostCancellation = firstDayCostCancellation;
	}
	public String getCancellationPolicy() {
		return CancellationPolicy;
	}
	public void setCancellationPolicy(String cancellationPolicy) {
		CancellationPolicy = cancellationPolicy;
	}

	public Rule[] getRules() {
		return rules;
	}
	public void setRules(Rule[] rules) {
		this.rules = rules;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getBookingCode() {
		return BookingCode;
	}
	public void setBookingCode(String bookingCode) {
		BookingCode = bookingCode;
	}
	public String getIntCode() {
		return IntCode;
	}
	public void setIntCode(String intCode) {
		IntCode = intCode;
	}
	
	
	
}
