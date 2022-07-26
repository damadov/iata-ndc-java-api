package data;

public class Provision {

	public Boolean status = false;
	public String offer_guid;
	public String basket_guid;
	public Error[] error;
	public String description;
	
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	public String getOffer_guid() {
		return offer_guid;
	}
	public void setOffer_guid(String offer_guid) {
		this.offer_guid = offer_guid;
	}
	public String getBasket_guid() {
		return basket_guid;
	}
	public void setBasket_guid(String basket_guid) {
		this.basket_guid = basket_guid;
	}
	public Error[] getError() {
		return error;
	}
	public void setError(Error[] error) {
		this.error = error;
	}

	
}
