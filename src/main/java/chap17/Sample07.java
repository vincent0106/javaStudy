package chap17;

import java.util.stream.Stream;

public class Sample07 {

    /*
    * Stream Empty 처리
    * Stream.empty() <- 비어있는 스트림
    * */

    public static void main(String[] args){
        String[] arrStr = null;
        Stream<Object> stream = Stream.of((arrStr == null ? Stream.empty() : arrStr));
    }
}
