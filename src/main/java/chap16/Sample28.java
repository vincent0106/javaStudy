package chap16;

import java.util.function.BiConsumer;

public class Sample28 {


    /*
    * 생성자 참조 - 매개변수가 있을 경우
    * */
    public static void main(String[] args){
        //매개변수가 2개 이상일 경우 Bi 를 붙인다.
        BiConsumer<Integer, Integer> plus1 = (a, b)  -> new Plus(a, b);
        System.out.print("람다식 - ");
        plus1.accept(1, 2);

        BiConsumer<Integer, Integer> plus2 = Plus::new;
        System.out.print("생성자 참조 - ");
        plus2.accept(3, 4);
    }

}

class Plus{
    public Plus(int a, int b){
        System.out.printf("Plus 출력 %d + %d = %d\n", a, b, (a + b));
    }
}
