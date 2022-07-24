package chap18;

public class Sample09 {

    /*
    * throw new UnsupportedOperationException 로 직접 Exception을 발생 시킨다.
    * */
    public static void main(String[] args) {
        try {
            throw new UnsupportedOperationException("throw로 오류를 강제로 발생시켰습니다.");
        } catch (UnsupportedOperationException e){
            System.out.println(e.getMessage());
        }
    }
}
