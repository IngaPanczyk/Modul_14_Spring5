package spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

@Configuration
public class BoardConfig {

    Board board;

    @Bean
    public Board boardControler() {
        return new Board(board.getToDoList(),board.getInProgressList(), board.getDoneList());
    }
}
