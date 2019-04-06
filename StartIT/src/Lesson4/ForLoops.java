package Lesson4;

import java.util.Scanner;

public class ForLoops {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        String number = myScanner.next();
        int sum = 0;

        for (int i =0; i< number.length(); i++){
            char digit = number.charAt(i);
            int digitAsInt = (int) digit - 48;
            sum +=digitAsInt;
        }
        System.out.println(sum);
    }
}
