package Lesson2;

import java.util.Scanner;

public class GessingTheNumberSecond {
    public static void main(String[] args) {
        int result = (int) (Math.random()) * 10;

        Scanner myScanner = new Scanner(System.in);

        //System.out.println("you have to guess " + result);

        int guess = -1;// liek tādu kas nav attiecīgajā range, lai neuzminās nejauši, pat bez usera ievades. tāpēc negatīvs.

        while (guess != result) {// šeit var izmanto do while
            guess = myScanner.nextInt();
            System.out.println("Your guess: " + guess);
        }
        System.out.println(" " + guess + " was correct");

    }
}