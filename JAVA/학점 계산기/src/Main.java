/*학점 계산기
기말고사 결과가 나오면 이번 학기 예상 학점과, 이번 학기가 끝나고 나서의 전체 평균 학점을 수 없이 계산해보곤 하죠? 이제는 프로그램으로 손쉽게 계산해봅시다!

용어 정리
'학점'이라는 표현이 헷갈리기 때문에 '성적', '점수', '크레딧'이라는 표현을 사용하겠습니다.

'성적'은 'A+', 'B+', 'B'와 같은 글자 성적을 뜻하고, 그에 해당하는 수치 4.5, 3.5, 3.0 등이 '점수'입니다. 흔히 얘기하는 '3학점'짜리, '2학점'짜리 수업이 '크레딧'입니다.

점수는 아래의 표를 따릅니다:

성적	점수
A+	4.5
A	4.0
B+	3.5
B	3.0
C+	2.5
C	2.0
D+	1.5
D	1.0
F	0.0
학점 계산 방법
학점 예상에 필요한 자료 이와 같습니다:

이전 학기까지의 평균 점수 (4.5 만점)

이전 학기까지의 이수 크레딧 수 (전공 과목(CREDIT_MAJOR)은 3학점, 교양 과목(CREDIT_GENERAL)은 2학점)

이번 학기 과목별 예상 성적

이번 학기 점수 계산 방법
수업	성적(점수)	크레딧	총 점수 (점수 * 크레딧)
객체 지향 프로그래밍	A+(4.5)	3	4.5 * 3 = 13.5
신호와시스템	A(4.0)	3	4 * 3 = 12
해석학	B+(3.5)	3	3.5 * 3 = 10.5
확률	A+(4.5)	3	4.5 * 3 = 13.5
스포츠댄스	A(4.0)	2	4 * 2 = 8
총합		3 + 3 + 3 + 3 + 2 = 14	13.5 + 12 + 10.5 + 13.5 + 8 = 57.5
이번 학기의 평균 점수는 57.5 / 14의 결과값인 4.1071428571입니다.

전체 점수 예상
위의 계산법을 응용합니다. 이전 학기까지의 평균 점수 * 이전 학기까지의 크레딧 수를 하면 이전 학기까지의 총 점수를 구할 수 있겠죠?

예를 들어서 이전 학기까지의 평균 점수가 4.0이고 이수 크레딧 수가 100이라고 가정합시다. 그러면 총 점수는 400이죠? 위의 표에 나와있는대로 이번 학기 성적을 받았다면 이제 총 점수(이전 학기까지의 총 점수 + 이번 학기의 총 점수)는 457.5, 총 이수 크레딧 수(이전 학기까지의 크레딧 수 + 이번 학기의 크레딧 수)는 114입니다. 따라서 예상 전체 점수는 457.5 / 114의 결과값인 4.0131578947인 거죠!

템플릿
'객체 지향 프로그래밍' 수업의 목표는 직접 객체 지향적인 프로그램을 설계하는 능력을 기르는 것입니다. 따라서 이번 과제는 Main 클래스만 제공해드립니다!

Main 클레스의 main 메소드가 오류가 나지 않고 실행될 수 있도록 프로그램 설계를 스스로 해보세요. 결과 뿐 아니라, 접근 제어(public, private), 확장성(나중에 프로그램이 커질 수 있음에 대한 대비), 코멘트 등을 신경 써서 작성해주셔야 합니다!

템플릿으로 주어진 main 메소드는 바꾸지 말아야 합니다.

Main.java
public class Main {
    public static void main(String[] args) {
        GradeCalculator gradeCalc = new GradeCalculator("김신의", 4.0, 100);

        gradeCalc.addCourse(new Course("OOP", Course.CREDIT_MAJOR, "A+"));
        gradeCalc.addCourse(new Course("신호와시스템", Course.CREDIT_MAJOR, "A"));
        gradeCalc.addCourse(new Course("해석학", Course.CREDIT_MAJOR, "B+"));
        gradeCalc.addCourse(new Course("확률", Course.CREDIT_MAJOR, "A+"));
        gradeCalc.addCourse(new Course("스포츠댄스", Course.CREDIT_GENERAL, "A"));

        gradeCalc.print();
    }
}
Course.java
public class Course {
}
GradeCalculator.java
public class GradeCalculator {
}
콘솔 아웃풋
직전 학기 성적: 4.0 (총 100학점)
이번 학기 성적: 4.1071428571 (총 14학점)
전체 예상 학점: 4.0131578947 (총 114학점)
중간 프로젝트이니 별도의 힌트는 없습니다. 과제가 어려운 편이니, 한 번에 생각이 잘 안 나시더라도 천천히 고민해보세요. 할 수 있습니다! 

<주의> Main.java 파일은 변경하지 마세요. 원하는 값이 나오도록, 다른 클래스를 잘 정의해주세요.

<주의> 자동 채점 과제이기 때문에, 문제의 조건에 정확히 따라주시기 바랍니다. 띄어쓰기도 일치해야 합니다.*/

public class Main {
	public static void main(String[] args) {
		GradeCalculator gradeCalc = new GradeCalculator("김신의", 4.0, 100);

		gradeCalc.addCourse(new Course("OOP", Course.CREDIT_MAJOR, "A+"));
		gradeCalc.addCourse(new Course("신호와시스템", Course.CREDIT_MAJOR, "A"));
		gradeCalc.addCourse(new Course("해석학", Course.CREDIT_MAJOR, "B+"));
		gradeCalc.addCourse(new Course("확률", Course.CREDIT_MAJOR, "A+"));
		gradeCalc.addCourse(new Course("스포츠댄스", Course.CREDIT_GENERAL, "A"));

		gradeCalc.print();
	}
}