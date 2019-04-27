package Lesson6;

import java.util.Scanner;

public class RefreshingLoopsTest {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("enter number");
        int userInput = myScanner.nextInt();
        RefreshingLoops loops = new RefreshingLoops();
        System.out.println(loops.multiplicationOfNumber(userInput));
    }
}
