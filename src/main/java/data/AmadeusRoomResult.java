package data;


public class AmadeusRoomResult
{

	public String roomId;
	public String RoomType;
	public String BedTypeCode;
	public int Quantity;
	public String RoomDescription;
	public Float AmountAfterTax;
	public Float MarkupAmount = (float) 0;
	public Float Commission = (float) 0;
	public Boolean IsDailyPrice;
	public Boolean IsRateChange;
	public String GuaranteeCode;
	public String HotelId;
	public String HotelCurrency;
	public String HotelAmenity;
	public String HotelCode;
	public String HotelName;
	public String HotelLongDesc="";
	public String HotelChainCode;
	public String HotelChainName;
	public String DestinationCode;
	public String OfferId;
	public String HotelImageUrl;
	public String source;
	public String CheckInTime = "14:00";
	public String CheckOutTime = "10:00";
	public String cookie;
public String key;
public String desc;
public String status;
public String CheckInDate;
public String CheckOutDate;
public String Latitude;
public String Longitude;
public String MaxRate;
public String MinRate;
public AmenityList JSONamenity;
public String Rating;
public String stars;
public String Address;

public SpecialPriceData special;
public Boolean isNonRefundable;
public Image[] images;
public float OrgAmount ;
public String OrgCurrency;
public String CityCode;
public String City;
public String Country;
public Customer[] custlist;
public String telephone;
public String email;
public String Board;
public String keywords;
public double centerDistance = 0.0;
public String pnrstr;
public String payStatus;



	public String getPayStatus() {
	return payStatus;
}

public void setPayStatus(String payStatus) {
	this.payStatus = payStatus;
}

	public String getPnrstr() {
	return pnrstr;
}

public void setPnrstr(String pnrstr) {
	this.pnrstr = pnrstr;
}

	public double getCenterDistance() {
	return centerDistance;
}

public void setCenterDistance(double centerDistance) {
	this.centerDistance = centerDistance;
}

	public String getHotelLongDesc() {
	return HotelLongDesc;
}

public void setHotelLongDesc(String hotelLongDesc) {
	HotelLongDesc = hotelLongDesc;
}

	public String getKeywords() {
	return keywords;
}

public void setKeywords(String keywords) {
	this.keywords = keywords;
}

	public String getDestinationCode() {
	return DestinationCode;
}

public void setDestinationCode(String destinationCode) {
	DestinationCode = destinationCode;
}

	public String getStatus() {
	return status;
}

public void setStatus(String status) {
	this.status = status;
}

	public Float getCommission() {
	return Commission;
}

public void setCommission(Float commission) {
	Commission = commission;
}

	public String getBoard() {
	return Board;
}

public void setBoard(String board) {
	Board = board;
}

	public Image[] getImages() {
	return images;
}

public void setImages(Image[] images) {
	this.images = images;
}

