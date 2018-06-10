package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class ProductOrderService implements OrderService {
    public boolean order(final User user, final LocalDateTime when) {
        System.out.println("Product ordered by " + user.getName() + " " + user.getSurname()
                + " on " + when.toString());
        return true;
    }
}
