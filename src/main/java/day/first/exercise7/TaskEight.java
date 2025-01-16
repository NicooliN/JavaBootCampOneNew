package day.first.exercise7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TaskEight {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        int lft = 0;
        int rgt = 0;
        try {
            lft = scanner.nextInt();
            i++;
            while (true){
                if (scanner.hasNextInt()) {
                    rgt = scanner.nextInt();
                    if (rgt > lft) {
                        lft = rgt;
                        i++;
                    } else {
                        System.out.println("The sequence is not ordered from the ordinal number of the number " + i);
                        break;}
                } else {
                    System.out.println("The sequence is ordered in ascending order");
                    break;
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Input error");
        }

    }
}
