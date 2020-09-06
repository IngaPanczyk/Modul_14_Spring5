package spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class BoardConfig {
    @Autowired
    @Qualifier("L1")
    TaskList toDoList;

    @Autowired
    @Qualifier("L2")
    TaskList inProgressList;

    @Autowired
    @Qualifier("L3")
    TaskList doneList;

    @Bean(name = "L1")
    public TaskList createToDoList() {
        return new TaskList();
    }

    @Bean(name = "L2")
    public TaskList createInProgressLIst() {
        return new TaskList();
    }

    @Bean(name = "L3")
    public TaskList createDoneList() {
        return new TaskList();
    }

    @Bean
    public Board createBoard() {
        return new Board(toDoList, inProgressList, doneList);
    }
}
