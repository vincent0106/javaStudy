package chap18;

public class Sample17 {

    /*
    * Java 1.9 부터는 아래와 같이 처리 가능
    * */
    public static void main(String[] args){
        AutoMachine machine = AutoMachine.getInstance();
        AutoMachine2 machine2 = AutoMachine2.getInstance();

        try(machine; machine2){
            machine.run();
            machine2.run();
        } catch (Exception e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("모든 AutoMachine이 종료 되었습니다.");
        }
    }
}
