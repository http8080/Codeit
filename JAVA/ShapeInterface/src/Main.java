import java.util.ArrayList;

public class Main {
	public static void main(String arge []) {
		ArrayList<Shape> shapes = new ArrayList<>();
		shapes.add(new Circle(3.0));
		shapes.add(new Square(4.0));
		shapes.add(new Rectangle(3.0, 5.0));
		
		for(Shape shape : shapes) {
			System.out.println("≥–¿Ã: " + shape.getArea());
			shape.move(3, 5);
			System.out.println("X: " + shape.getX() + ", Y: " + shape.getY());
			shape.move(-2, 3);
			System.out.println("X: " + shape.getX() + ", Y: " + shape.getY());
		}
	}
}
