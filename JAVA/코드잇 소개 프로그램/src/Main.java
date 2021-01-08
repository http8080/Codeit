import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		String MainInput = "F";
		boolean Maincon = true, Ccon = true;

		while (Maincon) {
			System.out.println("(I)ntro (C)ourses (E)xit");
			MainInput = input.next();
			MainInput = MainInput.toUpperCase();

			String CoursesInput;

			switch (MainInput) {
			case "E":
				System.out.println("안녕히 가세요.");
				Maincon = false;
				break;
			case "I":
				System.out.println("안녕하세요! 우리는 코드잇입니다.\r\n" + "함께 공부합시다!");
				break;
			case "C":
				Ccon = true;
				while (Ccon) {
					System.out.println("코드잇 수업을 소개합니다.\r\n" + "(P)ython (J)ava (i)OS (B)ack");
					CoursesInput = input.next();
					CoursesInput = CoursesInput.toUpperCase();
					switch (CoursesInput) {
					case "P":
						System.out.println("Python 언어를 통해 컴퓨터 사이언스의 기초를 배웁니다.\r\n" + "강사: 강영훈\r\n" + "추천 선수과목: 없음");
						break;
					case "J":
						System.out.println("Java의 기본 문법과 객체지향적 프로그래밍을 배웁니다.\r\n" + "강사: 김신의\r\n" + "추천 선수과목: Python");
						break;
					case "I":
						System.out.println(
								"최신 Swift 언어를 통해 iOS 개발을 시작할 수 있습니다.\r\n" + "강사: 성태호\r\n" + "추천 선수과목: Python, Java");
						break;
					case "B":
						//CoursesInput = "EEEE";
						Ccon = false;
						break;
					}
				}
				break;
			}
		}

	}
}
