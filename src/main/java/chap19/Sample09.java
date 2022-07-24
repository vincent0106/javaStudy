package chap19;

import java.io.*;
import java.net.URL;

public class Sample09 {

    public static void main(String[] args) throws Exception{
        URL url = new URL("https://www.google.co.kr/images/branding/googlelogo/2x/googlelogo_color_272x92dp.png");
        InputStream in = new BufferedInputStream(url.openStream());
        OutputStream out = new BufferedOutputStream(new FileOutputStream("google.png"));

        for ( int i; ( i = in.read()) != -1; ){
            out.write(i);
        }
        in.close();
        out.close();
    }
}
