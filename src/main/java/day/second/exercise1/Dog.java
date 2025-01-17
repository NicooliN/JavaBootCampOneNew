package day.second.exercise1;

public class Dog extends Animal {

    public Dog(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    public double getFeedInfoKg() {
        return getWeight() * 0.3;
    }

    @Override
    public String toString(){

        return "Dog name = " + super.getName() +
                ", age = " + super.getAge() +
                ", weight = " + super.getWeight() +
                ", feed = " + getFeedInfoKg();
    }

}
