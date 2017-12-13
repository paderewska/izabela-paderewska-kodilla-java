package com.kodilla.testing.forum.statistics;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

public class StatisticCountTest {
    @Before
    public void before(){
        System.out.println("--Start testu--");
    }

    @After
    public void after() {
        System.out.println("--Koniec testu--\n");
    }

    @Test
    public void testCalculateAdvStatistic01(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> testUserNames = new ArrayList<String>();
        for(int n=0; n<100; n++) {
            testUserNames.add("Kasia");
        }
        when(statisticsMock.userNames()).thenReturn(testUserNames);

        int testPostNumber = 0;
        when(statisticsMock.postsCount()).thenReturn(testPostNumber);

        int testCommentNumber = 400;
        when(statisticsMock.commentsCount()).thenReturn(testCommentNumber);

        StatisticCount statisticCount = new StatisticCount(statisticsMock);

        //When
       statisticCount.calculateAvgStatistics(statisticsMock);
       double postPerUser = statisticCount.getAvgPostPerUser();
       double commentPerUser = statisticCount.getAvgCommentPerUser();
       double commentPerPost = statisticCount.getAvgCommentPerPost();

       System.out.println("WARUNEK: Gdy liczba postów = 0");
       statisticCount.ShowStatistics();

        //Then
        Assert.assertEquals(0.0, postPerUser, 0);
        Assert.assertEquals(4.0, commentPerUser, 0);
        Assert.assertEquals(0.0, commentPerPost, 0);
    }

    @Test
    public void testCalculateAdvStatistic02(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> testUserNames = new ArrayList<String>();
        for(int n=0; n<100; n++) {
            testUserNames.add("Kasia");
        }
        when(statisticsMock.userNames()).thenReturn(testUserNames);

        int testPostNumber = 1000;
        when(statisticsMock.postsCount()).thenReturn(testPostNumber);

        int testCommentNumber = 400;
        when(statisticsMock.commentsCount()).thenReturn(testCommentNumber);

        StatisticCount statisticCount = new StatisticCount(statisticsMock);

        //When
        statisticCount.calculateAvgStatistics(statisticsMock);
        double postPerUser = statisticCount.getAvgPostPerUser();
        double commentPerUser = statisticCount.getAvgCommentPerUser();
        double commentPerPost = statisticCount.getAvgCommentPerPost();

        System.out.println("WARUNEK: Gdy liczba postów = 1000");
        statisticCount.ShowStatistics();

        //Then
        Assert.assertEquals(10.0, postPerUser, 0);
        Assert.assertEquals(4.0, commentPerUser, 0);
        Assert.assertEquals(0.4, commentPerPost, 0);
    }

    @Test
    public void testCalculateAdvStatistic03(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> testUserNames = new ArrayList<String>();
        for(int n=0; n<100; n++) {
            testUserNames.add("Kasia");
        }
        when(statisticsMock.userNames()).thenReturn(testUserNames);

        int testPostNumber = 1000;
        when(statisticsMock.postsCount()).thenReturn(testPostNumber);

        int testCommentNumber = 0;
        when(statisticsMock.commentsCount()).thenReturn(testCommentNumber);

        StatisticCount statisticCount = new StatisticCount(statisticsMock);

        //When
        statisticCount.calculateAvgStatistics(statisticsMock);
        double postPerUser = statisticCount.getAvgPostPerUser();
        double commentPerUser = statisticCount.getAvgCommentPerUser();
        double commentPerPost = statisticCount.getAvgCommentPerPost();

        System.out.println("WARUNEK: Gdy liczba komentarzy = 0");
        statisticCount.ShowStatistics();

        //Then
        Assert.assertEquals(10.0, postPerUser, 0);
        Assert.assertEquals(0.0, commentPerUser, 0);
        Assert.assertEquals(0.0, commentPerPost, 0);
    }

