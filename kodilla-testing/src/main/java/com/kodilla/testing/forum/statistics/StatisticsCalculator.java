package com.kodilla.testing.forum.statistics;

public class StatisticsCalculator {

    private int userCount;
    private int postsCount;
    private int commentsCount;
    private double averagePostCountPerUser;
    private double averageCommentsCountPerUser;
    private double averageCommentsCountPerPosts;

    public void calculateAdvStatistics(Statistics statistics) {

        userCount = statistics.usersNames().size();
        postsCount = statistics.postsCount();
        commentsCount = statistics.commentsCount();
        if (userCount != 0) {
            averagePostCountPerUser = postsCount / (double)userCount;
            averageCommentsCountPerUser = commentsCount / (double)userCount;
        }
        if (postsCount != 0) {
            averageCommentsCountPerPosts = commentsCount / (double)postsCount;
        }
    }

    public int getUserCount() {
        return userCount;
    }

    public int getPostCount() {
        return postsCount;
    }

    public int getCommentsCount() {
        return commentsCount;
    }

    public double getAveragePostCountPerUser() {
        return averagePostCountPerUser;
    }

    public double getAverageCommentsCountPerUser() {
        return averageCommentsCountPerUser;
    }

    public double getAverageCommentsCountPerPosts() {
        return averageCommentsCountPerPosts;
    }
}
