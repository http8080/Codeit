
public class Rectangle extends Shape {
	public final double side1, side2;
	
	public Rectangle(double side1, double side2) {
		super();
		this.side1 = side1;
		this.side2 = side2;
	}

	@Override
	public double getArea() {
		return side1 * side2;
	}

	@Override
	public double getPerimetrr() {
		return 2 * side1 * side2;
	}
	
	

}
