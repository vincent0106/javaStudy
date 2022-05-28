package chap09;

/*
* 인터페이스에서의 default 메서드 활용을 설명
* */
public class Sample06 {
    public static void main(String[] args){
        Villa a = new Villa();
        float area = a.compute(30); // 30평
        System.out.printf("빌라의 면적은 %f 제곱미터입니다.", area);

        area = a.toPyung(area);
        System.out.printf("%n%n빌라의 면적은 %f 제곱미터입니다.", area);

    }
}

class Villa implements IExcute{

    @Override
    public float compute(int area) {
        // 평을 제곱미터로 환산
        // pyung++;
        return area * pyung;
    }
}

abstract interface IExcute{    // 인터페이스임을 구분하기 위해 앞에 "I"를 붙였고 'absteact'는 생략 가능
    float pyung = 3.3f;     // 인터페이스의 맴버 변수는 'static final'로 컴파일 된다.
    float compute(int area);    // abstract int compute(int area); 추상 메서드로 처리된다.

    default float toPyung(float area){  // 디폴트 메서드
        return area / pyung;
    }


}
