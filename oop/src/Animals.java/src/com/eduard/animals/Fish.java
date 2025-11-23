package com.eduard.animals;

public class Fish extends Animal {
    public Fish(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " молчит, но пускает пузыри.");
    }
}

