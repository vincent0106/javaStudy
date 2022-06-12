package chap12;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Scanner;

public class Sample07 {

    /*
    * enum 에 메서드를 추가
    * city.ordinal() 의 경우 순번이 추후 삽입 및 삭제가 이루어 지면 순번이 변경 될 수 있어 직접 orderNo 를 넣어서 순번을 정해놓고 사용한다.
    * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" == 목적지 정보 == ");

        for (CITY city : CITY.values()) {
            System.out.printf("%d\t%s(%s)%n", city.getOrder(), city.getDestination(), city.name());
        }

        System.out.print("목적지 번호를 선택하세요.");
        int selectNum = sc.nextInt();

        CITY retCity = CITY.valueOf(selectNum);
        if (retCity == null){
            System.out.println("목적지를 확인하세요.");
        }
        else {
            switch (retCity){
                /*case SEOUL -> System.out.printf("\n%s로 출발합니다.", CITY.SEOUL.getDestination());
                case DAEJEON -> System.out.printf("\n%s로 출발합니다.", CITY.DAEJEON.getDestination());
                case DAEGU -> System.out.printf("\n%s로 출발합니다.", CITY.DAEGU.getDestination());
                case PUSAN -> System.out.printf("\n%s로 출발합니다.", CITY.PUSAN.getDestination());
                case GWANGJU -> System.out.printf("\n%s로 출발합니다.", CITY.GWANGJU.getDestination());*/
                case SEOUL: System.out.printf("\n%s로 출발합니다.", CITY.SEOUL.getDestination()); break;
                case DAEJEON: System.out.printf("\n%s로 출발합니다.", CITY.DAEJEON.getDestination()); break;
                case DAEGU: System.out.printf("\n%s로 출발합니다.", CITY.DAEGU.getDestination()); break;
                case PUSAN: System.out.printf("\n%s로 출발합니다.", CITY.PUSAN.getDestination()); break;
                case GWANGJU: System.out.printf("\n%s로 출발합니다.", CITY.GWANGJU.getDestination()); break;
                default: System.out.println("도착지를 다시 확인하세요.");
            }
        }
    }
}


@AllArgsConstructor
@Getter
enum CITY {

//    SEOUL("서울"), DAEJEON("대전"), DAEGU("대구"), PUSAN("부산"), GWANGJU("광주");

    SEOUL(0,"서울"), DAEJEON(1,"대전"),
    DAEGU(2,"대구"),
    PUSAN(3,"부산"), GWANGJU(4,"광주");

    private final int order;    // 순번
    private final String destination;

/*    private CITY(String destination) {
        this.destination = destination;
    }*/

    public static CITY valueOf(int selectNum) {
        CITY returnCity = null;
        for (CITY city : CITY.values()) {
            if (selectNum == city.ordinal()) {
                returnCity = city;
            }
        }
        return returnCity;
    }
}
