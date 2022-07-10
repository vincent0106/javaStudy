package chap16;

import java.util.function.Function;

public class Sample23 {

    public static void main(String[] args){
        Function<String, String> helloLambda = (name) -> HelloTo1.hello(name);

        // hello 라는 인스턴스 메소드를 참조.
        Function<String, String> helloStatic = HelloTo::hello;

        System.out.println(helloLambda.apply("빵형"));
        System.out.println(helloStatic.apply("파티쉐"));
    }
}

class HelloTo1{
    public static String hello(String name){
        return "Hello~ " + name;
    }
}
