package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> userList = new ArrayList<>();

    public Forum() {
        userList.add(new ForumUser(0001, "Andy Johnson", 'M',
                LocalDate.of(1988, 1, 01), 50));
        userList.add(new ForumUser(0002, "Madelyn Carson", 'F',
                LocalDate.of(1983, 2, 03), 43));
        userList.add(new ForumUser(0003, "Ryan Talley", 'M',
                LocalDate.of(1985, 12, 11), 5));
        userList.add(new ForumUser(0004, "Giancarlo Guerrero", 'M',
                LocalDate.of(2001, 11, 05), 13));
        userList.add(new ForumUser(0005, "Joe Evans", 'M',
                LocalDate.of(1995, 10, 14), 0));
        userList.add(new ForumUser(0006, "Phoebe Pearson", 'F',
                LocalDate.of(2002, 6, 8), 435));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(userList);
    }
}