	public String getTelephone() {
	return telephone;
}

public void setTelephone(String telephone) {
	this.telephone = telephone;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

	public Customer[] getCustlist() {
	return custlist;
}

public void setCustlist(Customer[] custlist) {
	this.custlist = custlist;
}

	public String getCityCode() {
	return CityCode;
}

public void setCityCode(String cityCode) {
	CityCode = cityCode;
}

public String getCity() {
	return City;
}

public void setCity(String city) {
	City = city;
}

public String getCountry() {
	return Country;
}

public void setCountry(String country) {
	Country = country;
}

	public float getOrgAmount() {
	return OrgAmount;
}

public void setOrgAmount(float orgAmount) {
	OrgAmount = orgAmount;
}

public String getOrgCurrency() {
	return OrgCurrency;
}

public void setOrgCurrency(String orgCurrency) {
	OrgCurrency = orgCurrency;
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

	public Boolean getIsNonRefundable() {
	return isNonRefundable;
}

public void setIsNonRefundable(Boolean isNonRefundable) {
	this.isNonRefundable = isNonRefundable;
}

	public String getDesc() {
	return desc;
}

public void setDesc(String desc) {
	this.desc = desc;
}


public String getHotelChainName() {
	return HotelChainName;
}

public void setHotelChainName(String hotelChainName) {
	HotelChainName = hotelChainName;
}

public String getCookie() {
	return cookie;
}

public void setCookie(String cookie) {
	this.cookie = cookie;
}


public String getLatitude() {
	return Latitude;
}

public void setLatitude(String latitude) {
	Latitude = latitude;
}

public String getLongitude() {
	return Longitude;
}

public void setLongitude(String longitude) {
	Longitude = longitude;
}

public String getMaxRate() {
	return MaxRate;
}

public void setMaxRate(String maxRate) {
	MaxRate = maxRate;
}

public String getMinRate() {
	return MinRate;
}

public void setMinRate(String minRate) {
	MinRate = minRate;
}

public AmenityList getJSONamenity() {
	return JSONamenity;
}

public void setJSONamenity(AmenityList jSONamenity) {
	JSONamenity = jSONamenity;
}

public String getRating() {
	return Rating;
}

public void setRating(String rating) {
	Rating = rating;
}

public String getStars() {
	return stars;
}

public void setStars(String stars) {
	this.stars = stars;
}

public String getAddress() {
	return Address;
}

public void setAddress(String address) {
	Address = address;
}


	public SpecialPriceData getSpecial() {
	return special;
}

public void setSpecial(SpecialPriceData special) {
	this.special = special;
}

	public String getKey() {
	return key;
}

public void setKey(String key) {
	this.key = key;
}

	public String getHotelId() {
		return HotelId;
	}

	public void setHotelId(String hotelId) {
		HotelId = hotelId;
	}

	public String getHotelImageUrl() {
		return HotelImageUrl;
	}

	public void setHotelImageUrl(String hotelImageUrl) {
		HotelImageUrl = hotelImageUrl;
	}

	public String getHotelName() {
		return HotelName;
	}

	public void setHotelName(String hotelName) {
		HotelName = hotelName;
	}

	public String getOfferId() {
		return OfferId;
	}

	public void setOfferId(String offerId) {
		OfferId = offerId;
	}

	public String getHotelCurrency() {
		return HotelCurrency;
	}

	public void setHotelCurrency(String hotelCurrency) {
		HotelCurrency = hotelCurrency;
	}

	public String getHotelAmenity() {
		return HotelAmenity;
	}

	public void setHotelAmenity(String hotelAmenity) {
		HotelAmenity = hotelAmenity;
	}

	public String getHotelCode() {
		return HotelCode;
	}

	public void setHotelCode(String hotelCode) {
		HotelCode = hotelCode;
	}

	public String getHotelChainCode() {
		return HotelChainCode;
	}

	public void setHotelChainCode(String hotelChainCode) {
		HotelChainCode = hotelChainCode;
	}

	public String getRoomId() {
		return roomId;
	}

	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}

	public String getRoomType() {
		return RoomType;
	}

	public void setRoomType(String roomType) {
		RoomType = roomType;
	}

	public String getBedTypeCode() {
		return BedTypeCode;
	}

	public void setBedTypeCode(String bedTypeCode) {
		BedTypeCode = bedTypeCode;
	}

	public int getQuantity() {
		return Quantity;
	}

	public void setQuantity(int quantity) {
		Quantity = quantity;
	}

	public String getRoomDescription() {
		return RoomDescription;
	}

	public void setRoomDescription(String roomDescription) {
		RoomDescription = roomDescription;
	}


	public Float getAmountAfterTax() {
		return AmountAfterTax;
	}

	public void setAmountAfterTax(Float amountAfterTax) {
		AmountAfterTax = amountAfterTax;
	}

	public Float getMarkupAmount() {
		return MarkupAmount;
	}

	public void setMarkupAmount(Float markupAmount) {
		MarkupAmount = markupAmount;
	}

	public Boolean getIsDailyPrice() {
		return IsDailyPrice;
	}

	public void setIsDailyPrice(Boolean isDailyPrice) {
		IsDailyPrice = isDailyPrice;
	}

	public String getGuaranteeCode() {
		return GuaranteeCode;
	}

	public void setGuaranteeCode(String guaranteeCode) {
		GuaranteeCode = guaranteeCode;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public Boolean getIsRateChange() {
		return IsRateChange;
	}

	public void setIsRateChange(Boolean isRateChange) {
		IsRateChange = isRateChange;
	}

	

}