package day.second.exercise1;

public class Cat extends Animal {

    public Cat(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    double getFeedInfoKg() {
        return getWeight() * 0.1;
    }

    @Override
    public String toString(){

        return "Cat name = " + super.getName() +
                ", age = " + super.getAge() +
                ", weight = " + super.getWeight() +
                ", feed = " + getFeedInfoKg();
    }

}
