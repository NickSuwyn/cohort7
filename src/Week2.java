import java.util.Scanner;

public class Week2 {

	public static void main(String[] args) {
		
//		String username = "user1";
//		String password = "12345";
//		boolean isUserLoggedIn = false;
//		int numberOfAttempts = 0;
//		
//		Scanner scanner = new Scanner(System.in);
//		
//		while (!isUserLoggedIn && numberOfAttempts < 3) {
//			System.out.print("Enter username: ");
//			String usernameInput = scanner.nextLine();
//			System.out.print("Enter password: ");
//			String passwordInput = scanner.nextLine();
//			
//			if (usernameInput.equals(username) && passwordInput.equals(password)) {
//				System.out.println("Successfully logged in!");
//				isUserLoggedIn = true;
//			} else {
//				System.out.println("Incorrect username or password.");
//				numberOfAttempts++;
//				if (numberOfAttempts > 2) {
//					System.out.println("This account has been locked. Try back later.");
//				}
//			}
//			
//			System.out.print("Do you want to try again? (yes/no): ");
//			String selection = scanner.nextLine();
//			
//			if (selection.equals("no")) {
//				numberOfAttempts = 3;
//			}
//		}
//		
		
		
		for (int i = 1; i < 10; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");;
			}
			
			System.out.println();
		}
		
	}
	
}
