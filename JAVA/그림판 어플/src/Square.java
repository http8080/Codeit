public class Square extends AbstractShape implements Printable {
	// ����
	double side;

	// ������
	public Square(double side) {
		super(0, 0);
		this.side = side;
	}

	// ����
	public double getArea() {
		return side * side;
	}

	// �ѷ�
	public double getPerimeter() {
		return 4 * side;
	}

	@Override
	public void print() {
		for (int i = 0; i < side; i++) {
			String rectangle = "";
			for (int j = 0; j < side; j++) {
				rectangle += "*";
			}
			System.out.println(rectangle);
		}
	}
}