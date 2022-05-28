package chap09.Sample04;

// 추상 클래스
public abstract class Pet {
	private boolean wing;
	private int legCount;

	public String isWing() {
		String str;
		if(this.wing) {
			str = "날 수 있다.";
		}
		else {
			str = "날 수 없다";
		}
		return str;
	}

	public int getLegCount() {
		return legCount;
	}

	public Pet(boolean wing, int legCount) { // 생성자... 이 클래스를 상속받으면 꼭 구현해야 함.
		this.wing = wing;
		this.legCount = legCount;
	}

	// 가상함수(추상메소드)
	public abstract void run(String name);
	// 메소드의 소스 코드가 없을 경우 구현은 자식 클래스에서 한다.
}
