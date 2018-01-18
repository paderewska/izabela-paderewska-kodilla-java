package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.ArrayList;

@Configuration
public class BoardConfig {

    @Autowired
    @Qualifier("todo")
    TaskList taskList;

    @Bean
    public Board getBoard() {
        return new Board(getToDoList(), getInProgressList(), getDoneList());
    }

    @Bean(name = "todo" )
    @Scope("prototype")
    public TaskList getToDoList() {
        return new TaskList(new ArrayList<>());
    }

    @Bean(name = "progress" )
    @Scope("prototype")
    public TaskList getInProgressList() {
        return new TaskList(new ArrayList<>());
    }

    @Bean(name = "done" )
    @Scope("prototype")
    public TaskList getDoneList() {
        return new TaskList(new ArrayList<>());
    }
}