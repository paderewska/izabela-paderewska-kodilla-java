package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {

    @Autowired
    @Qualifier("todo")
    TaskList taskListToDo;

    @Autowired
    @Qualifier("progress")
    TaskList taskListInProgress;

    @Autowired
    @Qualifier("done")
    TaskList taskListDone;

    @Bean
    public Board getBoard() {
        return new Board(taskListToDo, taskListInProgress, taskListDone);
    }

    @Bean(name = "todo" )
    @Scope("prototype")
    public TaskList getToDoList() {
        return new TaskList();
    }

    @Bean(name = "progress" )
    @Scope("prototype")
    public TaskList getInProgressList() {
        return new TaskList();
    }

    @Bean(name = "done" )
    @Scope("prototype")
    public TaskList getDoneList() {
        return new TaskList();
    }
}