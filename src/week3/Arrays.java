package week3;

public class Arrays {
	
	public static int multiplyByTwo(int x) {
		return x * 2;
	}
	
	public static void main(String[] args) {
		
		int a = 5;
		Integer b = new Integer(3);
		
		multiplyByTwo(b);
	
		
		Employee e = new Employee("Tom", "Sawyer");
		e.greet("Hi, there.");
		
		Contractor c = new Contractor("Tim", "Smith");
		c.greet("Hi");
		
		String firstName = "Sam";
		String lastName = "Smith";
		String streetAddress = "1234 e easy st";
		
		String studentName1 = "Tom";
		String studentName2 = "Sam";
		String studentName3 = "Sally";
		
		double var1 = 5;
		double var2 = 8;
		double var3 = 2;
		double var4 = 1;
		
		double average = (var1 + var2 + var3 + var4) / 4;
		System.out.println(average);
		
		double[] grades = new double[4];
		grades[0] = 5;
		grades[1] = 8;
		grades[2] = 2;
		grades[3] = 1;
		
		System.out.println(grades[grades.length - 1]);
		
		System.out.println((grades[0] + grades[1] + grades[2] + grades[3])/grades.length);
		
		double sum = 0;
		
//		for (int i = 0; i < grades.length; i++) {
//			sum += grades[i];
//		}
//		
//		System.out.println(sum / grades.length);
		
		for (double grade : grades) {
			sum += grade;
		}
		
		System.out.println(sum / grades.length);
		
	}

}
