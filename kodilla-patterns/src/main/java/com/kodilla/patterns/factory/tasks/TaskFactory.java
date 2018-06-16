package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task createTask(final String taskClass) {
        switch(taskClass) {
            case SHOPPING:
                return new ShoppingTask("Food shopping", "Potatoes", 20.0);
            case PAINTING:
                return new PaintingTask("Paint the house", "pink", "wall");
            case DRIVING:
                return new DrivingTask("Driving Miss Daisy", "London", "Lincoln");
            default:
                return null;
        }
    }
}
