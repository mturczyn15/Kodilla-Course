package com.example.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HomeworkTestSuite {
    @Test
    public void testUpdate() {
        //Given
        Mentor kamil_zawada = new Mentor("Kamil Zawada");
        Mentor kamil_tywoniuk = new Mentor("Kamil Tywoniuk");
        TaskQueue easy_tasks = new TaskQueue("Easy tasks");
        TaskQueue hard_tasks = new TaskQueue("Hard tasks");
        easy_tasks.registerObserver(kamil_tywoniuk);
        hard_tasks.registerObserver(kamil_zawada);
        //When
        easy_tasks.addTask("Modul 1 exercise 3");
        easy_tasks.addTask("Modul 2 exercise 3");
        easy_tasks.addTask("Modul 3 exercise 3");
        hard_tasks.addTask("Modul 3 exercise 2");
        hard_tasks.addTask("Modul 4 exercise 3");
        //Then
        assertEquals(3, kamil_tywoniuk.getUpdateCount());
        assertEquals(2, kamil_zawada.getUpdateCount());
    }
}
