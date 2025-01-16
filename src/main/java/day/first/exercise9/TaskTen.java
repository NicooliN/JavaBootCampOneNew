package day.first.exercise9;

import java.util.ArrayList;
import java.util.Scanner;

public class TaskTen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int userCount = readInt(scanner);
        ArrayList<User> userList = new ArrayList<>();

        for (int i = 0; i < userCount; i++) {
            String name = scanner.nextLine();
            int age =  readInt(scanner);
            if (age > 0) {
                userList.add(new User(age,name));
            } else {
                System.out.println("Incorrect input. Age <= 0");
            }
        }

        userList.stream()
                .filter(user -> user.getAge() >=18)
                .map(User::getName)
                .forEach(System.out::println);
    }
    public static int readInt(Scanner scanner){
        int res = 0;
        while (true) {
            try {
                res = Integer.parseInt(scanner.nextLine());
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Couldn't parse a number. Please, try again");
            }
        }
        return res;
    }


}
