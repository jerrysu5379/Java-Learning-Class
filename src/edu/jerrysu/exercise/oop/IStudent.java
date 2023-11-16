package edu.jerrysu.exercise.oop;

public interface IStudent {
    void registerForClass(String stuName, String className, int year);
    void dropClass(String stuName, String className, int year);
    void submitHomework(String stuName, String homeworkName,
                        String answer, String className, int year);
}
