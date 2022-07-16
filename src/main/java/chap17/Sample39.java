package chap17;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Sample39 {

    /*
    * 중간 연산 (intermediate Operations)
    * 중간연산 - map()
    * */
    public static void main(String[] args){
        List<Integer> list = IntStream.rangeClosed(1, 10)
                .map(x -> x * 2)
                .boxed()
                .collect(Collectors.toList());

        System.out.println(list);
    }
}
