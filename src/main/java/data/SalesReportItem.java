package data;

public class SalesReportItem {

	public String action_date;
	public String currency;
	public float fare;
	public float tax;
	public float other;
	public float commission;
	public float vat_base;
	public float vat_amount;
	public String vat_ratio;
	public float total;
	public String pnr;
	public String ticket;
	public String company_code;
	public String department;
	
	
	public String getCompany_code() {
		return company_code;
	}
	public void setCompany_code(String company_code) {
		this.company_code = company_code;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getAction_date() {
		return action_date;
	}
	public void setAction_date(String action_date) {
		this.action_date = action_date;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public float getFare() {
		return fare;
	}
	public void setFare(float fare) {
		this.fare = fare;
	}
	public float getTax() {
		return tax;
	}
	public void setTax(float tax) {
		this.tax = tax;
	}
	public float getOther() {
		return other;
	}
	public void setOther(float other) {
		this.other = other;
	}
	public float getCommission() {
		return commission;
	}
	public void setCommission(float commission) {
		this.commission = commission;
	}
	public float getVat_base() {
		return vat_base;
	}
	public void setVat_base(float vat_base) {
		this.vat_base = vat_base;
	}
	public float getVat_amount() {
		return vat_amount;
	}
	public void setVat_amount(float vat_amount) {
		this.vat_amount = vat_amount;
	}
	public String getVat_ratio() {
		return vat_ratio;
	}
	public void setVat_ratio(String vat_ratio) {
		this.vat_ratio = vat_ratio;
	}
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}
	public String getPnr() {
		return pnr;
	}
	public void setPnr(String pnr) {
		this.pnr = pnr;
	}
	public String getTicket() {
		return ticket;
	}
	public void setTicket(String ticket) {
		this.ticket = ticket;
	}
	
	
}

