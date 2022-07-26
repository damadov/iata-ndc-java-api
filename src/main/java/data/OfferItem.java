package data;

public class OfferItem {

	public enum OfferType{		
		 flight,
		 hotel,
		 car,
		 train,
		 insurance,
		 commission,
		 servicefee		
	}
	
	public int index;
	public String title;
	public String description;
	public Float tax;
	public Float amount;
	public Float totalAmount;
	public OfferType type;
	
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Float getTax() {
		return tax;
	}
	public void setTax(Float tax) {
		this.tax = tax;
	}
	public Float getAmount() {
		return amount;
	}
	public void setAmount(Float amount) {
		this.amount = amount;
	}
	public Float getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(Float totalAmount) {
		this.totalAmount = totalAmount;
	}
	public OfferType getType() {
		return type;
	}
	public void setType(OfferType type) {
		this.type = type;
	}
	
	
	
}
