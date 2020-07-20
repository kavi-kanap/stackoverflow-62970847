package com.example.restservice;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class StringToTaskPriorityConverter implements Converter<String, TaskPriority> {
    @Override
    public TaskPriority convert(String source) {

        System.out.println("StringToTaskPriorityConverter is called for " + source);
        if (source == null)
            return null;
        try {
            return TaskPriority.forValue(Integer.parseInt(source));
        } catch (Exception e) {
            return TaskPriority.forValue(source);
        }
    }
}
