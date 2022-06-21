package chap13;

import java.text.DecimalFormat;

/*
* DecimalFormat
*  - 숫자 패턴 정의
* */
public class Sample03 {
    public static void main(String[] args){
        int myMoney = -5000;
        System.out.println(myMoney);
        DecimalFormat df = new DecimalFormat("#,###.##");
        System.out.println(df.format(myMoney));
    }
}
