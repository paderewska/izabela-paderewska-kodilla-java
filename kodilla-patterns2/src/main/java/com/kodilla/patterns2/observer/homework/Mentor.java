package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {

    private final String mentorName;
    private int taskCount;

    public Mentor(String mentorName) {
        this.mentorName = mentorName;
    }

    @Override
    public void update(Student student) {
        System.out.println(mentorName + ", you have new Task to from " + student.getStudentName() + ". "
                + "You have already " + student.getTaskList().size() + " message/messages from " + student.getStudentName());
        taskCount++;
    }

    public String getMentorName() {
        return mentorName;
    }

    public int getTaskCount() {
        return taskCount;
    }
}
