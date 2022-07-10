package chap17;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Sample16 {

    /*
    * Optional이란?
    *   - java8부터 제공하는 null을 포함하거나 null을 포함하지 않을 수도 있는 객체이다.
    *   - NPE(NullPointerException)를 발생시킬 수 있는 null을 직접 다루지 않아도 된다.
    *   - null 체크 로직이 필요 없다.
    *   - 명시적으로 해당 변수가 null일 가능성을 표현할 수 있다.
    *   OptionalInt에는 기본적으로 null 을 넣을 수 없으므로 OptionalInt.empty() <- 이렇게 선언한다.
    * */

    public static void main(String[] args){
        int sum1 = 0;
        OptionalInt sum2;

        sum1 = IntStream.rangeClosed(7, 10)
                .reduce(6, Integer::sum);
        System.out.println("int로 반환하는 reduce 문 결과 : " + sum1);

        sum2 = IntStream.rangeClosed(6, 10)
                .reduce(Integer::sum);
        System.out.println("int로 반환하는 reduce 문 결과 : " + sum2.getAsInt());

        OptionalInt sum3 = OptionalInt.empty(); // null 선언 할 수 없으므로 .empty() 로 처리
        if ( sum3.isEmpty()){
            System.out.println("sum3은 값이 비었어요");
        }

        System.out.println("** OptionalInt는 OptioanlInt.for(value)로 값을 넣습니다.");
        sum3 = OptionalInt.of(6);

        if ( sum3.isPresent()){ // <<-- isPresent() 값이 있을 경우 처리함.
            System.out.println("값이 있을 경우엔 getAsInt()로 가져옵니다. " + sum3.getAsInt());
            System.out.println("그냥 가져오면 이렇게 찍혀요 -> " + sum3);
        } else {
            System.out.println("값없다.");
        }

        IntStream.rangeClosed(6, 10)
                .reduce(Integer::sum)
                .ifPresent(System.out::println);

    }
}
