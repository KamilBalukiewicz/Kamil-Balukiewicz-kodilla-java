package com.kodilla.spring.portfolio;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {
    @Test
    public void testTaskAdd() {
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //when
        board.toDoList.getTasks().add("task1");
        board.inProgressList.getTasks().add("task2");
        board.doneList.getTasks().add("task3");
        //then
        System.out.println(board.toDoList.getTasks().get(0) + "\n" +
                board.inProgressList.getTasks().get(0) + "\n" +
                board.doneList.getTasks().get(0));

    }
}
