package chap12;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class Sample08 {
    public static void main(String[] args){
        Location loc = new Location(0,0);
        System.out.println(loc);
        Player.RIGHT.execute(loc, 10);
        Player.UP.execute(loc, 20);
        Player.DOWN.execute(loc, 15);
        Player.LEFT.execute(loc, 2);
    }

}

@Getter
@Setter
@AllArgsConstructor
@ToString
class Location{
    private int x = 0;
    private int y = 0;
}

@AllArgsConstructor
@Getter
enum Player{
    LEFT{
        @Override
        public void execute(Location loc, int distance) {
            loc.setX(loc.getX() - distance);
            System.out.printf("LEFT %2d - %s\n", distance, loc.toString());
        }
    },
    RIGHT{
        @Override
        public void execute(Location loc, int distance) {
            loc.setX(loc.getX() + distance);
            System.out.printf("RIGHT %2d - %s\n", distance, loc.toString());
        }
    },
    UP{
        @Override
        public void execute(Location loc, int distance) {
            loc.setY(loc.getY() + distance);
            System.out.printf("UP %2d - %s\n", distance, loc.toString());
        }
    },
    DOWN{
        @Override
        public void execute(Location loc, int distance) {
            loc.setY(loc.getY() - distance);
            System.out.printf("DOWN %2d - %s\n", distance, loc.toString());
        }
    };

    public abstract void execute(Location loc, int distance);
}
