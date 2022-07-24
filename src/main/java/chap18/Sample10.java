package chap18;

public class Sample10 {

    /*
    * 메소드 명 뒤에 throws Exception를 붙여서 Exception 을 상위 메서드로 위임.
    * (접근 제한자) [반환 자료형 메서드명(파라미터...] throws 예외 클래스 { }
    * */
    public static void main(String[] args){
        try{
            excute();
        } catch (Exception e){
            System.out.println(e.getMessage() + " in Main method");
        }
    }

    public static void excute() throws Exception{
        throw new Exception("throws 로 오류를 강제로 위임 시켰습니다.");
    }
}
