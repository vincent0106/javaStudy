package chap09;

/*
* 2개 이상의 인터페이스 설정 예제
* */
public class Sample07 {

    public static void main(String[] args){

    }
}

interface Student{
    void study();
}

interface Teacher{
    void teach();
}

//학생
class Person1 implements Student{

    @Override
    public void study() {
        System.out.println("Person1이 공부한다.");
    }
}

//선생님
class Person2 implements Teacher{

    @Override
    public void teach() {
        System.out.println("Person2이 가르친다.");
    }
}

//학생, 선생님
class Person3 implements Student, Teacher{

    @Override
    public void teach() {
        System.out.println("Person3이 공부한다.");
    }

    @Override
    public void study() {
        System.out.println("Person3이 가르친다.");
    }
}

