package data;

public class pnrParams{
	
	public String pnr;
	public String lastname;
	public String source;
	public String action;
	public String tktnumber;
	public String userguid;
	
	
	public String getUserguid() {
		return userguid;
	}
	public void setUserguid(String userguid) {
		this.userguid = userguid;
	}
	public String getTktnumber() {
		return tktnumber;
	}
	public void setTktnumber(String tktnumber) {
		this.tktnumber = tktnumber;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
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
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	
	
}