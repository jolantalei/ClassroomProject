package Lesson7;
//import Lesson1.FirstExperiment;

import java.util.Scanner;

class ArraysExtra {
//    new Lesson1.FirstExperiment;

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("enter a word numbers");
        String word = myScanner.next();
        word = word.toLowerCase();
        int letterCount [] = new int[26]; //ir 26 latīņu burti

        for (int i = 0; i< word.length(); i++){
            char letter = word.charAt(i);
            int index = letter - 97;//97 nāca no asspix tabulas, kur katram simbolam ir vērtyība
            letterCount[index]++;
        }

        for (int i = 0; i < 26; i++){
            char letter = (char) (i + 97);
            System.out.println(letter + " " + letterCount[i]);
        }

//        String[] array = new String[10];
//        String input = myScanner.nextLine();
//
//        System.out.println("length of word is:" + input.length() );
//        System.out.println("size of array " + array.length);
    }

}

