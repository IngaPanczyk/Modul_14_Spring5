package spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    List<String> tasks;

    public TaskList(List<String> tasks) {
        tasks = new ArrayList<>();
    }

    public TaskList() {

    }
}
