package chap14;

import java.awt.*;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/*
* METHOD 는 메서드 명에만 사용
* */

public class Sample06 {

    private String test;

    private Color1 color = Color1.RED;

    public static void main(String[] args){}

    @Sample06AnnoMethod
    public void testMethod(){}

}

@Target(ElementType.METHOD)
@interface Sample06AnnoMethod{}
