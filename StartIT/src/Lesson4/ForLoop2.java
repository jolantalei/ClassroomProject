package Lesson4;

import java.util.Scanner;

public class ForLoop2 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        String word = myScanner.next();
         for (int i = word.length()-1;i>=0;i--){
             System.out.print(word.charAt(i));//izdrukā pretējā virzienā
         }
    }
}
