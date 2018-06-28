package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;
    private static final String DESCRIPTION = "Test 2: Learn Hibernate";

    @Test
    public void testFindByListName() {

        //given
        TaskList taskList = new TaskList("toDo", DESCRIPTION);
        taskListDao.save(taskList);
        String listName = taskList.getListName();

        //when
        List<TaskList> readList = taskListDao.findByListName(listName);

        //then
        Assert.assertEquals(1, readList.size());

        //clean up
        int id = readList.get(0).getId();
        taskListDao.delete(id);

    }
}
