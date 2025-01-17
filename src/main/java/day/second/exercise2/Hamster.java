package day.second.exercise2;



public class Hamster extends Animal implements Herbivore{

    public Hamster(String name, int age) {
        super(name, age);
    }



    @Override
    public String toString(){

        return "Cat name = " + super.getName() +
                ", age = " + super.getAge() +
                ". " + chill();
    }

    @Override
    public String chill() {
        return "I can chill for 8 hours";
    }
}
