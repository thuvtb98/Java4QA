package Lession4;

import java.util.Scanner;

public class WhileLoop {

    public static void main(String[] args) {
        int inputNumber;
        System.out.println("Please input number: ");

        Scanner scanner = new Scanner(System.in); //create object of Scanner class, System.in use to get input from user
        while((inputNumber = scanner.nextInt()) != 0){
            System.out.println("You just enter this number:" + inputNumber);
        }

        System.out.println("After While...Loop");
        System.out.println(inputNumber);
    }
}

/*
Vòng lặp for sẽ được sử dụng khi chúng ta đã biết trước được số lần lặp
cùng với đó là khi lệnh khởi tạo và lệnh tăng/giảm đơn giản
VD: xét tuần tự các thành phần trong một mảng, hay xét các số trong khoảng từ m tới n,…

Vòng lặp while sẽ được sử dụng khi chúng ta khó mà có thể biết được số lần lặp lại của nó
 hay việc khởi tạo cho vòng lặp khá phức tạp VD: tránh việc người dùng nhập sai đầu vào,
 */
