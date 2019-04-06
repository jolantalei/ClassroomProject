package Lesson2;

import java.util.Scanner;

public class MathTests {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Please enter first  number: ");
        int numberOne = myScanner.nextInt();

        System.out.print("Please enter second number: ");
        int numberTwo = myScanner.nextInt();

        System.out.print("Please enter third number: ");
        int numberThree = myScanner.nextInt();

        int largestNumber = Math.max(numberOne, Math.max(numberTwo, numberThree));

        System.out.println("The largest is: " + largestNumber);


    }
}
