package data;


public class BookingDetails {

	/*
	 * "comment": "Lorem ipsum dolor sit amet.",
	  "custlist": [
	    {
	      "cust_guid": "3143bf87-4770-444f-8de8-2c1b76ae7461"
	    }
	  ],
	  "details": {
	    "Honeymoon": true,
	    "NonSmoking": false,
	    "LateArrival": true,
	    "KingBed": false
	  },
	  "occupancy": "multi",
	  "offer_guid": "3cced939-0fca-483b-8d1c-db9c0b564ec2",
	  "action_type":"hotel"
	 */

	
	public String comment = "";
	public custguid[] custlist;
	public BookingDetailItems details;
	public String occupancy = "single";
	public String offer_guid = "";
	public String action_type = "hotel";
	public String status = "";
	
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public BookingDetailItems getDetails() {
		return details;
	}
	public void setDetails(BookingDetailItems details) {
		this.details = details;
	}
	public String getAction_type() {
		return action_type;
	}
	public void setAction_type(String action_type) {
		this.action_type = action_type;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public custguid[] getCustlist() {
		return custlist;
	}
	public void setCustlist(custguid[] custlist) {
		this.custlist = custlist;
	}

	public String getOccupancy() {
		return occupancy;
	}
	public void setOccupancy(String occupancy) {
		this.occupancy = occupancy;
	}
	public String getOffer_guid() {
		return offer_guid;
	}
	public void setOffer_guid(String offer_guid) {
		this.offer_guid = offer_guid;
	}
	
}
