package com.kishkan.epam.entity;

import java.time.LocalDate;
import java.util.Objects;

public class Task {
    private int id;
    private String name;
    private String taskDescription;
    private Employee executor;
    private String taskStatus;
    private LocalDate startDate;
    private LocalDate endDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public Employee getExecutor() {
        return executor;
    }

    public void setExecutor(Employee executor) {
        this.executor = executor;
    }

    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return id == task.id &&
                name.equals(task.name) &&
                Objects.equals(taskDescription, task.taskDescription) &&
                executor.equals(task.executor) &&
                taskStatus.equals(task.taskStatus) &&
                startDate.equals(task.startDate) &&
                Objects.equals(endDate, task.endDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, taskDescription, executor, taskStatus, startDate, endDate);
    }
}
