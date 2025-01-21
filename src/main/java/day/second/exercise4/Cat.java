package day.second.exercise4;


import java.util.concurrent.TimeUnit;

public class Cat extends Animal {

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public double goToWalk() {
        double timeWalk = this.getAge() * 0.25;
        try {
            TimeUnit.SECONDS.sleep((int)timeWalk);
        }  catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return timeWalk;
    }

    @Override
    public String toString(){

        return "Cat name = " + super.getName() + ", age = " + super.getAge();
    }

}
