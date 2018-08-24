package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HomeworkQueueTestSuite {
    @Test
    public void testUpdate() {

        //given
        Mentor johnSmith = new Mentor("John Smith");
        Mentor janKowalski = new Mentor("Jan Kowalski");
        HomeworkQueue johnDoe = new HomeworkQueue(" John Doe");
        HomeworkQueue janeCornwell = new HomeworkQueue("Jane Cornwell");
        HomeworkQueue anthonyJohnson = new HomeworkQueue("Anthony Johnson");
        HomeworkQueue emilyRichards = new HomeworkQueue("Emily Richards");
        johnDoe.registerObserver(johnSmith);
        janeCornwell.registerObserver(johnSmith);
        anthonyJohnson.registerObserver(janKowalski);
        emilyRichards.registerObserver(janKowalski);

        //when
        johnDoe.addTask("Facade Pattern");
        johnDoe.addTask("AOP");
        janeCornwell.addTask("Observer Patter");
        anthonyJohnson.addTask("Facade Pattern");
        anthonyJohnson.addTask("Observer Pattern");
        emilyRichards.addTask("Decorator Pattern");
        emilyRichards.addTask("Builder Pattern");

        //then
        assertEquals(3, johnSmith.getUpdateCount());
        assertEquals(4, janKowalski.getUpdateCount());
    }
}
