package com.eduard.animals;

public class Horse extends Animal {
    public Horse(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " ржёт: И-го-го!");
    }
}

