package Lesson2;

import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Please enter number: ");
        int userNumber = myScanner.nextInt();

        double myNumber = Math.random();
        double myNumberInRange = myNumber * 100;
        int roundedNumber = (int) myNumberInRange;// int roundedNumber = (MAth.random() *100) šadi var vienā līnijā

        System.out.println("My number is: " + roundedNumber);

        if (userNumber > roundedNumber) {
            System.out.println("Your guess is to high");
        } else if (userNumber == roundedNumber) {
            System.out.println("You guested");
        } else {
            System.out.println("Your guess is to low");
        }
    }
}
