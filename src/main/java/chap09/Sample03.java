package chap09;

public class Sample03 {
    public static void main(String[] args){
        ElectricCar car = new ElectricCar("red", "hyundai");
        car.printInfo();
        car.setColor("gray");   // 자손 클래스를 자료형으로 사용해서 정의된 모든 메서드를 사용할 수 있다.
        car.printInfo();
    }
}
