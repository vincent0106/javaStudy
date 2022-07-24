package chap19;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sample14 {

    public static void main(String[] args){
        String sPath = "/Users/vincent106/workspace/javaStudy";

        // 모든 파일과 디렉토리 수집
        String files[] = new File(sPath).list();

        // 디렉토리 filter식 작성
        Predicate<String> dirCondition = x -> {
            File fileDir = new File(x);
            return fileDir.isDirectory();
        };

        //파일 filter식 작성
        Predicate<String> fileCondition = Predicate.not(dirCondition);

        List<String> dirList = Arrays.stream(files)
                .filter(dirCondition)
                .map(dir -> "[" + dir + "]")
                .collect(Collectors.toList());

        List<String> fileList = Arrays.stream(files)
                .filter(fileCondition)
                .map(file -> {
                    File f = new File(file);

                    file += (f.canExecute()) ? "\t실행파일 " : "\t실행불가";

                    file += (f.canRead()) ? "\t읽기가능": "\t읽기불가";

                    file += (f.canWrite()) ? "\t쓰기가능" : "\t쓰기불가";

                    file += (f.isHidden()) ? "\t숨김파일" : "\t일반파일";

                    return file;

                }).collect(Collectors.toList());

        Stream.of(dirList, fileList)
                .flatMap(List::stream)
                .forEach(System.out::println);
    }
}
