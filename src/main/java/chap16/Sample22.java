package chap16;

import java.util.Arrays;
import java.util.List;

public class Sample22 {

    /*
    * 매서드 참조 ( Method Reference )
    * static 매서드 참조
    *
    * */
    public static void main(String[] args){
        List<Integer> list= Arrays.asList(1,2,3,4,5);
        // 매서드 참조
        list.forEach(Writer::doWrite);

        System.out.println("#####");
        // 람다식
        list.forEach((s) -> Writer.doWrite(s));

        System.out.println("#####");
        // 향상된 for
        for (Integer i : list) {
            Writer.doWrite(i);
        }

        System.out.println("#####");
        // for
        for (int i = 0; i < list.size(); i++) {
            Writer.doWrite(list.get(i));
        }
    }
}

class Writer {
    public static void doWrite(Object msg){
        System.out.println(msg);
    }
}
