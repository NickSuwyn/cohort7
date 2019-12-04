package reservationSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String... args) {
		
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter first name: ");
		String firstName = scanner.next();
		System.out.print("Enter last name: ");
		String lastName = scanner.next();
		
		User user = new User(firstName, lastName);
		
		new BookingFlow().start(user);
		
	}
	
}
