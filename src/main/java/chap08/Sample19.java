package chap08;

public class Sample19 {

    // 캡슐화 설명 : 외부에서 내부의 데이터를 수정 (접근) 할 수 없도록 캡슐로 한번 씌운것.
    // 캡슐화의 기본은 접근제어자 : public, default, protected, private
    // 알약의 캡슐.
    // 장점 : 정보의 은닉.
    // 캡슐화 한 상태에서 변수에 접근하기 위해 Getter, Setter 을 활용한다.
    public static void main(String[] args){
        // 1. 내지갑에 10,000원 있음
        Wallet myWallet = new Wallet(10000);
        // 객체를 선언 한뒤 직접적으로 myMoney 변수에 접근하여 금액을 수정함. -> 신뢰 할 수 없음.

        //2. 2,000 원 짜리 물품을 구매했으며 세금 10% 더해서 2,200원 지불함.
        //myWallet.myMoney -= 2200;
        myWallet.pay(2000);
        
        //3. 내 지갑의 남은 돈을 확인
        myWallet.checkMyMoney();
    }
}

 class Wallet {
    private int myMoney;

    public Wallet(int myMoney){
        this.myMoney = myMoney;
    }

    public void pay(int payMoney){
        this.myMoney -= (int) (payMoney * 1.1);
    }

    public void checkMyMoney(){
        System.out.println("남은돈 : " + this.myMoney);
    }
}
