package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;

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
        ArrayList<String> theListToDo = board.getToDoList();
        ArrayList<String> theListInProgress = board.getInProgressList();
        ArrayList<String> theListDone = board.getDoneList();
        theListToDo.add("Zadanie pierwsze");
        theListInProgress.add("Zadanie drugie");
        theListDone.add("Zadanie trzecie");

        //Then
        Assert.assertEquals("Zadanie pierwsze", theListToDo.get(0));
        Assert.assertEquals("Zadanie drugie", theListInProgress.get(0));
        Assert.assertEquals("Zadanie trzecie", theListDone.get(0));
    }
}