    @Test
    public void testCalculateAdvStatistic04(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> testUserNames = new ArrayList<String>();
        for(int n=0; n<100; n++) {
            testUserNames.add("Kasia");
        }
        when(statisticsMock.userNames()).thenReturn(testUserNames);

        int testPostNumber = 1000;
        when(statisticsMock.postsCount()).thenReturn(testPostNumber);

        int testCommentNumber = 200;
        when(statisticsMock.commentsCount()).thenReturn(testCommentNumber);

        StatisticCount statisticCount = new StatisticCount(statisticsMock);

        //When
        statisticCount.calculateAvgStatistics(statisticsMock);
        double postPerUser = statisticCount.getAvgPostPerUser();
        double commentPerUser = statisticCount.getAvgCommentPerUser();
        double commentPerPost = statisticCount.getAvgCommentPerPost();

        System.out.println("WARUNEK: Gdy liczba komentarzy < liczba postów");
        statisticCount.ShowStatistics();

        //Then
        Assert.assertEquals(10.0, postPerUser, 0);
        Assert.assertEquals(2.0, commentPerUser, 0);
        Assert.assertEquals(0.2, commentPerPost, 0);
    }

    @Test
    public void testCalculateAdvStatistic05(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> testUserNames = new ArrayList<String>();
        for(int n=0; n<100; n++) {
            testUserNames.add("Kasia");
        }
        when(statisticsMock.userNames()).thenReturn(testUserNames);

        int testPostNumber = 1000;
        when(statisticsMock.postsCount()).thenReturn(testPostNumber);

        int testCommentNumber = 2000;
        when(statisticsMock.commentsCount()).thenReturn(testCommentNumber);

        StatisticCount statisticCount = new StatisticCount(statisticsMock);

        //When
        statisticCount.calculateAvgStatistics(statisticsMock);
        double postPerUser = statisticCount.getAvgPostPerUser();
        double commentPerUser = statisticCount.getAvgCommentPerUser();
        double commentPerPost = statisticCount.getAvgCommentPerPost();

        System.out.println("WARUNEK: Gdy liczba komentarzy > liczba postów");
        statisticCount.ShowStatistics();

        //Then
        Assert.assertEquals(10.0, postPerUser, 0);
        Assert.assertEquals(20.0, commentPerUser, 0);
        Assert.assertEquals(2.0, commentPerPost, 0);
    }

    @Test
    public void testCalculateAdvStatistic06(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> testUserNames = new ArrayList<String>();

        when(statisticsMock.userNames()).thenReturn(testUserNames);

        int testPostNumber = 1000;
        when(statisticsMock.postsCount()).thenReturn(testPostNumber);

        int testCommentNumber = 2000;
        when(statisticsMock.commentsCount()).thenReturn(testCommentNumber);

        StatisticCount statisticCount = new StatisticCount(statisticsMock);

        //When
        statisticCount.calculateAvgStatistics(statisticsMock);
        double postPerUser = statisticCount.getAvgPostPerUser();
        double commentPerUser = statisticCount.getAvgCommentPerUser();
        double commentPerPost = statisticCount.getAvgCommentPerPost();

        System.out.println("WARUNEK: Gdy liczba użytkowników = 0");
        statisticCount.ShowStatistics();

        //Then
        Assert.assertEquals(0.0, postPerUser, 0);
        Assert.assertEquals(0.0, commentPerUser, 0);
        Assert.assertEquals(2.0, commentPerPost, 0);
    }

    @Test
    public void testCalculateAdvStatistic07(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> testUserNames = new ArrayList<String>();
        for(int n=0; n<100; n++) {
            testUserNames.add("Kasia");
        }
        when(statisticsMock.userNames()).thenReturn(testUserNames);

        int testPostNumber = 1000;
        when(statisticsMock.postsCount()).thenReturn(testPostNumber);

        int testCommentNumber = 2000;
        when(statisticsMock.commentsCount()).thenReturn(testCommentNumber);

        StatisticCount statisticCount = new StatisticCount(statisticsMock);

        //When
        statisticCount.calculateAvgStatistics(statisticsMock);
        double postPerUser = statisticCount.getAvgPostPerUser();
        double commentPerUser = statisticCount.getAvgCommentPerUser();
        double commentPerPost = statisticCount.getAvgCommentPerPost();

        System.out.println("WARUNEK: Gdy liczba użytkowników = 100");
        statisticCount.ShowStatistics();

        //Then
        Assert.assertEquals(10.0, postPerUser, 0);
        Assert.assertEquals(20.0, commentPerUser, 0);
        Assert.assertEquals(2.0, commentPerPost, 0);
    }
}
