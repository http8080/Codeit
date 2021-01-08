import java.util.ArrayList;

public class GradeCalculator {

	public final String name;
	public final double currentScore;
	public final int currentCredit;

	private final ArrayList<Course> Courses = new ArrayList<>();

	public GradeCalculator(String name, double currentScore, int currentCredit) {
		this.name = name;
		this.currentCredit = currentCredit;
		this.currentScore = currentScore;
	}

	public void addCourse(Course course) {
		Courses.add(course);
	}

	public void print() {
		double scoreSum = 0;
		int creditSum = 0;

		System.out.println("���� �б� ����: " + currentScore + "(�� " + currentCredit + "����)");

		for (Course c : Courses) {
			scoreSum += c.getScore() * c.credit;
			creditSum += c.credit;
		}
		System.out.println("�̹� �б� ����: " + (scoreSum / creditSum) + "(�� " + creditSum + "����)");

		double totalScore = currentCredit * currentScore + scoreSum;
		int totalCredit = currentCredit + creditSum;

		System.out.println("��ü ���� ����: " + (totalScore / totalCredit) + "(�� " + totalCredit + "����)");

	}

}