package Lesson2;

import java.util.Scanner;

public class Lesson3 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int cats = myScanner.nextInt();

        String postfix = cats == 1? " Cat" : " cats";//ifs - ja izpildās ir pirmais, ja neizpildās otrais

        System.out.println(cats + postfix);
    }
}
