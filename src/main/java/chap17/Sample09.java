package chap17;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Sample09 {

    /*
    * 1 ~ 100 까지 Stream 을 이용한 반복
    * */
    public static void main(String[] args){
        List<Board> boardList = new ArrayList<>();
        IntStream.rangeClosed(1, 100)
                .forEach(i -> {
                    boardList.add(new Board(i, "title_" + i, "user" + i, LocalDateTime.now()));
                });
        boardList.stream().forEach(System.out::println);
    }
}

@Data
@AllArgsConstructor
class Board{
    int no;
    String title;
    String user;
    LocalDateTime createdate;
}
