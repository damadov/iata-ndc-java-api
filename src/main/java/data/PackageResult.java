package data;

public class PackageResult {

	public String basket_guid;
	public String payment_key;
	public OfferFlightResult[] foffer;
	public AmadeusRoomResult[] hoffer;
	public AmadeusCarResult[] coffer;
	public float GrandTotal;
	public float TotalTax;
	public float Comissions;
	
	
	public String getPayment_key() {
		return payment_key;
	}
	public void setPayment_key(String payment_key) {
		this.payment_key = payment_key;
	}
	public String getBasket_guid() {
		return basket_guid;
	}
	public void setBasket_guid(String basket_guid) {
		this.basket_guid = basket_guid;
	}
	public float getGrandTotal() {
		return GrandTotal;
	}
	public void setGrandTotal(float grandTotal) {
		GrandTotal = grandTotal;
	}
	public float getTotalTax() {
		return TotalTax;
	}
	public void setTotalTax(float totalTax) {
		TotalTax = totalTax;
	}
	public float getComissions() {
		return Comissions;
	}
	public void setComissions(float comissions) {
		Comissions = comissions;
	}
	public OfferFlightResult[] getFoffer() {
		return foffer;
	}
	public void setFoffer(OfferFlightResult[] foffer) {
		this.foffer = foffer;
	}
	public AmadeusRoomResult[] getHoffer() {
		return hoffer;
	}
	public void setHoffer(AmadeusRoomResult[] hoffer) {
		this.hoffer = hoffer;
	}
	public AmadeusCarResult[] getCoffer() {
		return coffer;
	}
	public void setCoffer(AmadeusCarResult[] coffer) {
		this.coffer = coffer;
	}
	
	
}
