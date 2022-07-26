package data;

public class budget {

	public Boolean enabled;
	public String currency;
	public float total;
	public float remaining;
	
	public Boolean getEnabled() {
		return enabled;
	}
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}
	public float getRemaining() {
		return remaining;
	}
	public void setRemaining(float remaining) {
		this.remaining = remaining;
	}
	
	
}
