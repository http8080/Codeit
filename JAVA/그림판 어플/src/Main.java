
/*�׸��� ����
Circle, Square, Rectangle �� �� ���� ���� Ŭ������ �������, �� Ŭ������ �߻� Ŭ���� AbstractShape�� �ڽ��Դϴ�.

�� �� Square�� Rectangle�� �ֿܼ� ��µ� �����ϰ� ����� �ͽ��ϴ�. ���� �� ���� ���̰� 4�̰� ���� ���̰� 3�� Rectangle �ν��Ͻ��� �Ʒ��� ���� ����� ����մϴ�.

****
****
****
��� ��� ��༭�� Printable �������̽��� �ۼ��սô�. ���� ���ؼ�, implements Printable�� �ϴ� Ŭ������ �ֿܼ� ����� �׷��ִ� print �޼ҵ带 �� �����ؾ� �մϴ�.

���ø�
Main Ŭ����
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Printable> shapes = new ArrayList<>();

        shapes.add(new Rectangle(3, 4));
        shapes.add(new Rectangle(4, 2));
        shapes.add(new Square(3));
        shapes.add(new Square(1));

        for (Printable shape : shapes) {
            shape.print();
            System.out.println("---------");
        }
    }
}
�ݺ����� ���鼭 shape.print();�� �ص� ������ ���� �ʽ��ϴ�. shapes���� Printable�� ����� ��Ų ��ҵ鸸 ����, ���� ��� print �޼ҵ带 �����߱� �����Դϴ�!

AbstractShape �߻� Ŭ����
public abstract class AbstractShape {

    // �׸��ǿ����� ��ġ
    protected double x;
    protected double y;

    // ������
    public AbstractShape(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Getters
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // Setter
    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }


    // ���� �����̱�
    public void move(double xDistance, double yDistance) {
        x += xDistance;
        y += yDistance;
    }
}
Printable �������̽�
public interface Printable {
    // �ڵ带 �Է��ϼ���.
}
Rectangle Ŭ����
public class Rectangle extends AbstractShape {
    // ����
    double side1; // ����
    double side2; // ����

    // ������
    public Rectangle(double side1, double side2) {
        super(0, 0);
        this.side1 = side1;
        this.side2 = side2;
    }

    // ����
    public double getArea() {
        return side1 * side2;
    }

    // �ѷ�
    public double getPerimeter() {
        return 2 * (side1 + side2);
    }
}
Square Ŭ����
public class Square extends AbstractShape {
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
}
�ܼ� ��°�
****
****
****
---------
**
**
**
**
---------
***
***
***
---------
*
---------*/

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<Printable> shapes = new ArrayList<>();

		shapes.add(new Rectangle(3, 4));
		shapes.add(new Rectangle(4, 2));
		shapes.add(new Square(3));
		shapes.add(new Square(1));

		for (Printable shape : shapes) {
			shape.print();
			System.out.println("---------");
		}
	}
}