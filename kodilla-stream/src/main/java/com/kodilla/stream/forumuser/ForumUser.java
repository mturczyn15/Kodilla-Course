package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.Objects;

public class ForumUser {

    private final int userIdentifier;
    private final String userName;
    private final char gender;
    private final LocalDate birthDate;
    private final int publishedPosts;

    public ForumUser(int userIdentifier, String userName, char gender, int publishedPosts, LocalDate localDate) {
        this.userIdentifier = userIdentifier;
        this.userName = userName;
        this.gender = gender;
        this.publishedPosts = publishedPosts;
        this.birthDate = localDate;
    }

    public int getUserIdentifier() {
        return userIdentifier;
    }

    public String getUserName() {
        return userName;
    }

    public char getGender() {
        return gender;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getPublishedPosts() {
        return publishedPosts;
    }

    @Override
    public String toString() {
        return String.format("Forum user: %s, gender: %c, date of birth: %s, posts: %d.", userName, gender, birthDate.toString(), publishedPosts);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ForumUser)) return false;
        ForumUser forumUser = (ForumUser) o;
        return getUserIdentifier() == forumUser.getUserIdentifier() &&
                getGender() == forumUser.getGender() &&
                getPublishedPosts() == forumUser.getPublishedPosts() &&
                Objects.equals(getUserName(), forumUser.getUserName()) &&
                Objects.equals(getBirthDate(), forumUser.getBirthDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUserIdentifier(), getUserName(), getGender(), getBirthDate(), getPublishedPosts());
    }

    public LocalDate getDateOfBirth() {
        return birthDate;
    }
}
