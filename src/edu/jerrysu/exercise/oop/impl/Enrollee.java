package edu.jerrysu.exercise.oop.impl;

import java.util.Set;
import java.util.HashSet;

public class Enrollee {
    private final String name;
    private final Set<Course> courses;
    protected Enrollee(String name) {
        this.name = name;
        this.courses = new HashSet<>();
    }
    public String getName() {
        return this.name;
    }
    protected void addCourse(Course course) {
        this.courses.add(course);
    }
    protected void dropCourse(Course course) {
        this.courses.remove(course);
    }
    public boolean equals(Object other) {
        if (other == null) return false;
        if (!(other instanceof Enrollee)) return false;
        Enrollee asEnrollee = (Enrollee) other;
        return asEnrollee.getName().equals(this.getName());
    }
}
