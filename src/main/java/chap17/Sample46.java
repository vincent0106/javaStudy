package chap17;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sample46 {

    /*
    * sorting
    *   - Comparator.reverseOrder() 를 통한 역순 정렬
    * */
    public static void main(String[] args){
        Integer[] int1 = {1,3,5,7,9};
        Integer[] int2 = {2,4,6,8,10};

        Stream<Integer[]> strm1 = Stream.of(int1, int2);
        List<Integer> list1 =
                strm1.flatMap(x -> Arrays.stream(x))
                        .sorted(Comparator.reverseOrder())
                        .collect(Collectors.toList());
        System.out.println(list1.toString());
    }
}
