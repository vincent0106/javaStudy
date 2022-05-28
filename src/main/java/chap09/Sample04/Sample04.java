package chap09.Sample04;

public class Sample04 {

	/*
	* 다형성 : 자식은 부모 매서드를 사용 할 수 있지만 부모는 자식 메서드를 사용 할 수 없다.
	* 업 캐스팅( 자식 -> 부모 ), 다운 캐스팅 ( 부모 -> 자식 )
	*/
	public static void main(String[] args) {
		Pet cat = new Cat(false, 4);
		cat.run(getPetName(cat));

		Pet parrot = new Parrot(true, 2);
		parrot.run(getPetName(parrot));

		// 다운 캐스팅 : 부모 -> 자식으로 형변환 후 자식의 형태에서 자식 Parrot 클래스의 fly 메소드를 실행.
		Parrot pr = (Parrot) parrot; // 다운 캐스팅 ( 부모 -> 자식 )
		pr.fly(getPetName(parrot));

	}

	public static String getPetName(Pet pet) {
		String str = "";
		if (pet instanceof Cat) {
			str = "고양이";
		} else if (pet instanceof Parrot) {
			str = "앵무새";
		}
		return str;
	}

}
