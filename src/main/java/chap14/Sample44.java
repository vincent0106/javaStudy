package chap14;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Sample44AnnoClass
public class Sample44 {
	
	private String test;
	
	public static void main(String[] args) {}
		public void testMethod() {}
	
	

}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Sample44AnnoClass {
}