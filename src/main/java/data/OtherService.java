package data;

public class OtherService {

	public String title;
	public String description;
	public String source;
	public String action_type;
	public String offer_guid;
	public String user_guid;
	public String company_code;
	public Float amount;
	public String currency;
	public Boolean isinternational=false;
	public String image_url;
	public Float org_amount;
	public String org_currency;
	public String service_type = "STD";
	
	
	public String getService_type() {
		return service_type;
	}
	public void setService_type(String service_type) {
		this.service_type = service_type;
	}
	public Float getOrg_amount() {
		return org_amount;
	}
	public void setOrg_amount(Float org_amount) {
		this.org_amount = org_amount;
	}
	public String getOrg_currency() {
		return org_currency;
	}
	public void setOrg_currency(String org_currency) {
		this.org_currency = org_currency;
	}
	public Float getAmount() {
		return amount;
	}
	public void setAmount(Float amount) {
		this.amount = amount;
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
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getAction_type() {
		return action_type;
	}
	public void setAction_type(String action_type) {
		this.action_type = action_type;
	}
	public String getOffer_guid() {
		return offer_guid;
	}
	public void setOffer_guid(String offer_guid) {
		this.offer_guid = offer_guid;
	}
	public String getUser_guid() {
		return user_guid;
	}
	public void setUser_guid(String user_guid) {
		this.user_guid = user_guid;
	}
	public String getCompany_code() {
		return company_code;
	}
	public void setCompany_code(String company_code) {
		this.company_code = company_code;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public Boolean getIsinternational() {
		return isinternational;
	}
	public void setIsinternational(Boolean isinternational) {
		this.isinternational = isinternational;
	}
	public String getImage_url() {
		return image_url;
	}
	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}
	
	
}
