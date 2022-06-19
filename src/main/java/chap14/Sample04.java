package chap14;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
* TYPE 는 클래스, 인터페이스, 열거형상수클래스 ( enum )
* */
@Sample04AnnoClass
public class Sample04 {
    private String test;

    public static void main(String[] args){}

    public void testMethod(){}

}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)   // Class, interface, @interface, enum
@interface Sample04AnnoClass {}
