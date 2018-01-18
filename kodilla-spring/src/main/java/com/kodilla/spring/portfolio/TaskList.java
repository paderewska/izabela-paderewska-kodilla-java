package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public final class TaskList extends ArrayList<String> {

    private List<String> tasks;

    public TaskList(List<String> tasks) {
        tasks = new ArrayList<>();
    }

    public List<String> getTasks() {
        return tasks;
    }

}
