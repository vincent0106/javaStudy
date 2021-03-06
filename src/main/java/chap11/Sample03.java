package chap11;

import java.util.ArrayList;
import java.util.List;

public class Sample03 {

    /*
    * ArrayList
    *   - remove(int index) 지정된 위치의 값을 제거
    *   - removeAll(Collection<?> c) 지정된 컬렉션에 포함된 모든 요소를 목록에서 제거
    * */

    public static void main(String[] args){
        List<String> arr = new ArrayList<>();

        // 5개의 문자열을 추가한다. <- 6개임... 틀렸음.
        arr.add("하나");
        arr.add("둘");
        arr.add("이 쩜 오");
        arr.add("셋");
        arr.add("넷");
        arr.add("다섯");

        //3번째 위치에 '이 쩜 오'를 삭제
        System.out.println("* 3번째 위치에 '이 쩜 오'를 삭제");
        System.out.println("* 향상된 for ********************");
        arr.remove(2);
        for (String a : arr) {
            System.out.println(a);
        }

        System.out.println("* for ************************");

        for (int i = 0; i < arr.size(); i++) {
            System.out.printf("%d번 - %s%n", (i+1), arr.get(i));
        }

        System.out.println("*******************************");

        //둘, 셋 삭제
        System.out.println("\n* 둘, 셋 삭제");
        List<String> delArr = new ArrayList<>();
        delArr.add("둘");    // 삭제할 배열을 추가한다.
        delArr.add("셋");
        arr.removeAll(delArr);
        for (String a : arr) {
            System.out.println(a);
        }

        //모두 삭제한다.
        System.out.println("\n*모두 삭제한다.");
        arr.removeAll(arr);
        for (String a : arr) {
            System.out.println(a);
        }

    }
}
