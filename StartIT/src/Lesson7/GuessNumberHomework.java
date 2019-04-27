package Lesson7;

import java.util.Scanner;

public class GuessNumberHomework {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int result = (int) (Math.random()) * 10;
        int guess = -1;// liek tādu kas nav attiecīgajā range, lai neuzminās nejauši, pat bez usera ievades. tāpēc negatīvs.
        System.out.println("Guess number");
        guess = myScanner.nextInt();
        //System.out.println("you have to guess " + result);
        do {
            System.out.println("Your guess: " + guess);
        } while (guess != result);
    }

}
