package Lesson6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String op = sc.next();
        Calculator calc = new Calculator();
        Calculator otherCalculator = new Calculator();
        otherCalculator.number1 = 3;
        otherCalculator.number2 = 5;

        otherCalculator.testing();


    }
}
