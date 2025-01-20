package day.second.exercise3;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countAnimal = scanner.nextInt();
        List<Animal> animals = Animal.createAnimalList(countAnimal, scanner);
        animals.stream().forEach(System.out::println);
    }
}
