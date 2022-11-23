package Lession6;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SwitchWithoutBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputDay;

        System.out.println("Please input a day: \n");
        inputDay = scanner.next();

        switch (inputDay){
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                System.out.println("This is a weekdays");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println("This is a weekend");
                break;
            default:
                System.out.println("Input is wrong!!!");
        }
    }
}
