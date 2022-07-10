package chap17;

import java.util.Arrays;
import java.util.Map;

import static java.util.stream.Collectors.toMap;

public class Sample18 {

    public static void main(String[] args){
        String[][] level = {
                {"빵형", "초급"}, {"타노스", "중급"}, {"상도", "고급"}
                // Duplicate key 빵형 (attempted merging values 초급 and 중급) - mergeFunction 이 없을 경우 중복 Key 로 인한 에러 리턴.
                // {"빵형", "초급"}, {"빵형", "중급"}, {"타노스", "중급"}, {"상도", "고급"}
        };
        Map map = Arrays.stream(level).collect(toMap(x -> x[0], x -> x[1]));
        System.out.println(map.toString());
    }
}
