package chap08.Sample16;

public class Sample16 {



    public static void main(String[] args) {

        // ==(이퀄연산자) 와  Object.equals() 는 다르다.
        // == 이퀄연산자는 주소값을 비교
        // equals() 는 값을 비교

        String A = new String("빵형");    // 참조형 변수로 값의 주소를 참조
        String A1 = new String("빵형");    // 참조형 변수로 값의 주소를 참조 A1
        String B = "빵형";                        // 값을 직접 할당 받음.
        String C = "빵형";                        // 값을 직접 할당 받음.

        if (A == A1) {
            System.out.println("A와 A1은 같다.");
        } else {
            System.out.println("A와 A1은 다르다.");
        }

        if (A == B) {
            System.out.println("A와 B는 주소가 같습니다.");
        } else {
            System.out.println("A와 B는 서로 다른 주소 입니다.");
        }

        if (A.equals(B)) {
            System.out.println("A와 B는 같은 값입니다.");
        } else {
            System.out.println("A와 B는 서로 다른 값입니다.");
        }

        if (B == C) {
            System.out.println("B와 C는 주소가 같습니다.");
        } else {
            System.out.println("B와 C는 서로 다른 주소입니다.");
        }

        if (B.equals(C)) {
            System.out.println("B와 C는 같은 값입니다.");
        } else {
            System.out.println("B와 C는 다른 값입니다.");
        }
    }

}
