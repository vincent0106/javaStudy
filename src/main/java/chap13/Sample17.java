package chap13;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/*
* DateTimeFormatter 에 미리 정의 해놓은 포맷 형식
* BASIC_ISO_DATE
* ISO_DATE
* ISO_LOCAL_DATE
* ISO_DATE_TIME
* ISO_LOCAL_DATE_TIME
* ISO_TIME
* 실제 프로젝트에서 많이 사용하는 형태 는 ?
*   - LocalDateTime :   DateTimeFormatter.ofPattern("yyyyMMddHHmmss")
*   -                   DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")
*   - LocalDate :       DateTimeFormatter.ofPattern("yyyy-MM-dd")
* */
public class Sample17 {
    public static void main(String[] args){
        System.out.println("BASIC_ISO_DATE - " + DateTimeFormatter.BASIC_ISO_DATE.format(LocalDate.of(2020, 5, 5)));
        System.out.println("ISO_DATE - " + DateTimeFormatter.ISO_DATE.format(LocalDate.of(2020, 5, 5)));
        System.out.println("ISO_LOCAL_DATE - " + DateTimeFormatter.ISO_LOCAL_DATE.format(LocalDate.of(2020, 5, 5)));

        System.out.println("ISO_DATE_TIME - " + DateTimeFormatter.ISO_DATE_TIME.format(LocalDateTime.of(2020, 5, 5, 10, 5, 12)));
        System.out.println("ISO_LOCAL_DATE_TIME - " + DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(LocalDateTime.of(2020, 5, 5, 10, 5, 12)));
        System.out.println("ISO_TIME - " + DateTimeFormatter.ISO_TIME.format(LocalTime.of(10, 5, 12)));
    }
}
