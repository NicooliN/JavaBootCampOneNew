package day.first.exercise3;

import java.util.Scanner;

public class Mean {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int len = setInt(scanner);
            if (len <= 0){
                System.out.println("Input error. Size <= 0");
            } else {
                int[] arr = new int[len];
                for (int i = 0; i < len; i++) {
                    arr[i] = setInt(scanner);
                }
                int sum = 0;
                int count = 0;

                for (int i = 0; i < len; i++) {
                    if (arr[i] < 0) {
                        sum += arr[i];
                        count++;
                    }
                }
                if (count != 0) {
                    sum = sum / count;
                    System.out.print(sum);
                } else {
                    System.out.println("There are no negative elements.");
                }
            }
        }

        public static int setInt(Scanner scanner) {
            while (true) {
                try {
                    String str = scanner.nextLine();
                    return Integer.parseInt(str);
                } catch (IllegalArgumentException e) {
                    System.out.println("Couldn't parse a number. Please, try again");
                }
            }
        }
    }


