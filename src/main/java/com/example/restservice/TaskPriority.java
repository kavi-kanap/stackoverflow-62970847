package com.example.restservice;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.google.common.base.CaseFormat;

import java.util.stream.Stream;

public enum TaskPriority {
    High(75),
    Medium(50),
    Low(25)
    ;

    private final Integer order;

    TaskPriority(Integer order) {
        this.order = order;
    }

    public Integer getOrder() {
        return order;
    }

    @JsonCreator
    public static TaskPriority forValue(String value) {
        String to = CaseFormat.LOWER_HYPHEN.to(CaseFormat.UPPER_CAMEL, value);
        TaskPriority taskPriority = valueOf(to);
        System.out.println("TaskPriority created for value : " + value);
        return taskPriority;
    }

    @JsonCreator
    public static TaskPriority forValue(Integer order) {
        TaskPriority taskPriority = Stream.of(TaskPriority.values())
                .filter(c -> order.equals(c.getOrder()))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
        System.out.println("TaskPriority created for order : " + order);
        return taskPriority;
    }

    @JsonValue
    public String toValue() {
        return CaseFormat.UPPER_CAMEL.to(CaseFormat.LOWER_HYPHEN, name());
    }
}
