package chap08;

public class Sample01 {
	/* 필드 영역 시작 */
	String name = "멤버 변수"; //쩝근 제어자가 생략된 멤버 변수
			
	private int age; //젭근 제어자가 있는 멤버 변수
	
	// var age = 0; //지역 변수인 타입추혼변수는 사용 할 수 없음
	/* 필드 영역  */
	
	/* 메서드 영역 시작 */
	public void sysHello() {
		String friend = "친구야";
		System.out.printf("%s 안녕?\n", friend);
	}
	
	public void sayHello(String friend) {
		System.out.printf("%s 안녕?\n", friend);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name; // 필드와 매개변수가 동일할 때 this로 구분
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	/* 메서드 영역 끝 */
	
	/* 생성자 영역 시작 */
	public Sample01() {
		
	}
	/* 생성자 영역  */
	
	
	
	
}
