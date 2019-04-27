package Lesson6;

public class Calculator {
    public double number1;
    public double number2;

    public void testing(){
        System.out.println("number 1: " + number1);
        System.out.println("number s: " + number2);
    }

    public static int factorial(int n) {
        System.out.println("factorial: " + n);
        if (n==1)return 1;
        return n* factorial(n-1);//piem. f(n) = n*(n-1) rokas tik dziļi līdz atrod kādu konstatntu vērtību un aizpilda visas nezināmās vērtības
    }

    public int twoNumberOpereation(int firstNumber, int secondNumber, String Operation) {
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

   public int sum(int first, int second) {
        return first + second;
    }

    public int subtract(int first, int second) {
        return first - second;
    }

    public int multiply(int first, int second) {
        return first * second;
    }

    public int divide(int first, int second) {
        return first / second;
    }
}
