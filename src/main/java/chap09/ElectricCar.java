package chap09;

public class ElectricCar extends Car {

	public ElectricCar(String color, String manufacturer) {
		super(color, manufacturer);
	}

	@Override
	public String fillUp() {
		return "자식 자식.";
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	/*
	private String color; // 색
	private String manufacturer; // 제조사

	public void printInfo() {
		System.out.println("이 차의 색 : " + this.color);
		System.out.println("이 차는 " + fillUp());
		System.out.println("이 차는 " + this.manufacturer + "에서 생산합니다.");
	}

	public String fillUp() {
		return "전기를 충전합니다.";
	}
	*/
	
}

