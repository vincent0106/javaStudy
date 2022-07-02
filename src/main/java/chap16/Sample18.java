package chap16;

import java.util.Scanner;
import java.util.function.Predicate;

/*
* Predicate
*   - negate를 사용하면 결과값의 부정을 얻을 수 있다.
* */
public class Sample18 {

    public static void main(String[] args){
        Predicate<Integer> isOdd = (s) -> (s % 2) == 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("짝수를 입력하세요 : ");
        sc.hasNextInt();
        System.out.println(isOdd.negate().test(sc.nextInt()));
    }
}
