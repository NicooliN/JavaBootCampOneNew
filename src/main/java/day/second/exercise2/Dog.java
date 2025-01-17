package day.second.exercise2;

import day.second.exercise2.Animal;

public class Dog extends Animal implements Omnivore {

    public Dog(String name, int age) {
        super(name, age);
    }


    @Override
    public String toString(){

        return "Dog name = " + super.getName() +
                ", age = " + super.getAge() +
               ". " + hunt();
    }

    @Override
    public String hunt() {
        return "I can hunt for robbers";
    }
}
