package data;

public class bookCarParams{
	
	public String key;
	public String vendorId;
	public String vehicleId;
	public String source;
	public custguid[] custguid;
	public String cookie;
	
	
	public String getCookie() {
		return cookie;
	}
	public void setCookie(String cookie) {
		this.cookie = cookie;
	}

	public custguid[] getCustguid() {
		return custguid;
	}
	public void setCustguid(custguid[] custguid) {
		this.custguid = custguid;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getVendorId() {
		return vendorId;
	}
	public void setVendorId(String vendorId) {
		this.vendorId = vendorId;
	}
	public String getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(String vehicleId) {
		this.vehicleId = vehicleId;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	
	
	
}