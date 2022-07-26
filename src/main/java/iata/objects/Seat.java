package iata.objects;

import java.time.LocalDateTime;

public class Seat {

	private String Column;
	private int row;
	private int price;
	private int minutesLeft;
	private int secondsLeft;
	private int temperature;
	private boolean sold;
	private SeatPosition seatPosition;
	private String currentBidder;
	private Compartment compartment;
	private LocalDateTime bidStart;
	
	public LocalDateTime getBidStart() {
		return bidStart;
	}
	public void setBidStart(LocalDateTime bidStart) {
		this.bidStart = bidStart;
	}
	public Compartment getCompartment() {
		return compartment;
	}
	public void setCompartment(Compartment compartment) {
		this.compartment = compartment;
	}
	public String getCurrentBidder() {
		return currentBidder;
	}
	public void setCurrentBidder(String currentBidder) {
		this.currentBidder = currentBidder;
	}
	public String getColumn() {
		return Column;
	}
	public void setColumn(String column) {
		Column = column;
	}
	public int getRow() {
		return row;
	}
	public void setRow(int row) {
		this.row = row;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getMinutesLeft() {
		return minutesLeft;
	}
	public void setMinutesLeft(int minutesLeft) {
		this.minutesLeft = minutesLeft;
	}
	public int getSecondsLeft() {
		return secondsLeft;
	}
	public void setSecondsLeft(int secondsLeft) {
		this.secondsLeft = secondsLeft;
	}
	public int getTemperature() {
		return temperature;
	}
	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}
	public boolean isSold() {
		return sold;
	}
	public void setSold(boolean sold) {
		this.sold = sold;
	}
	public SeatPosition getSeatPosition() {
		return seatPosition;
	}
	public void setSeatPosition(SeatPosition seatPosition) {
		this.seatPosition = seatPosition;
	}
	
	
	
}