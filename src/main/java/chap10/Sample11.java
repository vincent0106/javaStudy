package chap10;

import lombok.AllArgsConstructor;
import lombok.Getter;

public class Sample11 {

    public static void main(String[] args){
        Student1<Integer, Integer> younghee = new Student1<>(1, 4);
        Student1<Double, Double> younghee2 = new Student1<>(160.1, 55.5);
        // 타입제한으로 오류 발생 ( Integer 인데 Double 로 처리함 - 에러 )
        younghee.printInfo("영희");
        younghee2.printInfo("영희(더블)");
    }

}

@Getter
@AllArgsConstructor
//class Student1<G extends Integer, C extends Integer> {
class Student1<G extends Number, C extends Number> {
    //  Number 로 처리 하면 Integer, Double, Float, Long, Byte, Short 를 상속받으므로 모두 처리가 가능하다.
    G g;
    C c;

    public void printInfo(String name){
        System.out.println(name + "은(는) " + g + " 학년 " + c + "반 ");
    }
}
