package reservationSystem;

import java.util.ArrayList;
import java.util.List;

public class User {
	
	private String firstName;
	private String lastName;
	private List<Reservation> reservations = new ArrayList<Reservation>();
	
	public User(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public void displayReservations() {
		for (Reservation reservation : reservations) {
			System.out.println(reservation.getHotel().getName() + " " + reservation.getRoom().getBedType());
		}
	}
	
	public void addReservation(Reservation reservation) {
		reservations.add(reservation);
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}
