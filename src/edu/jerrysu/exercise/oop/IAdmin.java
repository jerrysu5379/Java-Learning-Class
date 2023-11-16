package edu.jerrysu.exercise.oop;

public interface IAdmin {
    void createClass(String className, int year, String instructorName, int capacity);
    void changeCapacity(String className, int year, int capacity);
    boolean classExists(String className, int year);
    int getClassCapacity(String className, int year);
}
