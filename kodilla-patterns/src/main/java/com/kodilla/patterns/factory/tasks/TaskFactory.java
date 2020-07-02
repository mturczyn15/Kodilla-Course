package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {

    public static final String DRIVINGTASK = "DRIVINGTASK";
    public static final String PAINTINGTASK = "PAINTINGTASK";
    public static final String SHOPPINGTASK = "SHOPPINGTASK";

    public final Task makeTask(final String taskClass) {

        switch(taskClass) {
            case DRIVINGTASK:
                return new DrivingTask("drive", "London", "car");
            case PAINTINGTASK:
                return new PaintingTask("paint", "red", "bicycle");
            case SHOPPINGTASK:
                return new ShoppingTask("buy", "ham", 1000);
            default:
                return null;
        }
    }
}
