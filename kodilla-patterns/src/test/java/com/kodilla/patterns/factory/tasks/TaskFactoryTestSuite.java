package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {

    @Test
    public void testFactoryShopping() {
        //given
        TaskFactory factory = new TaskFactory();

        //when
        Task shopping = factory.createTask(TaskFactory.SHOPPING);
        shopping.executeTask();

        //then
        Assert.assertEquals("Food shopping", shopping.getTaskName());
        //Assert.assertEquals(true, shopping.isTaskExecuted());
    }

    @Test
    public void testFactoryPainting() {
        //given
        TaskFactory factory = new TaskFactory();

        //when
        Task painting = factory.createTask(TaskFactory.PAINTING);
        painting.executeTask();

        //then
        Assert.assertEquals("Paint the house", painting.getTaskName());
    }

    @Test
    public void testFactoryDriving() {
        //given
        TaskFactory factory = new TaskFactory();

        //when
        Task driving = factory.createTask(TaskFactory.DRIVING);
        driving.executeTask();

        //then
        Assert.assertEquals("Driving Miss Daisy", driving.getTaskName());
    }

}
