package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public final class TaskList {

    private List<String> tasks = new ArrayList<>();

    public void addTask(String name) {

        tasks.add(name);
    }

    public List<String> getTasks() {
        return tasks;
    }
}
