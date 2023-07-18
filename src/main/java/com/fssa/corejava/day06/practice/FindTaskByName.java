package com.fssa.corejava.day06.practice;

import java.util.ArrayList;

public class FindTaskByName {


    public boolean findTaskByName(String name, ArrayList<Task> tasks) {
        if (name == null || name.trim().isEmpty()) {
            return false;
        }
        String search = name;
        for (Task task : tasks) {
            if (search.equals(task.getTaskName())) {
                return true;
            }
        }
        return false;
    }
}
