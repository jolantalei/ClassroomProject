package Lesson6;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("please enter some word: ");
        String name = myScanner.next();
        boolean palindrome = isPalindrome(name);
        System.out.println(palindrome);

    }
    private static boolean isPalindrome(String word) {

        if (word.length()<=1)return true;// ja ifā vien līnija apaļiekavas nav obligātas
        if (word.charAt(0) !=word.charAt(word.length()-1)){
            return false;
        }
        String smallerWord = word.substring(1, (word.length()-1));{//ņem pa vienam burtam no abiem galiem un tā saprot vai atbilst
            return isPalindrome(smallerWord);
        }

    }
}

