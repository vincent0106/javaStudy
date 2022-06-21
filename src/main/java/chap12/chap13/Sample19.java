package chap12.chap13;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Sample19 {
    public static void main(String[] args){
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH시 mm분 - vvvv");
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm - VV");
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm - VV");

        System.out.println(format1.format(ZonedDateTime.now(ZoneId.of("Asia/Seoul"))));
        System.out.println(format2.format(ZonedDateTime.now(ZoneId.of("Asia/Seoul"))));
        System.out.println(format3.format(ZonedDateTime.now(ZoneId.of("Australia/Sydney"))));
    }
}
