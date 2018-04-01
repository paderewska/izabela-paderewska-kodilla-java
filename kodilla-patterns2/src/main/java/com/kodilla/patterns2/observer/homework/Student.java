package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class Student implements Observable {

    private final List<Observer> mentorList;
    private final List<String> taskList;
    private String studentName;

    public Student(String studentName) {
        mentorList = new ArrayList<>();
        taskList = new ArrayList<>();
        this.studentName = studentName;
    }

    public void addTaskToVerify (String task) {
        taskList.add(task);
        notifyMentorObserver();
    }
    @Override
    public void registerMentorObserver(Observer observer) {
        mentorList.add(observer);
    }

    @Override
    public void notifyMentorObserver() {
        for(Observer observer : mentorList) {
            observer.update(this);
        }
    }

    @Override
    public void removeMentorObserver(Observer observer) {
        mentorList.remove(observer);
    }

    public List<String> getTaskList() {
        return taskList;
    }

    public String getStudentName() {
        return studentName;
    }
}
