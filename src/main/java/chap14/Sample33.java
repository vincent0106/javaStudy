package chap14;


import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;

public class Sample33 {
	
	public static void main(String[] args) {
		@Sample33AnnoClass
		class C {}
		
		@Sample33AnnoRuntime
		class R {}
		
		System.out.println("클래스명 :" + C.class.getName());
		System.out.println("Annotation 수 " + C.class.getAnnotations().length);
		
		System.out.println("Annotations :" + Arrays.toString(C.class.getAnnotations()));
		System.out.println();
		System.out.println("클래스명 : " + R.class);
		System.out.println("Annotations  수" +R.class.getAnnotations().length );
		System.out.println("Annotations : " + Arrays.toString(R.class.getAnnotations()));
		
		
		
		
}
	}

@Retention(RetentionPolicy.CLASS)
@interface Sample33AnnoClass {}

@Retention(RetentionPolicy.CLASS)
@interface Sample33AnnoRuntime {}



