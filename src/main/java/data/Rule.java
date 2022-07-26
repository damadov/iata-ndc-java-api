package data;

public class Rule {

	public String DateFrom;
	public String DateFromHour;
	public String DateTo;
	public String DateToHour;
	public String Type;
	public float FixedPrice;
	public float PercentPrice;
	public int Nights;
	public String ApplicationTypeNights;
	public String getDateFrom() {
		return DateFrom;
	}
	public void setDateFrom(String dateFrom) {
		DateFrom = dateFrom;
	}
	public String getDateFromHour() {
		return DateFromHour;
	}
	public void setDateFromHour(String dateFromHour) {
		DateFromHour = dateFromHour;
	}
	public String getDateTo() {
		return DateTo;
	}
	public void setDateTo(String dateTo) {
		DateTo = dateTo;
	}
	public String getDateToHour() {
		return DateToHour;
	}
	public void setDateToHour(String dateToHour) {
		DateToHour = dateToHour;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public float getFixedPrice() {
		return FixedPrice;
	}
	public void setFixedPrice(float fixedPrice) {
		FixedPrice = fixedPrice;
	}
	public float getPercentPrice() {
		return PercentPrice;
	}
	public void setPercentPrice(float percentPrice) {
		PercentPrice = percentPrice;
	}
	public int getNights() {
		return Nights;
	}
	public void setNights(int nights) {
		Nights = nights;
	}
	public String getApplicationTypeNights() {
		return ApplicationTypeNights;
	}
	public void setApplicationTypeNights(String applicationTypeNights) {
		ApplicationTypeNights = applicationTypeNights;
	}
	
	
}
