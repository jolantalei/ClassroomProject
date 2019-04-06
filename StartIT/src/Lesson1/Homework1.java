package Lesson1;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter first decimal number: ");
        double numberOne = myScanner.nextDouble();
        System.out.println("Please enter second decimal number: ");
        double numberTwo = myScanner.nextDouble();
        float sumOfSquares = (float) ((numberOne * numberOne) + (numberTwo * numberTwo));//  castings (float) nomaina mainīgā tipu
        System.out.println("The square of these numbers is: " + sumOfSquares);


    }
}
