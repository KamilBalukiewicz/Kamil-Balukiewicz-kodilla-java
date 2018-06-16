package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publisher.TwitterPublisher;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {
        //given
        User dominik = new Millenials("Dominik Smith");
        User joe = new YGeneration("Joe Doe");
        User brian = new ZGeneration("Brian Kowalski");

        //when
        String dominikWillUse = dominik.sharePost();
        System.out.println("Dominik will: " + dominikWillUse);
        String joeWillUse = joe.sharePost();
        System.out.println("Joe will: " + joeWillUse);
        String brianWillUse = brian.sharePost();
        System.out.println("Brian will: " + brianWillUse);

        //then
        Assert.assertEquals("[Facebook publisher] Publish on Facebook", dominikWillUse);
        Assert.assertEquals("[Twitter publisher] Publish on Twitter", joeWillUse);
        Assert.assertEquals("[Snapchat publisher] Publish on Snapchat", brianWillUse);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //given
        User janusz = new Millenials("Janusz Ball");

        //when
        String januszWillUse = janusz.sharePost();
        System.out.println("Janusz will: " + januszWillUse);
        janusz.setSocialMedium(new TwitterPublisher());
        januszWillUse = janusz.sharePost();
        System.out.println("Janusz now will: " + januszWillUse);

        //then
        Assert.assertEquals("[Twitter publisher] Publish on Twitter", januszWillUse);
    }
}
