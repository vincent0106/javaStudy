package chap12.chap13;

import java.util.Locale;

/*
* Locale Builder 로 활용
* */
public class Sample10 {
    public static void main(String[] args){
        System.out.println("\n== Language : ko, Country : KR, Variant : WIN");

        Locale lo = new Locale("ko", "KR", "WIN");
        System.out.println(lo);

        System.out.println("\n== Using Builder1");
        Locale loBuilder1 = new Locale.Builder()
                .setLocale(new Locale("ko", "KR"))  // new Locale("ko", "KR", "WIN") --Error
                .setLanguage("en")
                .build();
        System.out.println(loBuilder1);

        System.out.println("\n== Using Builder2");
        Locale loBuilder2 = new Locale.Builder()
                .setLocale(new Locale("ko", "KR"))  // new Locale("ko", "KR", "WIN") --Error
                .setLanguage("en")
                .setRegion("KR")
                .build();
        System.out.println(loBuilder2);

    }
}
