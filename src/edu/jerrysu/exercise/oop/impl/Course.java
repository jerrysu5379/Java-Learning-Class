package edu.jerrysu.exercise.oop.impl;

import java.util.Set;

public class Course {
    private final String name;
    private final int year;
    private int capacity;
    private Set<Homework> homeworks;
    protected Set<Enrollee> enrollees;
    protected Course(String name, int year) {
        this(name, year, 0);
    }
    protected Course(String name, int year, int capacity) {
        this.name = name;
        this.year = year;
        this.capacity = capacity;
    }
}
