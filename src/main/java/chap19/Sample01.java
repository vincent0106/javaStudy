package chap19;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Sample01 {

    /*
    * #. File
    * FileInputStream, FileOutputStream
    *  - byte 단위로 파일을 읽고 쓴다.
    *  - UTF-8 : 한글 3 Byte,
    *  - EUC-KR : 한글 2 Byte
    * */
    public static void main(String[] args){
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try{
            fis = new FileInputStream("pom.xml");
            fos = new FileOutputStream("test_pom.xml");
            int i;
            while ((i = fis.read()) != -1){
                fos.write(i);
            }
        } catch ( Exception e){
            System.out.println(e.getMessage());
        } finally {
            try {
                fos.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
