package chap14;

import static java.lang.annotation.RetentionPolicy.SOURCE;
import java.lang.annotation.Retention;

public class Sample22 {
	@Sample22Anno
	public void test() {
		
	}
	
	@Retention(SOURCE)
	@interface Sample22Anno {}
}
