package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {

	private Integer roomNumber;
	private Date checkIn;
	private Date checkOut;
	
	//O static é pra que nao precise criar um sdf pra cada objeto que a applicaçao tiver
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public Reservation(Integer roomNumber, Date checkIn, Date checkOut) {
		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Date getCheckIn() {
		return checkIn;
	}

	public Date getCheckOut() {
		return checkOut;
	}

	public long duration() {
		// checkIn ou checkOut mostra a duraçao em milissegundos, no caso é um long que
		// recebe a diferença entre os dois
		long diff = checkOut.getTime() - checkIn.getTime();
		// Escolhe a data o timeUnit em dias e depois converter, dentro vc passa o
		// tempo, no caso em milissegundos e informa que esta em milissegundos
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}
	
	public void updateDate(Date checkIn, Date checkOut) {
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	
	@Override
	public String toString() {
		return "Room " + roomNumber + ", Check In: " + sdf.format(checkIn)
		+ ", Check Out: " + sdf.format(checkOut) + ", " + duration() + "Nights";
		
	}

}
