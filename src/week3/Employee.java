package week3;

public class Employee {
	
	private String firstName;
	private String lastName;
	private int age;
	
	public Employee(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public Employee(String firstName, String lastName, int age) {
		
	}
	
	public void greet(String greeting) {
		System.out.println(greeting + " my name is " + firstName);
	}

}
