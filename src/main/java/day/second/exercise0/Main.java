package day.second.exercise0;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countAnimal = scanner.nextInt();
        List<Animal> animals = new ArrayList<>();
        for (int i = 0; i < countAnimal; i++) {
            String type = scanner.next();
            switch (type) {
                case "dog":
                    Animal dog = new Dog(scanner.next(), readInt(scanner));
                    if (dog.getAge() <= 0){
                        System.out.println("Incorrect input. Age <= 0");
                    } else {
                    animals.add(dog);
                    }
                    break;
                case "cat":
                    Animal cat;
                    cat = new Cat(scanner.next(), readInt(scanner));
                    if (cat.getAge() <= 0){
                        System.out.println("Incorrect input. Age <= 0");
                    } else {
                        animals.add(cat);
                    }
                    break;
                default:
                    System.out.println("Incorrect input. Unsupported pet type");
                    break;
            }
        }
        animals.forEach(animal -> {
            System.out.println(animal.toString());
        });
    }

    public static int readInt(Scanner scanner){
        int res = 0;
        while (true) {
            try {
                res = Integer.parseInt(scanner.next());
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Couldn't parse a number. Please, try again");
            }
        }
        return res;
    }
}
