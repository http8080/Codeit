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
				System.out.println("�ȳ��� ������.");
				Maincon = false;
				break;
			case "I":
				System.out.println("�ȳ��ϼ���! �츮�� �ڵ����Դϴ�.\r\n" + "�Բ� �����սô�!");
				break;
			case "C":
				Ccon = true;
				while (Ccon) {
					System.out.println("�ڵ��� ������ �Ұ��մϴ�.\r\n" + "(P)ython (J)ava (i)OS (B)ack");
					CoursesInput = input.next();
					CoursesInput = CoursesInput.toUpperCase();
					switch (CoursesInput) {
					case "P":
						System.out.println("Python �� ���� ��ǻ�� ���̾��� ���ʸ� ���ϴ�.\r\n" + "����: ������\r\n" + "��õ ��������: ����");
						break;
					case "J":
						System.out.println("Java�� �⺻ ������ ��ü������ ���α׷����� ���ϴ�.\r\n" + "����: �����\r\n" + "��õ ��������: Python");
						break;
					case "I":
						System.out.println(
								"�ֽ� Swift �� ���� iOS ������ ������ �� �ֽ��ϴ�.\r\n" + "����: ����ȣ\r\n" + "��õ ��������: Python, Java");
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
