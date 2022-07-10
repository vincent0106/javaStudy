package chap17;

import java.util.stream.IntStream;

public class Sample08 {

    /* 범위(Range)
    * 순차적으로 요소의 범위를 정수로 반환. 마지막 수 포함.
    * */
    public static void main(String[] args){
        // for (int i = 12; i < 18; i ++ ) System.out.println(i);
        IntStream.rangeClosed(12, 18).forEach(System.out::println);
    }
}
