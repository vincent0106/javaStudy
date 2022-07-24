package chap19;

import java.io.File;

public class Sample10 {

    /*
    * File.separator
    *   - OS 에 맞춰서 리눅스 / 혹은 윈도우 ₩ 를 변경
    * */
    public static void main(String[] args){
        String path = "workspace" + File.separator + "readjava" + File.separator + "src";
        System.out.println(path);
    }
}
