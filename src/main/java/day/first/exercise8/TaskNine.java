package day.first.exercise8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class TaskNine {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Integer len = Integer.parseInt(reader.readLine());
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < len; i++) {
            String str = reader.readLine();
            list.add(str);
        }
        String reg = reader.readLine();
        for (int i = 0; i < len; i++) {
            if(list.get(i).contains(reg)) {
                System.out.println(list.get(i));
            }
        }
        reader.close();
    }
}
