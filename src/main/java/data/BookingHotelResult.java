package data;

public class BookingHotelResult {

	
	public String pnr;
	public String referenceId;
	public String source;
	public String limitdate;
	public String limittime;
	public String log;
	public String status;
	public String lastname;
	public String title;
	public int adt;
	public int chd;
	public int inf;
	public Customer[] custlist;
	public String json;
	public String userguid;
	public String error;
	public String CheckInDate;
	public String CheckOutDate;
	public String CheckInTime;
	public String CheckOutTime;
	public String Board;
	public String Comments;
	public BookingDetails details;
	
	
	public BookingDetails getDetails() {
		return details;
	}
	public void setDetails(BookingDetails details) {
		this.details = details;
	}
	public String getBoard() {
		return Board;
	}
	public void setBoard(String board) {
		Board = board;
	}
	public String getComments() {
		return Comments;
	}
	public void setComments(String comments) {
		Comments = comments;
	}
	public String getCheckInDate() {
		return CheckInDate;
	}
	public void setCheckInDate(String checkInDate) {
		CheckInDate = checkInDate;
	}
	public String getCheckOutDate() {
		return CheckOutDate;
	}
	public void setCheckOutDate(String checkOutDate) {
		CheckOutDate = checkOutDate;
	}
	public String getCheckInTime() {
		return CheckInTime;
	}
	public void setCheckInTime(String checkInTime) {
		CheckInTime = checkInTime;
	}
	public String getCheckOutTime() {
		return CheckOutTime;
	}
	public void setCheckOutTime(String checkOutTime) {
		CheckOutTime = checkOutTime;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
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
