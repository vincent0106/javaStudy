package chap13;

import java.util.Calendar;
import java.util.Date;

/*
* Calendar 클래스 get() 메서드 활용
*  - 현재 Deprecate 되어 있어 권장하지 않는다. -> Java 1.8 이후 사용 가능한 LocalDateTime 사용 권장
* */
public class Sample02 {

    public static void main(String[] args){
        // 추상클래스 이므로 생성자를 사용하여 인스턴스를 생성할 수 없어서 정적 메서드를 호출하여 생성
        Calendar cal = Calendar.getInstance();
        Date date = cal.getTime();
        System.out.println("== Date Info ==");
        System.out.println(date);

        System.out.println("\n== Date ==");
        System.out.printf("%s %s %02d %02d:%02d:%02d KST %d\n"
        , getWeekName(date.getDay() + 1)    // 0부터 시작하기 떄문에 1더해줌
        , getMonthName(date.getMonth())
        , date.getDate()
        , date.getHours()
        , date.getMinutes()
        , date.getSeconds()
        , date.getYear() + 1900
        );

        System.out.println("\n== Calendar ==");
        System.out.printf("%s %s %02d %02d:%02d:%02d KST %d"
        , getWeekName(cal.get(Calendar.DAY_OF_WEEK))
        , getMonthName(cal.get(Calendar.MONTH))
        , cal.get(Calendar.DAY_OF_MONTH)
        , cal.get(Calendar.HOUR_OF_DAY)
        , cal.get(Calendar.MINUTE)
        , cal.get(Calendar.SECOND)
        , cal.get(Calendar.YEAR));
    }

    public static String getWeekName(int weekNumber){
        switch(weekNumber){
            case Calendar.SUNDAY: return "Sun";
            case Calendar.MONDAY: return "Mon";
            case Calendar.TUESDAY: return "Tue";
            case Calendar.WEDNESDAY: return "Wed";
            case Calendar.THURSDAY: return "Thu";
            case Calendar.FRIDAY: return "Fri";
            case Calendar.SATURDAY: return "Sat";
            default: throw new IllegalArgumentException("Unexpected value : " + weekNumber);
        }
    }

    public static String getMonthName(int monthNumber){
        switch (monthNumber){
            case Calendar.JANUARY: return "Jan";
            case Calendar.FEBRUARY: return "Feb";
            case Calendar.MARCH: return "Mar";
            case Calendar.APRIL: return "Apr";
            case Calendar.MAY: return "May";
            case Calendar.JUNE: return "Jun";
            case Calendar.JULY: return "Jul";
            case Calendar.AUGUST: return "Aug";
            case Calendar.SEPTEMBER: return "Sep";
            case Calendar.OCTOBER: return "Oct";
            case Calendar.NOVEMBER: return "Nov";
            case Calendar.DECEMBER: return "Devc";
            default: throw new IllegalArgumentException("Unexpected value : " + monthNumber);
        }
    }
}
