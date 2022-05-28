package chap09;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class Car {

    /*
    * 추상클래스 : abstract
    * 상속의 개념으로 부모에서 선언해 놓은 것을 자식이 받아서 사용 한다.
    * 오버라이딩을 하여 자식이 해당 메소드 내용을 수정하여 사용 할 수 있다.
    * #. 업캐스팅 : 자식 -> 부모
    * #. 다운캐스팅 : 부모 -> 자식
    * */

    protected String color;         // 색
    protected String manufacturer;    // 제조사

//    public abstract String fillUp();    // 휘발유|등유|전기를 넣습니다.
    
    public String fillUp() {
    	return "부모 부모";
    };    // 휘발유|등유|전기를 넣습니다.

    public void printInfo(){
        System.out.println("이 차의 색 : " + this.color);
        System.out.println("이 차는 " + fillUp());
        System.out.println("이 차는 " + this.manufacturer + "에서 생산합니다.");
    }

    public String getColor() {
        return color;
    }

    public String getManufacturer() {
        return manufacturer;
    }
}
