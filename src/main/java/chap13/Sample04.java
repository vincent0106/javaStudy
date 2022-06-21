package chap13;

import java.text.DecimalFormat;

/*
* DecimalFormat
*  - # 숫자
*  - , 표시 그룹 구분 기호 ( 000 단위 마다 찍히는 콤마 )
*  - . 소수점 표기
* */
public class Sample04 {
    public static void main(String[] args){
        float myMoney = -5000f;
        System.out.println(myMoney);
        DecimalFormat df = new DecimalFormat("##,###,###.00");
        System.out.println(df.format(myMoney));
    }
}
