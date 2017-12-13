package com.kodilla.testing.forum.statistics;

import com.sun.org.glassfish.external.statistics.Statistic;

public class StatisticCount {

    Statistics statistics;

    public StatisticCount(Statistics statistics){
        this.statistics = statistics;
    }

    private double usersNumber = 0.0;
    private double postsNumber = 0.0;
    private double commentsNumber = 0;
    private double avgPostPerUser = 0.0;
    private double avgCommentPerUser = 0.0;
    private double avgCommentPerPost = 0.0;

    public double getUsersNumber() {
        return usersNumber;
    }

    public double getPostsNumber() {
        return postsNumber;
    }

    public double getCommentsNumber() {
        return commentsNumber;
    }

    public double getAvgPostPerUser() {
        return avgPostPerUser;
    }

    public double getAvgCommentPerUser() {
        return avgCommentPerUser;
    }

    public double getAvgCommentPerPost() {
        return avgCommentPerPost;
    }

    public void calculateAvgStatistics(Statistics statistics){
        int userNumberDraft = statistics.userNames().size();
        usersNumber = (double)userNumberDraft;
        int postNumberDraft = statistics.postsCount();
        postsNumber = (double)postNumberDraft;
        int commentsNumberDraft = statistics.commentsCount();
        commentsNumber = (double)commentsNumberDraft;
        avgPostPerUser = postsNumber / usersNumber;
        avgCommentPerUser = commentsNumber / usersNumber;
        avgCommentPerPost = commentsNumber / postsNumber;
    }


    public void ShowStatistics() {
        System.out.println("Liczba użytkownikóow: " + usersNumber);
        System.out.println("Liczba postów: " + postsNumber);
        System.out.println("Liczba komentarzy: " + commentsNumber);
        System.out.println("Średnia liczba postów na użytkownika: " + avgPostPerUser);
        System.out.println("Średnia liczba komentarzy na użytkownika: " + avgCommentPerUser);
        System.out.println("Średnia liczba komentarzy na post: " + avgCommentPerPost);
    }
}