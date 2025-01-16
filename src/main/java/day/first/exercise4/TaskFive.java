package day.first.exercise4;

import java.util.Scanner;

public class TaskFive {

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
            int count = 0;
            int index = 0;
            int[] resArr = new int[len];
            while (index < arr.length) {
                if (checkInt(arr[index])) {
                    resArr[count] = arr[index];
                    count++;
                }
                index++;
            }
            if (count != 0) {
                for (int i = 0; i < count; i++) {
                    System.out.println(resArr[i]);
                }
            } else {
                System.out.println("There are no such elements.");
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

    public static boolean checkInt(int num) {
        boolean result = false;
        String numStr = String.valueOf(num);
        if (numStr.length() == 1) {
            result = true;
        } else {
            result = numStr.charAt(0) == numStr.charAt(numStr.length() - 1);
        }
        return result;
    }
}

