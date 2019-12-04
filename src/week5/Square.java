package week5;

public class Square implements Shape {

	private double length;
	
	public Square(double length) {
		this.length = length;
	}
	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return length * 2;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 0;
	}

}
