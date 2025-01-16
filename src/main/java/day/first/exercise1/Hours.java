package day.first.exercise1;

import java.util.Scanner;

public class Hours {
    private int inputSeconds;
    private int seconds;
    private int minutes;
    private int hours;

    public static void main(String[] args) {
     Hours hours = new Hours();
     hours.setTime();
     hours.calculateTime();
     hours.printTime();
    }

    public void setTime() {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;

        while (true) {
            try{
                this.inputSeconds = Integer.parseInt(scanner.next());
                break;
            } catch (NumberFormatException e){
                System.out.println("Couldn't parse a number. Please, try again");
            }
        }
    }

    public void calculateTime() {
        this.seconds = this.inputSeconds % 60;
        this.minutes = this.inputSeconds / 60 % 60;
        this.hours = this.inputSeconds / 3600;
    }

    public void printTime() {
        if (this.inputSeconds < 0) {
            System.out.println("Incorrect time");
        } else {
            System.out.printf("%02d:%02d:%02d", this.hours, this.minutes, this.seconds);
        }

    }

}
