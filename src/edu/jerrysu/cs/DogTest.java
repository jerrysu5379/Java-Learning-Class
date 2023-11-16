package edu.jerrysu.cs;

public class DogTest {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setSize(50);
        System.out.println("Dog size is " + dog.getSize());
        dog.bark();
    }
}
