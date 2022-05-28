package chap08.Sample20;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Car {
	
	@NonNull
	private String	color;			// 차량색
	private int 	doors;			// 문 수
	
	@NonNull
	private String 	maunfacturer;	// 제조사
}
