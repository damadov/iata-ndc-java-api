package data;

public class PassengerFare {

	public String Code;
	public String Quantity;
	public Float BaseFare;
	public Float TotalTax;
	public Float TotalFare;
	public Float ServiceFee;
	public Float MarkupFare;
	public String Currency;
	public Tax[] tax;
	
	
	public Float getMarkupFare() {
		return MarkupFare;
	}
	public void setMarkupFare(Float markupFare) {
		MarkupFare = markupFare;
	}
	public Float getServiceFee() {
		return ServiceFee;
	}
	public void setServiceFee(Float serviceFee) {
		ServiceFee = serviceFee;
	}
	public String getCurrency() {
		return Currency;
	}
	public void setCurrency(String currency) {
		Currency = currency;
	}
	public Tax[] getTax() {
		return tax;
	}
	public void setTax(Tax[] tax) {
		this.tax = tax;
	}
	public String getCode() {
		return Code;
	}
	public void setCode(String code) {
		Code = code;
	}
	public String getQuantity() {
		return Quantity;
	}
	public void setQuantity(String quantity) {
		Quantity = quantity;
	}
	public Float getBaseFare() {
		return BaseFare;
	}
	public void setBaseFare(Float baseFare) {
		BaseFare = baseFare;
	}
	public Float getTotalTax() {
		return TotalTax;
	}
	public void setTotalTax(Float totalTax) {
		TotalTax = totalTax;
	}
	public Float getTotalFare() {
		return TotalFare;
	}
	public void setTotalFare(Float totalFare) {
		TotalFare = totalFare;
	}
}
