package chap08;

public class Sample18 {

	// 객체 Class 도 배열로 생성 할 수 있다.
	public static void main(String[] args) {
		Student[] students = new Student[3];
		students[0] = new Student("빵형", 21, 1);
		students[1] = new Student("빵동생", 20, 3);
		students[2] = new Student("빵친구", 21, 1);

		for (Student student : students) {
			System.out.println(student.toString());
		}
	}

}
