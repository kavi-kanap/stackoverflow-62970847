package com.example.restservice;


public class TaskFilter {
    protected TaskPriorityFilter priority;

    public TaskFilter() {
        System.out.println("Task filter created with empty constructor");
    }

    public TaskPriorityFilter getPriority() {
        return priority;
    }

    public void setPriority(TaskPriorityFilter priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "TaskFilter{" +
                "priority=" + priority +
                '}';
    }
}
