package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;
import java.math.BigDecimal;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity() {
        //given
        World world = new World();
        Country poland = new Country("Poland", new BigDecimal("40000000"));
        Country germany = new Country("Germany", new BigDecimal("60000000"));
        Country france = new Country("France", new BigDecimal("80000000"));
        Country rsa = new Country("Republic of South Africa", new BigDecimal("45000000"));
        Country egypt = new Country("Egypt", new BigDecimal("12000000"));
        Country ghana = new Country("Ghana", new BigDecimal("100000000"));
        Country china = new Country("China", new BigDecimal("2000000000"));
        Country india = new Country("India", new BigDecimal("1500000000"));
        Country japan = new Country("Japan", new BigDecimal("115000000"));
        Continent europe = new Continent("Europe");
        Continent africa = new Continent("Africa");
        Continent asia = new Continent("Asia");

        //when
        world.addContinent(europe);
        world.addContinent(africa);
        world.addContinent(asia);

        europe.addCountry(poland);
        europe.addCountry(germany);
        europe.addCountry(france);
        africa.addCountry(rsa);
        africa.addCountry(ghana);
        africa.addCountry(egypt);
        asia.addCountry(china);
        asia.addCountry(india);
        asia.addCountry(japan);

        //then
        BigDecimal expectedPeopleQuantity = new BigDecimal("3952000000");
        Assert.assertEquals(expectedPeopleQuantity, world.getPeopleQuantity());
    }
}
