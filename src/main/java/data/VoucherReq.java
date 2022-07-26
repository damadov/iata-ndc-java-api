package data;

public class VoucherReq {

	public String basket_guid;
	public String offer_guid;
	public String package_guid;
	public String cust_guid;
	public String pnr;
	public String lastname;
	public String firstname;
	public String source;
	
	
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getPnr() {
		return pnr;
	}
	public void setPnr(String pnr) {
		this.pnr = pnr;
	}
	public String getCust_guid() {
		return cust_guid;
	}
	public void setCust_guid(String cust_guid) {
		this.cust_guid = cust_guid;
	}
	public String getBasket_guid() {
		return basket_guid;
	}
	public void setBasket_guid(String basket_guid) {
		this.basket_guid = basket_guid;
	}
	public String getOffer_guid() {
		return offer_guid;
	}
	public void setOffer_guid(String offer_guid) {
		this.offer_guid = offer_guid;
	}
	public String getPackage_guid() {
		return package_guid;
	}
	public void setPackage_guid(String package_guid) {
		this.package_guid = package_guid;
	}
	
	
	
}
