package data;

public class Tax{
	public String passenger_type;
	public String tax_code;
	public Float tax;
	public String currency;
	public Boolean isRefundable = false;
	
	
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public Boolean getIsRefundable() {
		return isRefundable;
	}
	public void setIsRefundable(Boolean isRefundable) {
		this.isRefundable = isRefundable;
	}
	public String getPassenger_type() {
		return passenger_type;
	}
	public void setPassenger_type(String passenger_type) {
		this.passenger_type = passenger_type;
	}
	public String getTax_code() {
		return tax_code;
	}
	public void setTax_code(String tax_code) {
		this.tax_code = tax_code;
	}
	public Float getTax() {
		return tax;
	}
	public void setTax(Float tax) {
		this.tax = tax;
	}
	
}