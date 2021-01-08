
/*그림판 어플
Circle, Square, Rectangle 등 몇 가지 도형 클래스를 만들었고, 각 클래스는 추상 클래스 AbstractShape의 자식입니다.

이 중 Square와 Rectangle은 콘솔에 출력도 가능하게 만들고 싶습니다. 예를 들어서 가로 길이가 4이고 세로 길이가 3인 Rectangle 인스턴스는 아래와 같은 모양을 출력합니다.

****
****
****
출력 기능 계약서인 Printable 인터페이스를 작성합시다. 쉽게 말해서, implements Printable을 하는 클래스는 콘솔에 모양을 그려주는 print 메소드를 꼭 구현해야 합니다.

템플릿
Main 클래스
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
반복문을 돌면서 shape.print();를 해도 오류가 나지 않습니다. shapes에는 Printable과 약속을 지킨 요소들만 들어갔고, 따라서 모두 print 메소드를 구현했기 때문입니다!

AbstractShape 추상 클래스
public abstract class AbstractShape {

    // 그림판에서의 위치
    protected double x;
    protected double y;

    // 생성자
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


    // 도형 움직이기
    public void move(double xDistance, double yDistance) {
        x += xDistance;
        y += yDistance;
    }
}
Printable 인터페이스
public interface Printable {
    // 코드를 입력하세요.
}
Rectangle 클래스
public class Rectangle extends AbstractShape {
    // 길이
    double side1; // 세로
    double side2; // 가로

    // 생성자
    public Rectangle(double side1, double side2) {
        super(0, 0);
        this.side1 = side1;
        this.side2 = side2;
    }

    // 넓이
    public double getArea() {
        return side1 * side2;
    }

    // 둘레
    public double getPerimeter() {
        return 2 * (side1 + side2);
    }
}
Square 클래스
public class Square extends AbstractShape {
    // 길이
    double side;

    // 생성자
    public Square(double side) {
        super(0, 0);
        this.side = side;
    }

    // 넓이
    public double getArea() {
        return side * side;
    }

    // 둘레
    public double getPerimeter() {
        return 4 * side;
    }
}
콘솔 출력값
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