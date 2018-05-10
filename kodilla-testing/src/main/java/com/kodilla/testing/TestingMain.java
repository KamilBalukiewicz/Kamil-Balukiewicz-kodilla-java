package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test ok");
        } else {
            System.out.println("Error");
        }

        Calculator calculatorAdd = new Calculator();
        int sum = calculatorAdd.add(12, 7);

        if (sum==19) {
            System.out.println("adding test passed");
        } else {
            System.out.println("adding test failed");
        }

        Calculator calculatorSubtract = new Calculator();
        int difference = calculatorSubtract.subtract(12, 7);

        if (difference==5) {
            System.out.println("subtraction test passed");
        } else {
            System.out.println("subtraction test failed");
        }

    }
}
