package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int id;
    private final String username;
    private final char sex;
    private final LocalDate dateOfBirth;
    final private int postsNumber;

    public ForumUser(int id, String username, char sex, int yearOfBirth, int monthOfBirth, int dayOfBirth, int postsNumber) {
        this.id = id;
        this.username = username;
        this.sex = sex;
        this.dateOfBirth = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.postsNumber = postsNumber;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getPostsNumber() {
        return postsNumber;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", sex=" + sex +
                ", dateOfBirth=" + dateOfBirth +
                ", postsNumber=" + postsNumber +
                '}';
    }
}