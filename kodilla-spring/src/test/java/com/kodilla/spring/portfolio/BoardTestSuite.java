package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class BoardTestSuite {

    @Test
    public void testBoard() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When & Then
        board.getToDoList();
        board.getInProgressList();
        board.getDoneList();
    }

    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        TaskList theTaskListToDo = board.getToDoList();
        TaskList theTaskListInProgress = board.getInProgressList();
        TaskList theTaskListDone = board.getDoneList();
        List<String> theArrayListToDo = theTaskListToDo.getTasks();
        List<String> theArrayListInProgress = theTaskListInProgress.getTasks();
        List<String> theArrayListDone = theTaskListDone.getTasks();
        theArrayListToDo.add("Zadanie 1");
        theArrayListInProgress.add("Zadanie 2");
        theArrayListDone.add("Zadanie 3");

        //Then
        Assert.assertEquals("Zadanie 1", theArrayListToDo.get(0));
        Assert.assertEquals("Zadanie 2", theArrayListInProgress.get(0));
        Assert.assertEquals("Zadanie 3", theArrayListDone.get(0));
    }
}