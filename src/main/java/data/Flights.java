package data;

public class Flights{
	public String dep;
	public String arr;
	public String fnumber;
	public String fdate;
	public String flighttime;
	public String estimatedtime;
	public String marketing;
	public String operating;
	public String status;
	public Boolean isConnectingFlight;
	public String index;
	public Boolean arrivalOnNextDay;
	

	public Boolean getArrivalOnNextDay() {
		return arrivalOnNextDay;
	}
	public void setArrivalOnNextDay(Boolean arrivalOnNextDay) {
		this.arrivalOnNextDay = arrivalOnNextDay;
	}
	public String getIndex() {
		return index;
	}
	public void setIndex(String index) {
		this.index = index;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Boolean getIsConnectingFlight() {
		return isConnectingFlight;
	}
	public void setIsConnectingFlight(Boolean isConnectingFlight) {
		this.isConnectingFlight = isConnectingFlight;
	}
	public String getDep() {
		return dep;
	}
	public void setDep(String dep) {
		this.dep = dep;
	}
	public String getArr() {
		return arr;
	}
	public void setArr(String arr) {
		this.arr = arr;
	}
	public String getFnumber() {
		return fnumber;
	}
	public void setFnumber(String fnumber) {
		this.fnumber = fnumber;
	}
	public String getFdate() {
		return fdate;
	}
	public void setFdate(String fdate) {
		this.fdate = fdate;
	}
	public String getFlighttime() {
		return flighttime;
	}
	public void setFlighttime(String flighttime) {
		this.flighttime = flighttime;
	}
	public String getEstimatedtime() {
		return estimatedtime;
	}
	public void setEstimatedtime(String estimatedtime) {
		this.estimatedtime = estimatedtime;
	}
	public String getMarketing() {
		return marketing;
	}
	public void setMarketing(String marketing) {
		this.marketing = marketing;
	}
	public String getOperating() {
		return operating;
	}
	public void setOperating(String operating) {
		this.operating = operating;
	}
}
