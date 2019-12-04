package week4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Maps {
	
	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("Hello ");
		sb.append("World");
		
		System.out.println(sb.toString());
		
		String myString = "";
		
		for (int i = 0; i < 100; i++) {
			myString += i;
		}
		
		Map<Integer, String> customers = new HashMap<Integer, String>();
		
		customers.put(10001, "Tom Sawyer");
		customers.put(10002, "Tom Riddle");
		
		List<String> names = new ArrayList<String>();
		names.add("Tom");
		names.add("Sam");
		names.add("Sallie");
		names.add("Mae");
		names.add("Sue");
		names.add("Tony");
		names.add("April");
		names.add("James");
		names.add("Tony");
		names.add("Sue");
		names.add("Mae");
		names.add("Sue");
		
		Map<String, Integer> nameCounts = countOccurrences(names);
		
		System.out.println(nameCounts.toString());
		
		int[] array = doubleArray(new int[] {1, 2, 3, 4, 5});
		for (int i : array) {
			System.out.println(i);
		}
		
		String str = "Hello World";
		
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}
		
		System.out.println(countPossibleTeams("stemstemstemssttmmm"));
		
	}
	/*
	 * Takes a string consisting of letters S T E M (i.e. "steeemstmmmes")
	 * string.charAt(index) returns character at that index
	 */
	
	public static int countPossibleTeams(String people) {
		Map<Character, Integer> countMap = new HashMap<Character, Integer>();
		
		for (int i = 0; i < people.length(); i++) {
			char c = people.charAt(i);
			if (countMap.containsKey(c)) {
				countMap.put(c, countMap.get(c) + 1);
			} else {
				countMap.put(c, 1);
			}
		}
		
		return Collections.min(countMap.values());
	}
	
	public static int[] doubleArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] = array[i] * 2;
		}
		return array;
	}
	
	public static Map<String, Integer> countOccurrences(List<String> list) {
		Map<String, Integer> counts = new HashMap<String, Integer>();
		
		for (String string : list) {
			
			//if the string already exists
			if (counts.containsKey(string)) {
				//find the current count of the string
				int currentCount = counts.get(string);
				counts.put(string, currentCount + 1);
			} else {
				counts.put(string, 1);
			}
		}
		return counts;
	}
	
	
	
	//Why and when would you use a StringBuilder instead of a String?

}
