package com.kodilla.testing.collection;

import java.util.*;

public class OddNumbersExterminator {

    ArrayList<Integer> evenNumbers;

    public OddNumbersExterminator() {
        evenNumbers = new ArrayList<Integer>();
    }

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
        for (int number : numbers) {
            if ((number % 2) == 0) {
                evenNumbers.add(number);
            }
        }
        System.out.println("Not odd numbers (" + evenNumbers.size() + "): " + evenNumbers);
        return evenNumbers;
    }
}
