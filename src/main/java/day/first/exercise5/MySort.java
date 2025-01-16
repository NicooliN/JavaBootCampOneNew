package day.first.exercise5;

import java.util.Arrays;
import java.util.Scanner;

public class MySort {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int len = setInt(scanner);
            if (len <= 0){
                System.out.println("Input error. Size <= 0");
            } else {
                double[] arr = new double[len];
                for (int i = 0; i < len; i++) {
                    arr[i] = setDouble(scanner);
                }
                sort(arr);
                System.out.println(Arrays.toString(arr));
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
    public static double setDouble(Scanner scanner) {
        while (true) {
            try {
                String str = scanner.nextLine();
                return Double.parseDouble(str);
            } catch (IllegalArgumentException e) {
                System.out.println("Couldn't parse a number. Please, try again");
            }
        }
    }

        public static void sort(double[] arr) {
            for (int i = 0; i < arr.length-1; i++) {
               int minIndx = i;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] < arr[minIndx]) {
                        minIndx = j;
                    }
                }
                double temp = arr[minIndx];
                arr[minIndx] = arr[i];
                arr[i] = temp;
            }
        }
    }
