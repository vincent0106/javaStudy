package chap17;

import java.util.stream.Stream;

public class Sample06 {

    /*
    * Stream null 로 인한 NullPointer Exception 예시
    * */
    public static void main(String[] args){
        String[] arrStr = null;

        // Stream.of : 배열을 스트림을 변환 할때
        Stream<String> stream = Stream.of(arrStr);
    }
}
