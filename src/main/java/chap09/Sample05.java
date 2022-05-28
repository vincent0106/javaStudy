package chap09;

/*
* 인터페이스의 경우 기본적으로 멤버 변수는 static final으로 컴파일 된다는 것을 설명
*/
public class Sample05 {

    public static void main(String[] args){
        ICompute a = new Apartment();
        float area = a.compute(30); // 30평
        System.out.printf("아파트의 면적은 %f 제곱미터입니다.", area);
    }
}

class Apartment implements ICompute{

    @Override
    public float compute(int area) {
        // 평을 제곱미터로 환산
        // pyung++;        // 에러!! The final field ICompute.pyung cannot be assigned.
        // 인터페이스의 경우 변수는 기본적으로 static final 로 컴파일 되므로 이러한 형태로 사용할 수 없다.
        return area * pyung;
    }
}

abstract interface ICompute{    // 인터페이스임을 구분하기 위해 앞에 "I"를 붙였고 'absteact'는 생략 가능
    float pyung = 3.3f;     // 인터페이스의 맴버 변수는 'static final'로 컴파일 된다.
    float compute(int area);    // abstract int compute(int area); 추상 메서드로 처리된다.


}
