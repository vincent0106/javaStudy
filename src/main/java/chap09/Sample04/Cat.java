package chap09.Sample04;

public class Cat extends Pet{

	public Cat(boolean wing, int legCount) {
		// super : 부모를 뜻함.
		super(wing, legCount);
	}

	@Override // 오버라이딩 - 재정의
	public void run(String name) {
		System.out.printf("%s는 소리없이 조용하게 뜁니다.%n", name);
	}

}
