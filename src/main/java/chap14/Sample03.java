package chap14;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;

public class Sample03 {

    public static void main(String[] args){

        @Sample03AnnoClass
        class C {}

        @Sample03AnnoRuntime
        class R {}

        // 컴파일 할 까지 사용 하므로 실행 단계인 Runtime 에서는 보이지 않음
        System.out.println("클래스명 : " + C.class.getName());
        System.out.println("Annotation 수 : " + C.class.getAnnotations().length);
        System.out.println("Annotation  : " + Arrays.toString(C.class.getAnnotations()));
        System.out.println();
        System.out.println("클래스명 : " + R.class);
        System.out.println("Annotation 수 : " + R.class.getAnnotations().length);
        System.out.println("Annotations : " + Arrays.toString(R.class.getAnnotations()));
    }
}

@Retention(RetentionPolicy.CLASS)
@interface Sample03AnnoClass {}

@Retention(RetentionPolicy.RUNTIME)
@interface Sample03AnnoRuntime {}
