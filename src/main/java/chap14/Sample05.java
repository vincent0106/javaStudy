package chap14;

/*
* FIELD 는 변수나 enum 요소를 변수로 정할 경우
*
* */
public class Sample05 {

    // 변수
    @Sample05AnnoField
    private String test;

    // enum 요소를 변수로 선언
    @Sample05AnnoField
    private Color1 color = Color1.RED;

    public static void main(String[] args) {}

    public void testMethod(){}
}

@interface Sample05AnnoField{}

enum Color1 {
    RED, BLUE, ORANGE;
}
