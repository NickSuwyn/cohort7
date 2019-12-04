package week4;

import java.util.ArrayList;
import java.util.List;

public class SubstringTest {
	
	public static void main(String... args) {
		
		List<String> addresses = new ArrayList<String>();
		addresses.add("1234 E Easy St. Phoenix, AZ");
		addresses.add("1235 E Easy St. Mesa, AZ");
		addresses.add("1236 E Easy St. Scottsdale, AZ");
		addresses.add("1237 E Easy St. Tempe, AZ");
		addresses.add("1238 E Easy St. Mesa, AZ");
		addresses.add("1238 E Easy St. Salt Lake, UT");
		
		List<String> mesaAddresses = findStringsWithSubstring(addresses, "Mesa");
		List<String> azAddresses = findStringsWithSubstring(addresses, "AZ");
		
		System.out.println("Mesa\n--------------------");
		for (String s : mesaAddresses) {
			System.out.println(s);
		}
		
		System.out.println("\nAZ\n--------------------");
		for (String s : azAddresses) {
			System.out.println(s);
		}
		
	}
	
	public static List<String> findStringsWithSubstring(List<String> list, String string) {
		List<String> results = new ArrayList<String>();
		
		for (String s : list) {
			if (s.contains(string)) {
				results.add(s);
			}
		}
		
		return results;
	}

}
