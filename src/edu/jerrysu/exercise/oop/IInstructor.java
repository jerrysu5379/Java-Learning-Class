package edu.jerrysu.exercise.oop;

public interface IInstructor {
    void addHomework(String instructorName, String className, int year,
                     String homeworkName, String homeworkDescription);
    void assignGrade(String instructorName, String className, int year,
                     String homeworkName, String stuName, int grade);
    void homeWorkExists(String className, int year, String homeworkName);
    Integer getGrade(String className, int year, String homeworkName, String stuName);
}
