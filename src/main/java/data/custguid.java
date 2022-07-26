package data;

public class custguid {

	public String custguid;
	public int roomNo = 1;
	public String type="ADT";
	public String birthdate;
	//public String guid;
	//public String birtdate;
	

	public String getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}

	public String getCustguid() {
		return custguid;
	}

	public void setCustguid(String custguid) {
		this.custguid = custguid;
	}
}
