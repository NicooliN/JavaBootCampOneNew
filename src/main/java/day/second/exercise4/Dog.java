package day.second.exercise4;


import java.util.concurrent.TimeUnit;

public class Dog extends Animal {

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public double goToWalk() {
        double timeWalk = this.getAge() * 0.5;
        try {
            TimeUnit.SECONDS.sleep((int)timeWalk);
        }  catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return timeWalk;
    }

    @Override
    public String toString(){

        return "Dog name = " + super.getName() + ", age = " + super.getAge();
    }

}
