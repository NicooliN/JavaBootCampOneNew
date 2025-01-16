package day.first.exercise6;

import javax.imageio.IIOException;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TaskSeven {
    public static void main(String[] args) {
     try {
         BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
         String input = bufferedReader.readLine();
         BufferedReader fileReader = new BufferedReader(new FileReader(input));
         ArrayList<String> list = new ArrayList<>();
         String line;
         while ((line = fileReader.readLine()) != null) {
             list.add(line);
         }
         int length = Integer.parseInt(list.get(0));
         double [] array = new double[length];
         String num = list.get(1);
         String[] result = num.split(" ");

         for (int i = 0; i < length; i++) {
             array[i] = Double.parseDouble(result[i]);
         }
        sort(array);
         double max = array[length-1];
         double min = array[0];
         System.out.printf("%.2f %.2f", min, max);
     } catch (IOException e) {
         e.printStackTrace();
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
