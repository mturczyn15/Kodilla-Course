package com.example.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class TaskQueue implements HomeworkObservable {
    private final List<String> tasks;
    private final String name;
    private final List<HomeworkObserver> observers;

    public TaskQueue(String name) {
        tasks = new ArrayList<>();
        observers = new ArrayList<>();
        this.name = name;
    }

    public void addTask(String task) {
        tasks.add(task);
        notifyObservers();
    }

    @Override
    public void registerObserver(HomeworkObserver observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (HomeworkObserver observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(HomeworkObserver observer) {
        observers.remove(observer);
    }

    public String getName() {
        return name;
    }

    public List<String> getTasks() {
        return tasks;
    }
}
