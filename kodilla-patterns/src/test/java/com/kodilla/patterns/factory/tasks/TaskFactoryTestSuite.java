package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {

    @Test
    public void testFactoryDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task task = factory.makeTask(TaskFactory.DRIVINGTASK);
        task.executeTask();
        //Then
        Assert.assertEquals("drive", task.getTaskName());
        Assert.assertTrue(task.isTaskExecuted());
    }

    @Test
    public void testFactoryShoppingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task task = factory.makeTask(TaskFactory.SHOPPINGTASK);
        task.executeTask();
        //Then
        Assert.assertEquals("buy", task.getTaskName());
        Assert.assertTrue(task.isTaskExecuted());
    }

    @Test
    public void testFactoryPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task task = factory.makeTask(TaskFactory.PAINTINGTASK);
        task.executeTask();
        //Then
        Assert.assertEquals("paint", task.getTaskName());
        Assert.assertTrue(task.isTaskExecuted());
    }
}
