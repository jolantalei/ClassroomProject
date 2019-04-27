package Lesson5;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int firstNumber = myScanner.nextInt();
        System.out.println("Enter second number");
        int secondNumber = myScanner.nextInt();
        int result =calculation(firstNumber,secondNumber);
        System.out.println("Sum is: " + result);
    }

    private static int calculation ( int firstInput, int secondInput){
        return firstInput+secondInput;
    }

}
