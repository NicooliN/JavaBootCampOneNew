package day.first.exercise2;

import java.util.Scanner;

public class Fibonacchi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num = 0;
        while (true) {
            try {
                num = Long.parseLong(scanner.next());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Couldn't parse a number. Please, try again");
            }
        }

        if (num < 0 || num >= 93) {
            System.out.println("Too large n");
        } else System.out.println(fib(num));
    }
    public static long fib(long num) {
        if (num == 0 )
            return 0;
        else if (num == 1)
            return 1;
        else {
            return fib(num - 1) + fib(num - 2);
        }
    }
}
