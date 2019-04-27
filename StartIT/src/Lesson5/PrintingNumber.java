package Lesson5;

import java.util.Scanner;

public class PrintingNumber {
    private static void printing (int userInput){
        System.out.println(userInput);

    }

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int number = myScanner.nextInt();
        printing(number);

    }
}
