package com.kodilla.spring.calculator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void testCalculations() {
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = (Calculator)context.getBean("calculator");
        //when
        calculator.add(5.5, 4.8);
        calculator.sub(15.15, 14.85);
        calculator.mul(2.5, 2.5);
        calculator.div(8.5, 0.25);
        //then
        //do nothing
    }
}
