package com.kodilla.spring.forum;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class testUserTestSuite {

    @Test
    public void testGetUsername() {

        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext();
        ForumUser forumUser = context.getBean(ForumUser.class);

        //When


    }

}
