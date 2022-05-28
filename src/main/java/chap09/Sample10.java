package chap09;

import java.util.UUID;

/*
* UUID를 활용한 방법
* UUID : 범용 고유 식별자
* 16옥텟(128비트)의 수.
* 표준형식에서 32개의 16진수로 표현되며 총 36개 문자 로 된 8-4-4-4-12의 5개의 그룹을 -(하이푼) 으로 구분한다.
* */
public class Sample10 {
    public static void main(String[] args){
        String legacyKey = LagacyUtil.getRandom();
        System.out.printf("레거시 시스템에서 처리될 키값은 %s입니다.\n\n", legacyKey);

        // 5개의 임의의 키값을 가져와서 데이터를 처리한다.
        for(int i = 0; i < 5; i ++){
            String key = NewUtil.getRandom();
            System.out.printf("새로운 시스템에서 처리될 키값은 %s입니다.%n", key);
        }
    }
}

class LagacyUtil{
    public static String getRandom(){
        return "" + (int)(Math.random() * 10 + 1);  // 1~10까지 출력
    }
}

class NewUtil extends Util{
    public static String getRandom(){
        return "" + UUID.randomUUID();
    }
}
