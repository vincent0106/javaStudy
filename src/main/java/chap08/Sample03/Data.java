package chap08.Sample03;

public class Data {

	int value;
	
	void setValue(int value) {
		value = value;	//매개변수 value을 맴버 변수 value에 대입
		//The assignment to variable value has no effect
	}
	
	int getValue() {
		return value;
	}
}
