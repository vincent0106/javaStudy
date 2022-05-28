package chap08.Sample08;

public class Data {
	
	String name;
	int age;
	
	public Data() {
		//System.out.println("Data 초기화합니다.");
		this("aaa", 2);
	}
	
	public Data(String name, int age) {
		System.out.println("Data 초기화합니다.");
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return "Data [name=" + name + ", age=" + age + "]";
	}

}
