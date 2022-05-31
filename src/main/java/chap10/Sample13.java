package chap10;

public class Sample13 {

    /*
    * 자료형을 제한한 제너릭
    * <E extends Number> -> Number 로 제한 함.
    * 그래서 nb.setNumber("11234") 에서 "11234" 는 String 타입이므로 에러!!
    * */
    public static void main(String[] args){

        NumberBox nb = new NumberBox();
        nb.setNumber(20002);
        nb.setNumber(43567.1);
//        nb.setNumber("11234");  // 오류 발생

    }

}

class NumberBox{
    public <E extends Number> void setNumber(E e){
        System.out.printf("입력된 값은 [%s] 입니다. %n", e.toString());
    }
}
