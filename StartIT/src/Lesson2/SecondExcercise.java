package Lesson2;

import java.util.Scanner;

public class SecondExcercise {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int a = myScanner.nextInt();
        int b = myScanner.nextInt();

        if (a < b) {
            System.out.println("a is lower");
        } else {
            System.out.println("b is larger or equal");
        }

    }
}
