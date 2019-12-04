package week3;

public class Methods {
	
	public static void main(String... args) {

		String a = new String("Hello");
		String b = a;
		
		System.out.println(a == b);
		
		for (int i = 0; i < 100; i += 2) {
			System.out.println(i);
		}
		
		int[] numbers = new int[10];
		
		for (int number : numbers) {
			if (number % 2 == 0) {
				System.out.println(number);
			}
		}
		
	}
	
	public static int squareLength(String word) {
		return multiply(word.length(), word.length());
	}
	
	public static int multiply(int a, int b) {
		return a * b;
	}
	
	//"racecar"
	public static boolean isPalindrome(String string) {
//		for (int i = 0; i < string.length() / 2; i++) {
//			if (string.charAt(i) != string.charAt(string.length() - i - 1)) {
//				return false;
//			}
//		}
//		return true;
		return new StringBuilder(string).reverse().toString().equals(string);
	}
	
	public static String findLongestString(String a, String b) {
		if (a.length() > b.length()) {
			return a;
		} else {
			return b;
		}
	}
	
	public static int findLargestNumber(int[] numbers) {
		int largestNumber = numbers[0];
		
		for (int number : numbers) {
			if (number > largestNumber) {
				largestNumber = number;
			}
		}
		
		return largestNumber;
	}

}
