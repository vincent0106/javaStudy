package chap17;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
* flatMap
*   - 여러개의 스트림을 하나의 스트림으로 변환
* */
public class Sample41 {

    public static void main(String[] args){
        String[] str1 = {"빵형", "상도", "타노스", "학건"};
        String[] str2 = {"인호", "학건"};

        Stream<String[]> strm = Stream.of(str1, str2);

        List<String> list = strm.flatMap(x -> Arrays.stream(x)).collect(Collectors.toList());

        System.out.println(list.toString());
    }
}
