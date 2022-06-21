package chap12.chap13;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;


/*
* enum 으로 설정 되어 있는 FormatStyle 을 활용한 출력
*  */
public class Sample18 {

    public static void main(String[] args){
        ZonedDateTime yesterday = ZonedDateTime.now().minusHours(25); // 24 + 1
        System.out.println(DateTimeFormatter.ofLocalizedTime(FormatStyle.FULL).format(yesterday));
        System.out.println(DateTimeFormatter.ofLocalizedTime(FormatStyle.LONG).format(yesterday));
        System.out.println(DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM).format(yesterday));
        System.out.println(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT).format(yesterday));
        System.out.println();

        LocalDate today = LocalDate.now();
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).format(today));
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).format(today));
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).format(today));
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).format(today));
        System.out.println();

        ZonedDateTime tomorrow = ZonedDateTime.now().plusDays(1);
        System.out.println(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL).format(tomorrow));
        System.out.println(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG).format(tomorrow));
        System.out.println(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).format(tomorrow));
        System.out.println(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).format(tomorrow));
    }
}
