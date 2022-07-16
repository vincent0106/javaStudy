package chap17;

import java.util.stream.Stream;

public class Sample50 {

    /*
    * peek
    *   - 중간에 처리된 요소의 값을 확인
    *   - 최종연산에 들어올 메소드가 꼭 있어야 한다.
    * */
    public static void main(String[] args){
        Stream.of("mouse", "cow", "horse", "monkey")
                .peek(x -> System.out.println("처리할 요소 : " + x))
                .map(String::toUpperCase)   // <-- 중간 연산 : 반환
                .peek(x -> System.out.println("처리된 요소 : " +x))
                .forEach(System.out::println); //  - 최종 연산
    }
}
