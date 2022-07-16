package chap17;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Sample42 {

    /*
    * 자료형을 변경 할 때 사용
    * mapToLong, mapToObj, mapToInt, mapToDouble
    * */
    public static void main(String[] args){
        Map<Boolean, List<Long>> m1 =
                // Int Stream 으로 range 를 사용 하여 int를 1~10 까지 리턴. mapToLong을 통한 Long 형으로 변환하여 처리
                IntStream.range(1, 10)
                        .mapToLong(x -> x)
                        .boxed()
                        .collect(Collectors.partitioningBy(i -> i % 2 == 0));
        System.out.println(m1);

        Map<Boolean, List<Long>> m2 =
                IntStream.range(1, 10)
                        .mapToObj(Long::new)
                        .collect(Collectors.partitioningBy(i -> i % 2 == 0));
        System.out.println(m2);
    }
}
