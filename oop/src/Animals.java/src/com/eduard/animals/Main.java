package com.eduard.animals;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("Шарик", 3);
        Animal cat = new Cat("Мурка", 2);
        Animal bird = new Bird("Кеша", 1);
        Animal fish = new Fish("Золотая рыбка", 1);
        Animal horse = new Horse("Буян", 5);

        dog.makeSound();
        cat.makeSound();
        bird.makeSound();
        fish.makeSound();
        horse.makeSound();

        dog.eat();
        cat.sleep();
    }
}

