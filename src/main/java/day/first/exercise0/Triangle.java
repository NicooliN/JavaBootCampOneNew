package day.first.exercise0;

import java.util.Scanner;

/*
Triangle perimeter
 */
public class Triangle {

    public static void main(String[] args) {

        double [] arr = new double[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length;) {
            if (sc.hasNextDouble()){
                arr[i] = sc.nextDouble();
                i++;
            } else {
                System.out.println("Couldn't parse a number. Please, try again");
            }
        }
            perimeterTriangle(arr);
        }

    public static void perimeterTriangle(double[] arr) {
            double x1 = arr[0];
            double y1 = arr[1];
            double x2 = arr[2];
            double y2 = arr[3];
            double x3 = arr[4];
            double y3 = arr[5];

            double a = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
            double b = Math.sqrt((x3 - x2) * (x3 - x2) + (y3 - y2) * (y3 - y2));
            double c = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));

            if (a + b > c || a + c > b || b + c > a ) {
                System.out.printf("Perimeter: %.3f%n", a + b + c);
            } else {
                System.out.println("It isn't triangle");
            }
    }
}
