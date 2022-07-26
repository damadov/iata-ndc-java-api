package data;

public class Coordinate {

	public String title;
	public double longitude;
	public double latitude;
	public Boolean isCity=false;
	public Boolean isAirport=false;
	public Boolean isHotel=false;
	public Boolean isPlace=false;
	
	
	public Boolean getIsCity() {
		return isCity;
	}
	public void setIsCity(Boolean isCity) {
		this.isCity = isCity;
	}
	public Boolean getIsAirport() {
		return isAirport;
	}
	public void setIsAirport(Boolean isAirport) {
		this.isAirport = isAirport;
	}
	public Boolean getIsHotel() {
		return isHotel;
	}
	public void setIsHotel(Boolean isHotel) {
		this.isHotel = isHotel;
	}
	public Boolean getIsPlace() {
		return isPlace;
	}
	public void setIsPlace(Boolean isPlace) {
		this.isPlace = isPlace;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	
	
}
