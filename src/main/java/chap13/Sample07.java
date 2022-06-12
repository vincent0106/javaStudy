package chap13;

import java.text.DecimalFormat;

/*
 * DecimalFormat
 *  - % 백분율 표기 ( 100을 곱하여 표기한다. )
 * */
public class Sample07 {
    public static void main(String[] args){
        double myMoney =    5000000; //원금
        double lossMoney =  3000000; //손실
        double amount =     lossMoney / myMoney;

        DecimalFormat df1 = new DecimalFormat("##,###,##0");
        DecimalFormat df2 = new DecimalFormat("##0%");
        System.out.println("원금\t\t: " + df1.format(myMoney));
        System.out.println("손실\t\t: " + df1.format(lossMoney));
        System.out.println("손실률\t: " + df2.format(amount));
    }
}
