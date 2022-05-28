package chap10;

class Computer1{
    //클래스에서 제너릭을 사용하지 않아서 제너릭 타입을 사용할 수 없음.
    private String componentClassName;

    public void toInfo(){
        System.out.println(componentClassName);
    }

    //생성자에 제네릭 타입을 선언
    public <T extends ComputerPart1>Computer1(T component){
        this.componentClassName = component.getClass().getName();
    }
}

//컴퓨터 내장 부품 대상 객체
class ComputerPart1{}

//메모리
class Memory1 extends ComputerPart1 {}

public class Sample09 {
    public static void main(String[] args){
        //생성자를 통한 객체 생성(입력되는 타입이 제한됨)
        Computer1 mem = new Computer1(new Memory1());
        mem.toInfo();
    }

}
