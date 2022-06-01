package chap11;

import java.util.ArrayList;
import java.util.List;

public class Sample02 {
    /*
    * ArrayList
    *   -  set(int index, E element) 목록에서 지정된 인덱스 위치의 값을 변경
    * */

    public static void main(String[] args){
        List<String> arr = new ArrayList<>();

        // 5개의 문자열을 추가한다. <- 6개임... 틀렸음.
        arr.add("하나");
        arr.add("둘");
        arr.add("둘 쩜 오");
        arr.add("셋");
        arr.add("넷");
        arr.add("다섯");

        //3번째 위치에 '둘 쩜 오'를 '이 쩜 오' 로 수정
        arr.set(2, "이 점 오");

        for (String a : arr) {
            System.out.println(a);
        }
    }
}
