package chap17;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sample43 {

    public static void main(String[] args){
        //1. 2개의 배열
        List<Integer> list1 = Arrays.asList(1, 3, 5, 7, 9);
        List<Integer> list2 = Arrays.asList(2,4,6,8,10);

        //2. 2개의 배열을 스트림으로 합친 후 3의 배수를 얻는다.
        List<Integer> list3 = Stream.of(list1, list2)
                .flatMap(List::stream)  // flatMap 으로 합침. List::Stream
                .filter(x -> x % 3 == 0) // 3의 배수를 찾는다.
                .collect(Collectors.toList()); // list로 반환

        //3. 출력한다.
        System.out.println(list3);

    }
}
