package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmacBuilder() {
        //given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun(new Bun(Bun.PLAIN))
                .burgers(2)
                .sauce(new Sauce(Sauce.BARBECUE))
                .ingredient(new Ingredient(Ingredient.CHEESE))
                .ingredient(new Ingredient(Ingredient.LETTUCE))
                .ingredient(new Ingredient(Ingredient.BACON))
                .ingredient(new Ingredient(Ingredient.ONION))
                .ingredient(new Ingredient(Ingredient.PICKLE))
                .build();
        System.out.println(bigmac);
        //when
        int howManyIngredients = bigmac.getIngredients().size();

        //then
        Assert.assertEquals(5, howManyIngredients);
        Assert.assertEquals("BARBECUE", bigmac.getSauce().getSauceType());
        Assert.assertEquals(2, bigmac.getBurgers());
        Assert.assertEquals("PLAIN", bigmac.getBun().getBunType());
        Assert.assertEquals("ONION", bigmac.getIngredients().get(3).toString());
        Assert.assertNotEquals("CHILLIES", bigmac.getIngredients());
    }
}