package chap11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Spliterator;

public class Sample10 {

    public static void main(String[] args){
        var list = new ArrayList<String>();
        list.add("dog");
        list.add("dog");
        list.add("cat");
        list.add("cat");
        list.add("lion");
        list.add("lion");
        System.out.println("<<ArrayList>>");
        System.out.println(list);

        var hs = new HashSet<String>();
        hs.addAll(list);
        System.out.println("\n<<HashSet>>");
        System.out.println(hs);

        System.out.println("\n<<'lion'을 추가한 후에 출력합니다.>>");
        hs.add("lion");
        hs.forEach(System.out::println);

        System.out.println("\n'dog'가 존재하나요? " + hs.contains("dog"));

        //Spliterator
        System.out.println("\n<<Spiterator>>");
        Spliterator<String> nameSpliterator = hs.spliterator();
        nameSpliterator.forEachRemaining(System.out::println);

        hs.iterator().forEachRemaining(System.out::println);


    }
}
