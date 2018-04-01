package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTestSuite {

    @Test
    public void updateTasks() {

        //Given
        Mentor mentorPawel = new Mentor("Mentor Paweł");
        Mentor mentorNiePawel = new Mentor("Mentor Nie Paweł");
        Student iza = new Student("Iza");
        Student jurand = new Student("Jurand");
        Student trzeciStudent = new Student("Trzeci Student");

        iza.registerMentorObserver(mentorPawel);
        jurand.registerMentorObserver(mentorNiePawel);
        trzeciStudent.registerMentorObserver(mentorPawel);

        //When
        iza.addTaskToVerify("Zadanie 1.1");
        iza.addTaskToVerify("Zadanie 1.2");
        jurand.addTaskToVerify("Zadanie 5.1");
        iza.addTaskToVerify("Zadanie 1.3");
        trzeciStudent.addTaskToVerify("Zadanie 2.1");
        trzeciStudent.addTaskToVerify("Zadanie 2.2");
        jurand.addTaskToVerify("Zadanie 5.2");
        iza.addTaskToVerify("Zadanie 1.3");


        //Then
        assertEquals(6, mentorPawel.getTaskCount());
        assertEquals(2, mentorNiePawel.getTaskCount());

    }
}