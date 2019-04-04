package edu.dmacc.codedsm;

import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

        Task task1 = new Task(1,"work","April 01 2019: 07:00 AM","April 01 2019: 3:30 PM","running",1,"work");
        List<Task> Tasks = new ArrayList<>();
        Tasks.add(task1);
        User user1 = new User("Pauline","Mum", Tasks,true);
        List<User> users = new ArrayList<>();
        users.add(user1);
        System.out.println(user1.toString());

    }
}