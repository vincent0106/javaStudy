package chap12;

public class Sample01 {

    public static void main(String[] args) {
        //색 집합
        final int RED = 1;
        final int BLUE = 2;
        final int ORANGE = 3;

        //크기 집합
        final int SMALL = 1;
        final int MIDIUM = 2;
        final int LARGE = 3;

        int inputColor = RED;

        System.out.println(inputColor == RED ? "Red" : "Not red");
        System.out.println(inputColor == SMALL ? "Red" : "Not red");
        // 상수 inputColor : 1 / SMALL : 1 이므로 Red가 출력되었음.
    }
}
