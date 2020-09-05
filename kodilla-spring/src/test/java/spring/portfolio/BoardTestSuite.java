package spring.portfolio;

import javafx.concurrent.Task;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class BoardTestSuite {
    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext(Board.class);
        //When
        //Then
        //System.out.println("===== Tasks list: ==== >>");
        //System.out.println(context);
        //System.out.println("<< ===== Tasks list ====");
    }
}
