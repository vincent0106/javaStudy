package chap10;

public class Sample03 {

    public void main (String[] args){
        Sample01 age = new Sample01();
        Sample02 name = new Sample02();

        age.setA(18);
        name.setA("빵형");

        int PersonAge = age.getA();
        String PersonName = name.getA();

        System.out.printf("%s는 %d살", PersonName, PersonAge);
    }
}
