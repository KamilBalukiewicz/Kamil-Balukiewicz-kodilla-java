package com.kodilla.patterns.factory.tasks;

import java.util.Random;

public final class DrivingTask implements Task {
    final String taskName;
    final String where;
    final String using;

    public DrivingTask(final String taskName, final String where, final String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public void executeTask() {
        System.out.println("Executing task " + taskName + "\n" +
        "Driving " + using + " to " + where);
    }

    @Override
    public boolean isTaskExecuted() {
        Random randomGenerator = new Random();
        int b = randomGenerator.nextInt(11);
        boolean isExecuted = false;
        if (b > 2) {
            isExecuted = true;
        }
        return isExecuted;
    }
}
