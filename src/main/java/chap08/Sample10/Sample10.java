package chap08.Sample10;

public class Sample10 {


	// 인스턴스 내부 클래스
	public static void main(String[] args) {
		
		Student student = new Student("빵형");
		
		Student.Score studentScore = student.new Score();
		studentScore.eng = 23;
		studentScore.mat = 21;
		studentScore.showInfo();

	}

}
