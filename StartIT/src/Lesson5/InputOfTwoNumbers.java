package Lesson5;

import java.util.Scanner;

public class InputOfTwoNumbers {
        private static int sumOfNumbers (int userInput1, int userInput2){
            int sum = userInput1+userInput2;
            return sum;

        }

        public static void main(String[] args) {
            Scanner myScanner = new Scanner(System.in);
            int numberOne = myScanner.nextInt();
            int numberTwo = myScanner.nextInt();
            int sum = sumOfNumbers(numberOne,numberTwo);
            System.out.println(sum);

        }
    }

