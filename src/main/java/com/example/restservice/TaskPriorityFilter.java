package com.example.restservice;

import com.fasterxml.jackson.annotation.JsonCreator;

import java.util.List;

public class TaskPriorityFilter {

    protected TaskPriority eq;
    protected TaskPriority gte;
    protected TaskPriority gt;
    protected TaskPriority lte;
    protected TaskPriority lt;
    protected List< TaskPriority > between;

    public TaskPriority getEq() {
        return eq;
    }

    public void setEq(TaskPriority eq) {
        this.eq = eq;
    }

    public TaskPriority getGte() {
        return gte;
    }

    public void setGte(TaskPriority gte) {
        this.gte = gte;
    }

    public TaskPriority getGt() {
        return gt;
    }

    public void setGt(TaskPriority gt) {
        this.gt = gt;
    }

    public TaskPriority getLte() {
        return lte;
    }

    public void setLte(TaskPriority lte) {
        this.lte = lte;
    }

    public TaskPriority getLt() {
        return lt;
    }

    public void setLt(TaskPriority lt) {
        this.lt = lt;
    }

    public List<TaskPriority> getBetween() {
        return between;
    }

    public void setBetween(List<TaskPriority> between) {
        this.between = between;
    }

    public TaskPriorityFilter() {
    }

    @JsonCreator
    public TaskPriorityFilter(TaskPriority eq) {
        this.eq = eq;
    }

    @Override
    public String toString() {
        return "TaskPriorityFilter{" +
                "eq=" + eq +
                ", gte=" + gte +
                ", gt=" + gt +
                ", lte=" + lte +
                ", lt=" + lt +
                ", between=" + between +
                '}';
    }
}
