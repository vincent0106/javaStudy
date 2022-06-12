package chap12;

import lombok.AllArgsConstructor;
import lombok.Getter;

public class Test1 {

    public static void main(String[] args) {
        Weekend.print(Weekend.MONDAY);
        Weekend.print(Weekend.FRIDAY);
        Weekend.print(Weekend.SUNDAY);
    }
}

@Getter
@AllArgsConstructor
enum Weekend {
    SUNDAY(0, "일요일"),
    MONDAY(1, "월요일"),
    TUESDAY(2, "화요일"),
    WEDNESDAY(3, "수요일"),
    THURSDAY(4, "목요일"),
    FRIDAY(5, "금요일"),
    SATURDAY(6, "토요일");

    private final int order;
    private final String name;

    public Weekend getYesterday() {
        if (this.order == 0) {
            return SATURDAY;
        }
        for (Weekend weekend : Weekend.values()) {
            if (weekend.getOrder() == this.order - 1) {
                return weekend;
            }
        }
        return null;
    }

    public static void print(Weekend weekend) {
        System.out.println("--------- 시작 ---------");
        System.out.printf("## %s(%s) 입니다.\n", weekend.getName(), weekend.name());
        Weekend yesterday = weekend.getYesterday();
        if (yesterday != null) {
            System.out.printf("## 어제는 %s(%s) 입니다.\n", yesterday.getName(), yesterday.name());
        }
        System.out.println("");
    }
}
