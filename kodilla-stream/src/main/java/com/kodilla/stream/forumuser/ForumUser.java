package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    private final int userid;
    private final String userName;
    private final char sex;
    private final LocalDate birthDate;
    private final int postsPublished;

    public ForumUser(final int userid, final String userName, final char sex, final LocalDate birthDate,
                     final int postsPublished) {
        this.userid = userid;
        this.userName = userName;
        this.sex = sex;
        this.birthDate = birthDate;
        this.postsPublished = postsPublished;
    }

    public int getUserid() {
        return userid;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getPostsPublished() {
        return postsPublished;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userid=" + userid +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", birthDate=" + birthDate +
                ", postsPublished=" + postsPublished +
                '}';
    }
}
