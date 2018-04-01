package com.kodilla.patterns2.observer.homework;

public interface Observable {

    void registerMentorObserver(Observer observer);
    void notifyMentorObserver();
    void removeMentorObserver(Observer observer);
}
