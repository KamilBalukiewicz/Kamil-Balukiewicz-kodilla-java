package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {
    private final String name;
    private int updateCount;

    public Mentor(String name) {
        this.name = name;
    }

    @Override
    public void update(HomeworkQueue homeworkQueue) {
        System.out.println(name + ": New task solution from " + homeworkQueue.getStudentName() +
                "\n" + " Total number of tasks: " + homeworkQueue.getTasks().size());
        updateCount++;
    }

    public String getName() { return name; }

    public int getUpdateCount() { return updateCount; }
}
