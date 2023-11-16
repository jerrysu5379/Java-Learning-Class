package edu.jerrysu.exercise.oop.impl;

import edu.jerrysu.exercise.oop.IStudent;

public class Student implements IStudent {
    private String stuName;
    private String className;
    private int year;
    private String homeworkName;
    private String answer;

    public Student(String stuName, String className, int year, String homeworkName, String answer) {
        this.stuName = stuName;
        this.className = className;
        this.year = year;
        this.homeworkName = homeworkName;
        this.answer = answer;
    }

    @Override
    public void registerForClass(String stuName, String className, int year) {
        System.out.println("Student " + stuName + " registers for class " + className + " in year " + year);
    }

    @Override
    public void dropClass(String stuName, String className, int year) {
        System.out.println("Student " + stuName + " drops class " + className + " in year " + year);
    }

    @Override
    public void submitHomework(String stuName, String homeworkName, String answer, String className, int year) {
        System.out.println("Student " + stuName + " submits homework " + homeworkName + " with answer " + answer + " for class " + className + " in year " + year);
    }
}
