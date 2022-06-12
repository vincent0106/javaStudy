package chap12;

import lombok.AllArgsConstructor;
import lombok.Getter;

public class Test3 {

    public static void main(String[] args){
        Compute.PLUS.getResult(3, 4);
        Compute.MINUS.getResult(6, 4);
        Compute.TIMES.getResult(2, 6);
        Compute.DIVIDE.getResult(20, 10);
    }

}


@AllArgsConstructor
enum Compute{
    PLUS{
        @Override
        void getResult(int a, int b) {
            System.out.printf("%d + %d = %d\n", a, b, a + b);
        }
    }, MINUS{
        @Override
        void getResult(int a, int b) {
            System.out.printf("%d - %d = %d\n", a, b, a - b);
        }
    }, TIMES{
        @Override
        void getResult(int a, int b) {
            System.out.printf("%d * %d = %d\n", a, b, a * b);
        }
    }, DIVIDE{
        @Override
        void getResult(int a, int b) {
            System.out.printf("%d / %d = %d\n", a, b, a / b);
        }
    };

    abstract void getResult(int a, int b);

}
