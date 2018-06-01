package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {

        User user = new User("Joe", "Doe");

        LocalDateTime when = LocalDateTime.of(2018, 6, 1, 11, 11);

        return new OrderRequest(user, when);
    }
}
