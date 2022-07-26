package data;

public class OfferPackage {

	
	public String offerGuid;
	public Float totalAmount;
	public Float budget;
	public Customer cust;	
	public OfferItem[] item;



	public String getOfferGuid() {
		return offerGuid;
	}

	public void setOfferGuid(String offerGuid) {
		this.offerGuid = offerGuid;
	}

	public Float getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Float totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Float getBudget() {
		return budget;
	}

	public void setBudget(Float budget) {
		this.budget = budget;
	}

	public Customer getCust() {
		return cust;
	}

	public void setCust(Customer cust) {
		this.cust = cust;
	}

	public OfferItem[] getItem() {
		return item;
	}

	public void setItem(OfferItem[] item) {
		this.item = item;
	}
	
	
}
