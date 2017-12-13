package com.kodilla.testing.forum.statistics;

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

    public String calculateAvgStatistics(Statistics statistics){
        int userNumberDraft = statistics.userNames().size();
        if(userNumberDraft!= 0){
            usersNumber = (double) userNumberDraft;
            int postNumberDraft = statistics.postsCount();
            if(postNumberDraft!= 0) {
                postsNumber = (double) postNumberDraft;
                int commentsNumberDraft = statistics.commentsCount();
                commentsNumber = (double) commentsNumberDraft;
                avgPostPerUser = postsNumber / usersNumber;
                avgCommentPerUser = commentsNumber / usersNumber;
                avgCommentPerPost = commentsNumber / postsNumber;
                return null;
            }else{
                return "Brak postów na forum";
            }
        } else {
            return "Brak użytkowników na forum";
        }
    }

    public void ShowStatistics() {
        if(calculateAvgStatistics(statistics) != null){
            System.out.println(calculateAvgStatistics(statistics));
        }
        System.out.println("Liczba użytkowników: " + usersNumber);
        System.out.println("Liczba postów: " + postsNumber);
        System.out.println("Liczba komentarzy: " + commentsNumber);
        System.out.println("Średnia liczba postów na użytkownika: " + avgPostPerUser);
        System.out.println("Średnia liczba komentarzy na użytkownika: " + avgCommentPerUser);
        System.out.println("Średnia liczba komentarzy na post: " + avgCommentPerPost);
    }
}