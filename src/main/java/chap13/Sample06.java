package chap13;

import java.text.DecimalFormat;

/*
 * DecimalFormat
 *  - (~u00A4) : 숫자 앞 혹은 뒤에 문자표기
 * */
public class Sample06 {
    public static void main(String[] args){
        double myMoney1 = 2000000;
        double myMoney2 = -50000000;
        // ; 기준 양수면 <- / 음수면 -> 출력
        DecimalFormat df = new DecimalFormat("(수익)##,###,##0;(손실)##,###,##0");
        System.out.println(df.format(myMoney1));
        System.out.println(df.format(myMoney2));
    }
}
