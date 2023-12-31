package edu.jerrysu.exercise.oop.impl;

import java.util.Map;
import java.util.HashMap;

public class Homework {
    private final String name;
    private final String description;
    private final Map<Enrollee, String> studentSubmissions;
    private final Map<Enrollee,Integer> studentGrades;
    protected Homework(String name, String description) {
        this.name = name;
        this.description = description;
        this.studentSubmissions = new HashMap<>();
        this.studentGrades = new HashMap<>();
    }
    public String getName() {
        return this.name;
    }
    protected void submit(Enrollee enrollee, String solution) {
        this.studentSubmissions.put(enrollee, solution);
    }
    protected void gradeStudent(Enrollee enrollee, int grade) {
        this.studentGrades.put(enrollee, grade);
    }
    protected String getSubmission(Enrollee enrollee) {
        return this.studentSubmissions.get(enrollee);
    }
    protected Integer getGrade(Enrollee enrollee) {
        return this.studentGrades.get(enrollee);
    }
    public boolean equals(Object other) {
        if (other == null) return false;
        if (!(other instanceof Homework)) return false;
        Homework asHomework = (Homework) other;
        return asHomework.getName().equals(this.getName());
    }
}
