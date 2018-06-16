package com.kodilla.patterns.factory.tasks;

import java.util.Random;

public final class PaintingTask implements Task {
     final String taskName;
     final String colour;
     final String whatToPaint;

    public PaintingTask(final String taskName, final String colour, final String whatToPaint) {
        this.taskName = taskName;
        this.colour = colour;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public void executeTask() {
        System.out.println("Executing task " + taskName + "\n" +
                "Painting " + whatToPaint + " " + colour);
    }

    @Override
    public boolean isTaskExecuted() {
        Random randomGenerator = new Random();
        int a = randomGenerator.nextInt(10);
        boolean isExecuted = false;
        if (a > 3) {
            isExecuted = true;
        }
        return isExecuted;
    }
}
