package data;

public class HotelAgreementRooms {

	public int id;
	public String agreement_guid;
	public String room_guid;
	public String room_title;
	public String room_desc;
	public String room_type;
	public Float extra_bed;
	public Float price;
	public String currency;
	public int status_id;
	public String creation_date;
	public String image_url;
	public String bed_type;
	public Boolean isrefundable;
	public String board;
	public Boolean isvatincluded;
	public Float vat;
	public String user_guid;
	
	
	public String getRoom_guid() {
		return room_guid;
	}
	public void setRoom_guid(String room_guid) {
		this.room_guid = room_guid;
	}
	public String getUser_guid() {
		return user_guid;
	}
	public void setUser_guid(String user_guid) {
		this.user_guid = user_guid;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAgreement_guid() {
		return agreement_guid;
	}
	public void setAgreement_guid(String agreement_guid) {
		this.agreement_guid = agreement_guid;
	}
	public String getRoom_title() {
		return room_title;
	}
	public void setRoom_title(String room_title) {
		this.room_title = room_title;
	}
	public String getRoom_desc() {
		return room_desc;
	}
	public void setRoom_desc(String room_desc) {
		this.room_desc = room_desc;
	}
	public String getRoom_type() {
		return room_type;
	}
	public void setRoom_type(String room_type) {
		this.room_type = room_type;
	}
	public Float getExtra_bed() {
		return extra_bed;
	}
	public void setExtra_bed(Float extra_bed) {
		this.extra_bed = extra_bed;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public int getStatus_id() {
		return status_id;
	}
	public void setStatus_id(int status_id) {
		this.status_id = status_id;
	}
	public String getCreation_date() {
		return creation_date;
	}
	public void setCreation_date(String creation_date) {
		this.creation_date = creation_date;
	}
	public String getImage_url() {
		return image_url;
	}
	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}
	public String getBed_type() {
		return bed_type;
	}
	public void setBed_type(String bed_type) {
		this.bed_type = bed_type;
	}
	public Boolean getIsrefundable() {
		return isrefundable;
	}
	public void setIsrefundable(Boolean isrefundable) {
		this.isrefundable = isrefundable;
	}
	public String getBoard() {
		return board;
	}
	public void setBoard(String board) {
		this.board = board;
	}
	public Boolean getIsvatincluded() {
		return isvatincluded;
	}
	public void setIsvatincluded(Boolean isvatincluded) {
		this.isvatincluded = isvatincluded;
	}
	public Float getVat() {
		return vat;
	}
	public void setVat(Float vat) {
		this.vat = vat;
	}
}	
