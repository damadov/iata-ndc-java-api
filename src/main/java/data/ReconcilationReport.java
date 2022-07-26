package data;

public class ReconcilationReport {

	public String company_code;
	public String company_name;
	public String action_date;
	public String action;
	public String pnr;
	public String ticket_number;
	public String pax_name;
	public String pax_type;
	public int vat;
	public String currency;
	public float total_amount;
	public float fare;
	public float tax;
	public float surcharge;
	public float markup;
	public float commission;
	public String comm_curr;
	public float service_fee;
	public float penalty;
	public String offer_guid;
	public String basket_guid;
	public String payment_key;
	public int agency_id;
	public String agency_name;
	public Tax[] taxes;
	public String supplier_code;
	public float min_offer;
	public String minOfferBrand;
	public float offer_diff;
	


	public String getComm_curr() {
		return comm_curr;
	}
	public void setComm_curr(String comm_curr) {
		this.comm_curr = comm_curr;
	}
	public float getPenalty() {
		return penalty;
	}
	public void setPenalty(float penalty) {
		this.penalty = penalty;
	}
	public float getOffer_diff() {
		return offer_diff;
	}
	public void setOffer_diff(float offer_diff) {
		this.offer_diff = offer_diff;
	}
	public String getMinOfferBrand() {
		return minOfferBrand;
	}
	public void setMinOfferBrand(String minOfferBrand) {
		this.minOfferBrand = minOfferBrand;
	}

	public float getMin_offer() {
		return min_offer;
	}
	public void setMin_offer(float min_offer) {
		this.min_offer = min_offer;
	}
	public String getSupplier_code() {
		return supplier_code;
	}
	public void setSupplier_code(String supplier_code) {
		this.supplier_code = supplier_code;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public int getAgency_id() {
		return agency_id;
	}
	public void setAgency_id(int agency_id) {
		this.agency_id = agency_id;
	}
	public String getCompany_code() {
		return company_code;
	}
	public void setCompany_code(String company_code) {
		this.company_code = company_code;
	}
	public Tax[] getTaxes() {
		return taxes;
	}
	public void setTaxes(Tax[] taxes) {
		this.taxes = taxes;
	}
	public String getCompany_name() {
		return company_name;
	}
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	public String getAction_date() {
		return action_date;
	}
	public void setAction_date(String action_date) {
		this.action_date = action_date;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public String getPnr() {
		return pnr;
	}
	public void setPnr(String pnr) {
		this.pnr = pnr;
	}
	public String getTicket_number() {
		return ticket_number;
	}
	public void setTicket_number(String ticket_number) {
		this.ticket_number = ticket_number;
	}
	public String getPax_name() {
		return pax_name;
	}
	public void setPax_name(String pax_name) {
		this.pax_name = pax_name;
	}
	public String getPax_type() {
		return pax_type;
	}
	public void setPax_type(String pax_type) {
		this.pax_type = pax_type;
	}
	public int getVat() {
		return vat;
	}
	public void setVat(int vat) {
		this.vat = vat;
	}
	public float getTotal_amount() {
		return total_amount;
	}
	public void setTotal_amount(float total_amount) {
		this.total_amount = total_amount;
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
	public float getSurcharge() {
		return surcharge;
	}
	public void setSurcharge(float surcharge) {
		this.surcharge = surcharge;
	}
	public float getMarkup() {
		return markup;
	}
	public void setMarkup(float markup) {
		this.markup = markup;
	}
	public float getCommission() {
		return commission;
	}
	public void setCommission(float commission) {
		this.commission = commission;
	}
	public float getService_fee() {
		return service_fee;
	}
	public void setService_fee(float service_fee) {
		this.service_fee = service_fee;
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
	public String getPayment_key() {
		return payment_key;
	}
	public void setPayment_key(String payment_key) {
		this.payment_key = payment_key;
	}
	public String getAgency_name() {
		return agency_name;
	}
	public void setAgency_name(String agency_name) {
		this.agency_name = agency_name;
	}
	
	
}


/*1,"id","int4","NO",null,"nextval('report_reconcilation_id_seq'::regclass)","",null
2,"action","varchar","YES",null,null,"",null
3,"vat","int2","YES",null,null,"",null
4,"total_amount","float4","YES",null,null,"",null
5,"fare","float4","YES",null,null,"",null
6,"tax","float4","YES",null,null,"",null
7,"surcharge","float4","YES",null,null,"",null
8,"markup","float4","YES",null,null,"",null
9,"commission","float4","YES",null,null,"",null
10,"service_fee","float4","YES",null,null,"",null
11,"ticket_number","varchar","YES",null,null,"",null
12,"pax_name","varchar","YES",null,null,"",null
13,"pax_type","varchar","YES",null,null,"",null
14,"offer_guid","varchar","YES",null,null,"",null
15,"basket_guid","varchar","YES",null,null,"",null
16,"payment_key","varchar","YES",null,null,"",null
17,"creation_date","timestamp","YES",null,"now()","",null
18,"action_date","varchar","YES",null,null,"",null
19,"agency_id","int4","YES",null,null,"",null
20,"company_id","int4","YES",null,null,"",null
21,"pnr","varchar","YES",null,null,"",null
*/