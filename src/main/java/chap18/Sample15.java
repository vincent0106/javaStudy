package chap18;

public class Sample15 {

    /*
    * try catch resources 문
    * AutoCloseable 처리가 되어 있을 경우 아래와 같이 try catch 을 처리 하면 finally 에서 close 문을 호출 할 필요가 없다.
    * */
    public static void main(String[] args){
        try(AutoMachine machine = AutoMachine.getInstance()){
            machine.run();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
