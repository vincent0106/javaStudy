package chap16;

import lombok.Getter;

import java.util.function.Supplier;

public class Sample27 {

    /*
    * 생섲자 참조
    * */
    public static void main(String[] args) {
        Supplier<Name> supplier1 = () -> new Name();
        Name name1 = supplier1.get();
        System.out.println("람다식 - " + name1.getName());

        Supplier<Name> supplier2 = Name::new;
        Name name2 = supplier2.get();
        System.out.println("생성자 참조 - " + name2.getName());
    }

}

@Getter
class Name {
    private String name;

    public Name() {
        this.name = "빵형";
    }
}
