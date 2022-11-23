package Lession6;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputColor;

        System.out.println("Please input a color: \n");
        inputColor = scanner.next();

        switch (inputColor){
            case "red":
                System.out.println("Put this ball into red basket");
                break;
            case "pink":
                System.out.println("Put this ball into pink basket");
                break;
            default:
                System.out.println("Put this ball into recycle");
        }
    }
}
