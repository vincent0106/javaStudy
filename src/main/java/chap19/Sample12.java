package chap19;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sample12 {

    /*
    * Sample 11 을 Stream 으로 수정
    * */
    public static void main(String[] args){
        String sPath = "/Users/vincent106/workspace/javaStudy";

        String files[] = new File(sPath).list();

        List<String> fileList = Arrays.stream(files).map(x -> {
            File fileDir = new File(x);
            return (fileDir.isDirectory()) ? "디렉토리: " + x : "파일: " + x;
        }).collect(Collectors.toList());

        fileList.stream()
                .sorted()
                .forEach(System.out::println);
    }
}
