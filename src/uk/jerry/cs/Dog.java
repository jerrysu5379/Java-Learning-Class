package uk.jerry.cs;

public class Dog {
    private int size;
    private String breed;
    private String name;

    void bark() {
        System.out.println("Ruff! Ruff!");
    }
    void setSize(int size) {
        this.size = size;
    }
    int getSize() {
        return size;
    }
}