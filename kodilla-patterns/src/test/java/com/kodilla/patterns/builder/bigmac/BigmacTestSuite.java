package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmacBuilder() {
        //given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("plain")
                .burgers(2)
                .sauce("barbecue")
                .ingredient("cheese")
                .ingredient("lettuce")
                .ingredient("bacon")
                .ingredient("onion")
                .ingredient("pickle")
                .build();
        System.out.println(bigmac);
        //when
        int howManyIngredients = bigmac.getIngredients().size();

        //then
        Assert.assertEquals(5, howManyIngredients);
        Assert.assertEquals("barbecue", bigmac.getSauce());
        Assert.assertEquals(2, bigmac.getBurgers());
        Assert.assertEquals("plain", bigmac.getBun());
        Assert.assertNotEquals("chillies", bigmac.getIngredients());
    }
}
