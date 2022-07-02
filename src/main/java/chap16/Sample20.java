package chap16;

import java.util.function.Predicate;

/*
* Predicate or
* or 의 경우 또는 과 같다.
* */
public class Sample20 {

    public static void main(String[] args){
        //3의 배수이거나 홀수인 수를 출력하세요
        int[] no = {1,3,6,8};

        Predicate<Integer> isOdd = (s) -> (s %2) == 1;  //홀수인가
        Predicate<Integer> isMultipleThree = (s) -> ( s % 3 ) == 0; //3의 배수인가

        for (int num : no) {
            if(isOdd.or(isMultipleThree).test(num)){
                System.out.printf("%d는 홀수이거나 3의 배수 입니다.\n", num);
            }
        }
    }
}
