package spring.portfolio;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class BoardTestSuite {
    @Autowired
    @Qualifier("L1")
    private TaskList toDoList;

    @Qualifier("L2")
    private TaskList inProgressList;

    @Qualifier("L3")
    private TaskList doneList;

    @Autowired
    private Board board;

    @Test
    public void testTaskAdd() {
        //Given & When
        List toDoList = board.getToDoList().add("Task1");
        List inProgressList = board.getInProgressList().add("Task2");
        List doneList = board.getDoneList().add("Task3");

        //Then
        System.out.println("ToDoList: " + toDoList);
        System.out.println("InProgressList: " + inProgressList);
        System.out.println("DoneList: " + doneList);
    }
}
