package Lesson7;

import java.util.Scanner;

public class ArraysTask {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int[] userInput = new int[5];

            for (int i = 0; i < 5; i++) {
                userInput[i] = sc.nextInt();
                System.out.print("input is: " + i);
            }

            for (int inp : userInput) {
                System.out.println("input is: " + inp);
            }
        }
}