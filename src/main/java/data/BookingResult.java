package data;

public class BookingResult {

	
	public String pnr;
	public String referenceId;
	public Ticket[] tickets;
	public String source;
	public String limitdate;
	public String limittime;
	public String log;
	public Boolean isticketed;
	public String status;
	public String lastname;
	public String title;
	public int adt;
	public int chd;
	public int inf;
	public Customer[] custlist;
	public String json;
	public String userguid;
	public String action_type;
	public String error;
	public String company_code;
	public String company;
	public String basket_guid;
	public String creation_date;
	public String start_date;
	public String end_date;
	
	
	public String getStart_date() {
		return start_date;
	}
	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}
	public String getEnd_date() {
		return end_date;
	}
	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}
	public String getCreation_date() {
		return creation_date;
	}
	public void setCreation_date(String creation_date) {
		this.creation_date = creation_date;
	}
	public String getBasket_guid() {
		return basket_guid;
	}
	public void setBasket_guid(String basket_guid) {
		this.basket_guid = basket_guid;
	}
	public String getCompany_code() {
		return company_code;
	}
	public void setCompany_code(String company_code) {
		this.company_code = company_code;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public String getAction_type() {
		return action_type;
	}
	public void setAction_type(String action_type) {
		this.action_type = action_type;
	}
	public String getUserguid() {
		return userguid;
	}
	public void setUserguid(String userguid) {
		this.userguid = userguid;
	}
	public String getJson() {
		return json;
	}
	public void setJson(String json) {
		this.json = json;
	}
	public Customer[] getCustlist() {
		return custlist;
	}
	public void setCustlist(Customer[] custlist) {
		this.custlist = custlist;
	}
	public int getAdt() {
		return adt;
	}
	public void setAdt(int adt) {
		this.adt = adt;
	}
	public int getChd() {
		return chd;
	}
	public void setChd(int chd) {
		this.chd = chd;
	}
	public int getInf() {
		return inf;
	}
	public void setInf(int inf) {
		this.inf = inf;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Boolean getIsticketed() {
		return isticketed;
	}
	public void setIsticketed(Boolean isticketed) {
		this.isticketed = isticketed;
	}
	public String getLog() {
		return log;
	}
	public void setLog(String log) {
		this.log = log;
	}
	public String getLimitdate() {
		return limitdate;
	}
	public void setLimitdate(String limitdate) {
		this.limitdate = limitdate;
	}
	public String getLimittime() {
		return limittime;
	}
	public void setLimittime(String limittime) {
		this.limittime = limittime;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public Ticket[] getTickets() {
		return tickets;
	}
	public void setTickets(Ticket[] tickets) {
		this.tickets = tickets;
	}
	public String getPnr() {
		return pnr;
	}
	public void setPnr(String pnr) {
		this.pnr = pnr;
	}
	public String getReferenceId() {
		return referenceId;
	}
	public void setReferenceId(String referenceId) {
		this.referenceId = referenceId;
	}
	
	
	
}
