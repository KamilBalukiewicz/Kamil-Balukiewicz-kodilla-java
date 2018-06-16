package com.kodilla.patterns.factory.tasks;

import java.util.Random;

public final class ShoppingTask implements Task {
    final String taskName;
    final String whatToBuy;
    final double quantity;

    public ShoppingTask(final String taskName, final String whatToBuy, final double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public void executeTask() {
        System.out.println("Executing task: " + taskName + "\n" +
        "Shopping for " + quantity + " " + whatToBuy);
    }

    @Override
    public boolean isTaskExecuted() {
        Random randomGenerator = new Random();
        int a = randomGenerator.nextInt(10);
        boolean isExecuted = false;
        if (a > 2) {
            isExecuted = true;
        }
        return isExecuted;
    }
}
