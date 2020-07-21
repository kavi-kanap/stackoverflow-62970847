package com.example.restservice;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class StringToTaskPriorityFilterConverter implements
        Converter<String, TaskPriorityFilter> {
    @Override
    public TaskPriorityFilter convert(String source) {

        System.out.println("StringToTaskPriorityFilterConverter is called for " + source);
        if (source == null)
            return null;
        try {
            return new
                    TaskPriorityFilter(TaskPriority.forValue(Integer.parseInt(source)));
        } catch (Exception e) {
            return new TaskPriorityFilter(TaskPriority.forValue(source));
        }
    }
}
