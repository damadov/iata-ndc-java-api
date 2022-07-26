package data;


public class AmadeusHotelResult
{
	public String CityCode;
	public String CountyCode;
	public String HotelId;
	public String HotelCode;
	public String HotelName;
	public String HotelDescShort;
	public String HotelDescLong;
	public String HotelCurrency;
	public String DestinationCode;
	public String Latitude;
	public String Longitude;
	public String Rating;
	public String ThumbnailImage;
	public String HotelAmenity;
	public String MinRate;
	public String MaxRate;
	public String CheckInDate;
	public String CheckOutDate;	
	public String CheckInTime;
	public String CheckOutTime;
	public AmenityList JSONamenity;
	public String ChainCode;
	public String ChainName;
	public SpecialPriceData special;
	
	public String OfferId;
	public String cookie;
	public String source;
	public String key;
	public String stars;
	public String Address;
	public Image[] images;
	public AmadeusRoomResult[] rooms;
	public String action;
	public String telephone;
	public String email;
	public double centerDistance = 0.0;
	public double airportDistance = 0.0;
	public String centerMapLink;
	public String airportMapLink;

	

	public String getCenterMapLink() {
		return centerMapLink;
	}

	public void setCenterMapLink(String centerMapLink) {
		this.centerMapLink = centerMapLink;
	}

	public String getAirportMapLink() {
		return airportMapLink;
	}

	public void setAirportMapLink(String airportMapLink) {
		this.airportMapLink = airportMapLink;
	}

	public double getAirportDistance() {
		return airportDistance;
	}

	public void setAirportDistance(double airportDistance) {
		this.airportDistance = airportDistance;
	}

	public double getCenterDistance() {
		return centerDistance;
	}

	public void setCenterDistance(double centerDistance) {
		this.centerDistance = centerDistance;
	}

	public String getDestinationCode() {
		return DestinationCode;
	}

	public void setDestinationCode(String destinationCode) {
		DestinationCode = destinationCode;
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

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public AmadeusRoomResult[] getRooms() {
		return rooms;
	}

	public void setRooms(AmadeusRoomResult[] rooms) {
		this.rooms = rooms;
	}

	public String getHotelDescShort() {
		return HotelDescShort;
	}

	public void setHotelDescShort(String hotelDescShort) {
		HotelDescShort = hotelDescShort;
	}

	public String getHotelDescLong() {
		return HotelDescLong;
	}

	public void setHotelDescLong(String hotelDescLong) {
		HotelDescLong = hotelDescLong;
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

	public Image[] getImages() {
		return images;
	}

	public void setImages(Image[] images) {
		this.images = images;
	}

	public String getKey() {
	return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public SpecialPriceData getSpecial() {
		return special;
	}

	public void setSpecial(SpecialPriceData special) {
		this.special = special;
	}

	public String getOfferId() {
		return OfferId;
	}

	public void setOfferId(String offerId) {
		OfferId = offerId;
	}

	public String getCookie() {
		return cookie;
	}

	public void setCookie(String cookie) {
		this.cookie = cookie;
	}



	public AmenityList getJSONamenity() {
		return JSONamenity;
	}

	public void setJSONamenity(AmenityList jSONamenity) {
		JSONamenity = jSONamenity;
	}

	public String getChainCode() {
		return ChainCode;
	}

	public void setChainCode(String chainCode) {
		ChainCode = chainCode;
	}

	public String getChainName() {
		return ChainName;
	}

	public void setChainName(String chainName) {
		ChainName = chainName;
	}

	public String getCityCode() {
		return CityCode;
	}

	public void setCityCode(String cityCode) {
		CityCode = cityCode;
	}

	public String getCountyCode() {
		return CountyCode;
	}

	public void setCountyCode(String countyCode) {
		CountyCode = countyCode;
	}

	public String getHotelId() {
		return HotelId;
	}

	public void setHotelId(String hotelId) {
		HotelId = hotelId;
	}

	public String getHotelCode() {
		return HotelCode;
	}

	public void setHotelCode(String hotelCode) {
		HotelCode = hotelCode;
	}

	public String getHotelName() {
		return HotelName;
	}

	public void setHotelName(String hotelName) {
		HotelName = hotelName;
	}

	public String getHotelCurrency() {
		return HotelCurrency;
	}

	public void setHotelCurrency(String hotelCurrency) {
		HotelCurrency = hotelCurrency;
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

	public String getRating() {
		return Rating;
	}

	public void setRating(String rating) {
		Rating = rating;
	}

	public String getThumbnailImage() {
		return ThumbnailImage;
	}

	public void setThumbnailImage(String thumbnailImage) {
		ThumbnailImage = thumbnailImage;
	}

	public String getHotelAmenity() {
		return HotelAmenity;
	}

	public void setHotelAmenity(String hotelAmenity) {
		HotelAmenity = hotelAmenity;
	}

	public String getMinRate() {
		return MinRate;
	}

	public void setMinRate(String minRate) {
		MinRate = minRate;
	}

	public String getMaxRate() {
		return MaxRate;
	}

	public void setMaxRate(String maxRate) {
		MaxRate = maxRate;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}
	
	
	
}