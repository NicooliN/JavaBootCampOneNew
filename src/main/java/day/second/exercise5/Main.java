package day.second.exercise5;

import day.second.exercise4.Animal;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        long initialTime = System.nanoTime();
        Scanner scanner = new Scanner(System.in);
        int countAnimal = scanner.nextInt();
        List<day.second.exercise4.Animal> animals = day.second.exercise4.Animal.createAnimalList(countAnimal, scanner);


        Thread[] threads = new Thread[animals.size()];
        for (int i = 0; i < animals.size(); i++) {
            Animal animal = animals.get(i);
            threads[i] = new Thread(() -> {
                try {
                    double startTime = TimeUnit.NANOSECONDS.toSeconds(System.nanoTime() - initialTime);
                    double timeWalked = animal.goToWalk();
                    double finishTime = startTime + timeWalked;
                    System.out.print(animal.toString());
                    System.out.printf(", start time = %.8f end time = %.2f\n",startTime, finishTime);
                }catch (Exception e) {
                    e.printStackTrace();
                }
            });
            threads[i].start();
        }
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
       // animals.stream().forEach(System.out::println);
    }
}
