package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {

    @Test
    public void testTaskAdd() {

        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Board board = context.getBean(Board.class);

        //When
        String exerciseToDo = "Exercise to do";
        String exerciseInProgress = "While Doing";
        String exerciseDone = "finished exercise";
        board.getToDoList().addTask(exerciseToDo);
        board.getInProgressList().addTask(exerciseInProgress);
        board.getDoneList().addTask(exerciseDone);

        //Then
        Assert.assertEquals(exerciseToDo, board.getToDoList().getTasks().get(0));
        Assert.assertEquals(exerciseInProgress, board.getInProgressList().getTasks().get(0));
        Assert.assertEquals(exerciseDone, board.getDoneList().getTasks().get(0));
    }
}
