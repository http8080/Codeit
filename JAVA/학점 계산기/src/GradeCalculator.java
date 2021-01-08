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

		System.out.println("직전 학기 성적: " + currentScore + "(총 " + currentCredit + "학점)");

		for (Course c : Courses) {
			scoreSum += c.getScore() * c.credit;
			creditSum += c.credit;
		}
		System.out.println("이번 학기 성적: " + (scoreSum / creditSum) + "(총 " + creditSum + "학점)");

		double totalScore = currentCredit * currentScore + scoreSum;
		int totalCredit = currentCredit + creditSum;

		System.out.println("전체 예상 학점: " + (totalScore / totalCredit) + "(총 " + totalCredit + "학점)");

	}

}