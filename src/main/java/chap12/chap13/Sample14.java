package chap12.chap13;

import java.time.ZoneId;

/*
* ZoneId 츌력
* */
public class Sample14 {

    public static void main(String[] args){
        ZoneId.getAvailableZoneIds().stream().forEach(System.out::println);
    }
}
