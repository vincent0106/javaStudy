package chap19;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Sample15 {

    /*
    * Zip 압축하기
    *
    * */
    public static void main(String[] args) {
        String path = "/Users/vincent106/workspace/javaStudy/temp/";

        byte[] bytes = new byte[1024];

        //압축할 파일 목록을 가져옵니다.
        String files[] = new File(path).list();

        try (FileOutputStream fos = new FileOutputStream(path + "test.zip");
             ZipOutputStream zos = new ZipOutputStream(fos)) {
            Arrays.stream(files)
                    .forEach(x -> {
                        File f = new File(path + x);
                        try (FileInputStream fis = new FileInputStream(f)) {
                            ZipEntry zipEntry = new ZipEntry(f.getName());
                            zos.putNextEntry(zipEntry);
                            int length;
                            while ((length = fis.read(bytes)) >= 0) {
                                zos.write(bytes, 0, length);
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
