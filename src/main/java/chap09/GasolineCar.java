package chap09;


public class GasolineCar extends Car {

	public GasolineCar(String color, String manufacturer) {
		super(color, manufacturer);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String fillUp() {
		return "휘발유를 주유합니다.";
	}
	
	
	/*
    private String color;           // 색
    private String manufacturer;    // 제조사

    public void printInfo(){
        System.out.println("이 차의 색 : " + this.color);
        System.out.println("이 차는 " + fillUp());
        System.out.println("이 차는 " + this.manufacturer + "에서 생산합니다.");
    }

    public String fillUp(){
        return "휘발유를 주유합니다.";
    }
    */
}
