package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Reservation;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Room number: ");
		int number = sc.nextInt();
		System.out.print("Check-in date (dd/mm/yyy): ");
		Date checkIn = sdf.parse(sc.next());
		System.out.print("Check-in date (dd/mm/yyy): ");
		Date checkOut = sdf.parse(sc.next());
		// Usa uma data pra fazer comparaçao com outra
		if (checkIn.after(checkOut)) {
			System.out.println("Error in reservation: Check-out date must be after check-in date");
		} else {
			Reservation reservation = new Reservation(number, checkIn, checkOut);
			System.out.println("Reservation: " + reservation);

			System.out.println();
			System.out.println("Enter data to update the reservation: ");
			System.out.print("Check-in date (dd/mm/yyy): ");
			checkIn = sdf.parse(sc.next());
			System.out.print("Check-in date (dd/mm/yyy): ");
			checkOut = sdf.parse(sc.next());
			
			String error = reservation.updateDate(checkIn, checkOut);
			if (error != null) {
				System.out.println("Error in reservation: " + error);
			} else {
				System.out.println("Reservatio: " + reservation);
			}

		}

		sc.close();

	}

}
