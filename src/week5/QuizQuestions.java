package week5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class QuizQuestions {
	
	public static void main(String... args) {
		
		Shape circle = new Square(10);
		
		System.out.println(doubleArea(circle));
		
		Burger myBurger = new Burger("New Burger", 7.85);
		System.out.println(myBurger.getName() + " : " + myBurger.getPrice());
	}
	
	public static double doubleArea(Shape shape) {
		return shape.getArea() * 2;
	}
	
	public static Set<String> getStringsWhereKeyStartsWithA(Map<String, String> dictionary) {
		Set<String> results = new HashSet<String>();
		
		for (String key : dictionary.keySet()) {
			if (key.charAt(0) == 'A') {
				results.add(dictionary.get(key));
			}
		}
		
		return results;
	}
	
	public static List getEveryOtherElement(List list) {
		List results = new ArrayList();
		
		for (int i = 0; i < list.size(); i += 2) {
			results.add(list.get(i));
		}
		
		return results;
	}

}
