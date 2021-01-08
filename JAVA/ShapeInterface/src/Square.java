
public class Square extends Shape {
	public final double side;
	
	public Square(double side) {
		super();
		this.side = side;
	}

	@Override
	public double getArea() {
		return side * side;
	}

	@Override
	public double getPerimetrr() {
		return 4 * side;
	}
	
}
