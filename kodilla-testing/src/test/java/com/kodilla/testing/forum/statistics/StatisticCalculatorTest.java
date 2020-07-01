package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticCalculatorTest {

    private StatisticsCalculator testee = new StatisticsCalculator();

    @Test
    public void shouldCalculateAdvStatisticsWork() {
        //Given
        Statistics statistics = mock(Statistics.class);
        List<String> users = Arrays.asList("Zawada", "Kowalski", "Adamek");
        when(statistics.usersNames()).thenReturn(users);
        when(statistics.postsCount()).thenReturn(5);

        //When
        testee.calculateAdvStatistics(statistics);

        //Then
        Assert.assertEquals(3, testee.getUserCount());
    }

    @Test
    public void shouldCalculateAdvStatisticsWorkWhenPostCountEqualsZero() {
        //Given
        Statistics statistics = mock(Statistics.class);
        when(statistics.postsCount()).thenReturn(0);
        when(statistics.commentsCount()).thenReturn(5);

        //When
        testee.calculateAdvStatistics(statistics);

        //Then
        Assert.assertEquals(0, testee.getAverageCommentsCountPerPosts(),0.1);
    }

    @Test
    public void shouldCalculateAdvStatisticsWorkWhenPostCountEqualsThousand() {
        //Given
        Statistics statistics = mock(Statistics.class);
        List<String> users = Arrays.asList("Zawada", "Kowalski", "Adamek");
        when(statistics.usersNames()).thenReturn(users);
        when(statistics.postsCount()).thenReturn(1000);
        when(statistics.commentsCount()).thenReturn(2000);

        //When
        testee.calculateAdvStatistics(statistics);
        double expectedAverageCommentsCountPerPosts = 2000 / 1000.0;
        double expectedAverageCommentsCountPerUser = 2000 / 3.0;
        double expectedAveragePostCountPerUser = 1000 / 3.0;

        //Then
        Assert.assertEquals(expectedAverageCommentsCountPerPosts, testee.getAverageCommentsCountPerPosts(), 0.1);
        Assert.assertEquals(expectedAverageCommentsCountPerUser,testee.getAverageCommentsCountPerUser(), 0.1);
        Assert.assertEquals(expectedAveragePostCountPerUser,testee.getAveragePostCountPerUser(), 0.1);
    }

    @Test
    public void shouldCalculateAdvStatisticsWorkWhenCommentsCountEqualsZero() {
        //Given
        Statistics statistics = mock(Statistics.class);
        List<String> users = Arrays.asList("Zawada", "Kowalski", "Adamek");
        when(statistics.usersNames()).thenReturn(users);
        when(statistics.commentsCount()).thenReturn(0);
        when(statistics.postsCount()).thenReturn(5);

        //When
        testee.calculateAdvStatistics(statistics);

        //Then
        Assert.assertEquals(0, testee.getAverageCommentsCountPerPosts(),0.1);
        Assert.assertEquals(0, testee.getAverageCommentsCountPerUser(),0.1);
    }

    @Test
    public void shouldCalculateAdvStatisticsWorkWhenCommentsCountLessThanPostsCount() {
        //Given
        Statistics statistics = mock(Statistics.class);
        List<String> users = Arrays.asList("Zawada", "Kowalski", "Adamek");
        when(statistics.usersNames()).thenReturn(users);
        when(statistics.commentsCount()).thenReturn(3);
        when(statistics.postsCount()).thenReturn(7);

        //When
        testee.calculateAdvStatistics(statistics);
        double expectedAverageCommentsCountPerPosts = 3 / 7.0;

        //Then
        Assert.assertEquals(expectedAverageCommentsCountPerPosts, testee.getAverageCommentsCountPerPosts(), 0.1);
    }

    @Test
    public void shouldCalculateAdvStatisticsWorkWhenCommentsCountMoreThanPostsCount() {
        //Given
        Statistics statistics = mock(Statistics.class);
        List<String> users = Arrays.asList("Zawada", "Kowalski", "Adamek");
        when(statistics.usersNames()).thenReturn(users);
        when(statistics.commentsCount()).thenReturn(13);
        when(statistics.postsCount()).thenReturn(7);

        //When
        testee.calculateAdvStatistics(statistics);
        double expectedAverageCommentsCountPerPosts = 13 / 7.0;

        //Then
        Assert.assertEquals(expectedAverageCommentsCountPerPosts, testee.getAverageCommentsCountPerPosts(), 0.1);
    }

    @Test
    public void shouldCalculateAdvStatisticsWorkWhenUsersCountEqualsZero() {
        //Given
        Statistics statistics = mock(Statistics.class);
        List<String> users = Arrays.asList();
        when(statistics.usersNames()).thenReturn(users);
        when(statistics.commentsCount()).thenReturn(0);
        when(statistics.postsCount()).thenReturn(5);

        //When
        testee.calculateAdvStatistics(statistics);

        //Then
        Assert.assertEquals(0, testee.getAveragePostCountPerUser(),0.1);
        Assert.assertEquals(0, testee.getAverageCommentsCountPerUser(),0.1);
    }

    @Test
    public void shouldCalculateAdvStatisticsWorkWhenUsersCountEqualsHundred() {
        //Given
        Statistics statistics = mock(Statistics.class);
        List<String> users = new LinkedList<>();
        for (int i = 0; i<100; i++) {
            users.add("Kowalski");
        }
        when(statistics.usersNames()).thenReturn(users);
        when(statistics.postsCount()).thenReturn(100);
        when(statistics.commentsCount()).thenReturn(20);

        //When
        testee.calculateAdvStatistics(statistics);
        double expectedAverageCommentsCountPerUser = 20.0 / 100;
        double expectedAveragePostCountPerUser = 100.0 / 100;

        //Then
        Assert.assertEquals(expectedAveragePostCountPerUser, testee.getAveragePostCountPerUser(),0.1);
        Assert.assertEquals(expectedAverageCommentsCountPerUser, testee.getAverageCommentsCountPerUser(),0.1);
    }
}
