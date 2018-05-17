package com.kodilla.testing.forum.statistics;

public class CalculateStatistics {
    Statistics statistics;
    private int numberOfUsers;
    private int numberOfPosts;
    private int numberOfComments;
    private double averagePostsPerUser;
    private double averageCommentsPerUser;
    private double averageCommentsPerPost;

    public CalculateStatistics (Statistics statistics) {
        this.statistics = statistics;
    }
    public double calculateAdvStatistics(Statistics statistics) {

        numberOfUsers = statistics.usersNames().size();
        numberOfPosts = statistics.postsCount();
        numberOfComments = statistics.commentsCount();
        if(numberOfUsers > 0) {
        averagePostsPerUser = numberOfPosts / (double) numberOfUsers;
        } else {
            averagePostsPerUser = 0;
        }
        if(numberOfUsers > 0) {
            averageCommentsPerUser = numberOfComments / (double) numberOfUsers;
        } else {
            averageCommentsPerUser = 0;
        }
        if(numberOfPosts > 0) {
            averageCommentsPerPost = numberOfComments / (double) numberOfPosts;
        } else {
            averageCommentsPerPost = 0;
        }
        return numberOfUsers + numberOfPosts + numberOfComments +
                averagePostsPerUser + averageCommentsPerUser + averageCommentsPerPost;
    }

    public void showStatistics() {
        System.out.println("Number of users: " + numberOfUsers);
        System.out.println("Number of posts: " + numberOfPosts);
        System.out.println("Number of comments: " + numberOfComments);
        System.out.println("Average posts per user: " + averagePostsPerUser);
        System.out.println("Average comments per user: " + averageCommentsPerUser);
        System.out.println("Average comments per post: " + averageCommentsPerPost);
    }

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }

    public double getAveragePostsPerUser() {
        return averagePostsPerUser;
    }

    public double getAverageCommentsPerUser() {
        return averageCommentsPerUser;
    }

    public double getAverageCommentsPerPost() {
        return averageCommentsPerPost;
    }
}
