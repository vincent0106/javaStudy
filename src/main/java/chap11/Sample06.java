package chap11;

import java.util.Stack;

public class Sample06 {

    /*
    * Stack
    *   : LIFO(후입선출)
    *   - pop : 맨위에 있는 객체를 반환 하고 제거함.
    *   - push : 맨위에 추가
    *   - isEmpty : 비어 있는지 확인 return boolean
    *   - clear : 모든 값 제거
    *   - peek : 맨위에 있는 객체를 반환 -> 제거 하지 않음.
    *   - size : 객체의 총 갯수 반환
     */
    public static void main(String[] args){
        var stack = new Stack<String>();

        // 1.dog, cat, lion 순으로  push
        stack.push("dog");
        stack.push("cat");
        stack.push("lion");
        System.out.printf("총 %d의 자료가 있습니다.%n%n", stack.size());

        //2. pop
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
        System.out.printf("총 %d의 자료가 있습니다.%n%n", stack.size());
    }
}
