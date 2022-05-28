package chap08;

import lombok.AllArgsConstructor;
import lombok.Builder;

public class Sample17 {

	// toString() 메서드 설명.

	public static void main(String[] args){
		Student st = new Student("빵형", 21, 1);
		System.out.println(st.toString());
		
		Student st1 = Student.builder().name("빵형").age(45).grade(5).build();
		System.out.println(st1.toString());
		
		
		
	}

}

@Builder
@AllArgsConstructor
class Student {
	String name;
	int age;
	int grade;

	/*
	public Student(String name, int age, int grade) {
		this.name = name;
		this.age = age;
		this.grade = grade;
	}*/

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", grade=" + grade + "]";
	}
	
	

}

