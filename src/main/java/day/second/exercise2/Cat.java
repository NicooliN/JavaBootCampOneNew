package day.second.exercise2;



public class Cat extends Animal implements Omnivore{

    public Cat(String name, int age) {
        super(name, age);
    }



    @Override
    public String toString(){

        return "Cat name = " + super.getName() +
                ", age = " + super.getAge() +
                ". " + hunt();
    }

    @Override
    public String hunt() {
        return "I can hunt for mice";
    }
}
