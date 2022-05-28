package chap08;

public class Sample06 {

	static int sum;
	
	public static void main(String[] args) {
		// 매서드의 인자값보다 적은 모 정소의 합
		System.out.println(sum(10));
	}
	
	public static int sum(int a) {
		
		sum+=a;

		if ( a == 0 ) {
			return sum;
		} else {
			a--;
			return sum(a);
		}
	}
}
