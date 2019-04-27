package Lesson5;

import java.util.Scanner;

public class HomeworkLevel3Plus {

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
    public static int factorial(int n) {
            System.out.println("factorial: " + n);
            if (n==1)return 1;
            return n* factorial(n-1);//piem. f(n) = n*(n-1) rokas tik dziļi līdz atrod kādu konstatntu vērtību un aizpilda visas nezināmās vērtības
            }

    public static int twoNumberOpereation(int firstNumber, int secondNumber, String Operation) {
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

        public static int sum(int first, int second) {
            return first + second;
        }

    public static int subtract(int first, int second) {
            return first - second;
        }

    public static int multiply(int first, int second) {
            return first * second;
        }

    public static int divide(int first, int second) {
            return first / second;
        }
    }

