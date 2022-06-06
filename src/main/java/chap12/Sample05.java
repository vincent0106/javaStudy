package chap12;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

public class Sample05 {
    public static void main(String[] args) {
        FLOWER flower = FLOWER.ROSE;
        System.out.printf("I have a %s.\n", flower.getName());

        // Lombok
        System.out.printf("I have a %s.", FLOWER.SUNFLOWER.getName());
    }
}

enum FLOWER {
    SUNFLOWER("sunflower"), ROSE("rose");    //세미콜론 필수

    private final String name;

    private FLOWER(String flowerName) {
        this.name = flowerName;
    }

    public String getName() {
        return name;
    }
}

@RequiredArgsConstructor
@Getter
enum FLOWER2 {
    SUNFLOWER("sunflower"), ROSE("rose");

    private final String name;
}
