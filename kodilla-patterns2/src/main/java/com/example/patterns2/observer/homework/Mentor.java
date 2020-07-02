package com.example.patterns2.observer.homework;

public class Mentor implements HomeworkObserver {
    private final String username;
    private int updateCount;

    public Mentor(String username) {
        this.username = username;
    }

    @Override
    public void update(TaskQueue taskQueue) {
        System.out.println(username + ": New task in queue " + taskQueue.getName() + "\n" +
                " (total: " + taskQueue.getTasks().size() + " messages)");
        updateCount++;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
