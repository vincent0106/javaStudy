package chap19;

import java.io.File;
import java.util.Arrays;

public class Sample13 {

    /*
    * 파일 읽어서 hangul 로 시작 하는 파일 삭제 처리
    * */
    public static void main(String[] args){
        String sPath = "/Users/vincent106/workspace/javaStudy";

        String[] files = new File(sPath).list();

        Arrays.stream(files).filter(x -> new File(x).isFile())
                .filter(x -> x.startsWith("hangul"))
                .map(x -> {
                    new File(x).delete();
                    return x;
                })
                .forEach(x -> System.out.println("파일 [" + x + "]이 삭제되었습니다."));

    }
}
