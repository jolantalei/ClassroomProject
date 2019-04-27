package Lesson5;

import java.util.Scanner;

public class HomeworkLevel3 {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int firstNumber = myScanner.nextInt();
        System.out.println("Enter operation");
        String operation = myScanner.next();
        System.out.println("Enter second number");
        int secondNumber = myScanner.nextInt();
        int result = calculation(firstNumber, secondNumber, operation);
        System.out.println("Result is: " + result);

    }

    private static int calculation(int firstInput, int secondInput, String symbol) {
        int sum = firstInput + secondInput;
        int multiply = firstInput * secondInput;
        int davide = firstInput / secondInput;
        int subtract = firstInput - secondInput;
        int factorial = 1;
        if (symbol.equals("*")) {
            return multiply;
        } else if (symbol.equals("/")) {
            return davide;
        } else if (symbol.equals("-")) {
            return subtract;
        } else if (symbol.equals("+")) {
            return sum;
        } else if (symbol.equals("!")) {
            for (int i = 1; i <= firstInput; i++) {
                factorial = factorial * i;
            }
            return factorial;
        } else {
            System.out.println("Wrong input");
        }
        return sum;
    }
}


