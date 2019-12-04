package week5;

import java.util.List;

public class Burger {
	
	private double price;
	private String name;
	private List<String> toppings;
	
	public Burger() {
		price = 5.95;
		name = "Original Burger";
	}
	
	public Burger(String name) {
		this.name = name;
		price = 5.95;
	}
	
	public Burger(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	
}
