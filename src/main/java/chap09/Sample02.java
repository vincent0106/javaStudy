package chap09;

public class Sample02 {

	//추상클래스에서 참조 자료형으로 사용할 경우
    public static void main(String[] args){
    	Car car = new ElectricCar("red", "Hyundai");
        car.printInfo();
        //car.setColor("Gray");		// 자손 클래스에 정의돈 메서드는 사용할 수 없다.
        car.printInfo(); 

    }
}
