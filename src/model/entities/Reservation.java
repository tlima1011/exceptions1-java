package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
	
	//Atributos 
	private Integer roomNumber; 
	private Date checkIn;
	private Date checkOut; 
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");  
	//Construtores 
	public Reservation() { 
		
	}

	public Reservation(Integer roomNumber, Date checkIn, Date checkOut) {
		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	//Getters and Setters 
	public Integer getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}
	public Date getCheckin() {
		return checkIn;
	}
	public Date getCheckout() {
		return checkOut;
	}
	public long duration() {
		long diff = checkOut.getTime() - checkIn.getTime(); 
		return TimeUnit.DAYS.convert(diff,TimeUnit.MILLISECONDS);
	}
	public void updateDates(Date checkIn, Date checkOut) {
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	@Override
	public String toString() {
		return "Room: " + roomNumber 
				+ ", checkIn: " + sdf.format(checkIn) 
				+ ", checkOut: " + sdf.format(checkOut) 
				+ ", " +duration()
				+ " nights.";
	}
	
	

}
