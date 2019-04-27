package Lesson5;

import java.util.Scanner;

public class HomeworkLevel2Swich {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String op = sc.next();
        int result;

        if (op.equals("!")) {
            result = factorial(a);
        } else {
            int b = sc.nextInt();
            result = twoNumberOpereation(a, b, op);
        }
        System.out.println(result);

    }
    private static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    private static int twoNumberOpereation(int firstNumber, int secondNumber, String Operation) {
        int result;
        switch (Operation) {
            case "+":
                result = sum(firstNumber, secondNumber);
                break;
            case "-":
                result = subtract(firstNumber, secondNumber);
                break;
            case "*":
                result = multiply(firstNumber, secondNumber);
                break;
            case "/":
                result = divide(firstNumber, secondNumber);
                break;

            default:
                System.out.println("Invalid operation!");
                return 0;
        }
        return result;
    }

    private static int sum(int first, int second) {
        return first + second;
    }

    private static int subtract(int first, int second) {
        return first - second;
    }

    private static int multiply(int first, int second) {
        return first * second;
    }

    private static int divide(int first, int second) {
        return first / second;
    }
}
