package reservationSystem;

import java.util.List;
import java.util.Scanner;

public class BookingFlow {
	
	private List<Hotel> hotels;
	
	public BookingFlow() {
		hotels = new HotelDB().getHotels();
	}
	
	public void start(User user) {
		Scanner scanner = new Scanner(System.in);
		
		while(1 == 1) {
			displayHotels();
			
			System.out.print("Which hotel would you like? ");
			int hotelIndex = scanner.nextInt();
			
			System.out.print("Which room would you like? ");
			int roomIndex = scanner.nextInt();
			
			Room room = hotels.get(hotelIndex)
				.getRooms()
				.get(roomIndex);
			
			room.setAvailable(false);
			
			Reservation reservation = new Reservation();
			reservation.setHotel(hotels.get(hotelIndex));
			reservation.setRoom(room);
			
			user.addReservation(reservation);
			
			System.out.println("Reservations:\n---------------------------");
			user.displayReservations();
			
		}
		
		
	}
	
	private void displayHotels() {
		System.out.println("Hotels\n-------------------");
		for (Hotel hotel : hotels) {
			System.out.println(hotel.getName() + "\nAddress: " + hotel.getAddress() + "\nRating: " + hotel.getAverageRating() + "\n");
			int i = 0;
			for (Room room : hotel.getRooms()) {
				if (room.isAvailable()) {
					System.out.println(i + " " + room.getBedType() + " " + room.getSize() + "SF Smoking: " + room.isSmokingAllowed());
				}
				i++;
				
			}
			System.out.println("\n\n");
		}
	}

}
