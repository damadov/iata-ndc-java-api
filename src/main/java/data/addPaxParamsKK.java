package data;

public class addPaxParamsKK{
	
	public String depvoyagecode;
	public String retvoyagecode;
	public String depclass;
	public String retclass;
	public String faresamount;
	public String referenceId;
	public custguid[] custlist;


	public custguid[] getCustlist() {
		return custlist;
	}
	public void setCustlist(custguid[] custlist) {
		this.custlist = custlist;
	}
	public String getReferenceId() {
		return referenceId;
	}
	public void setReferenceId(String referenceId) {
		this.referenceId = referenceId;
	}
	public String getDepvoyagecode() {
		return depvoyagecode;
	}
	public void setDepvoyagecode(String depvoyagecode) {
		this.depvoyagecode = depvoyagecode;
	}
	public String getRetvoyagecode() {
		return retvoyagecode;
	}
	public void setRetvoyagecode(String retvoyagecode) {
		this.retvoyagecode = retvoyagecode;
	}
	public String getDepclass() {
		return depclass;
	}
	public void setDepclass(String depcalss) {
		this.depclass = depcalss;
	}
	public String getRetclass() {
		return retclass;
	}
	public void setRetclass(String retclass) {
		this.retclass = retclass;
	}
	public String getFaresamount() {
		return faresamount;
	}
	public void setFaresamount(String faresamount) {
		this.faresamount = faresamount;
	}

	
	
	
}