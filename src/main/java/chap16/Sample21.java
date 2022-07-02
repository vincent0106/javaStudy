package chap16;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Sample21 {

    public static void main(String[] args){
        // Function은 매개변수의 자료형을 각각 정의
        Function<String, String> sourceFile = p -> p + ".java";

        // UnaryOperator은 매개변수와 반환 자료형을 하나로 정의
        UnaryOperator<String> classFile = (String p) -> p + ".class";

        System.out.println(sourceFile.apply("Sample21"));
        System.out.println(classFile.apply("Sample21"));
    }
}
