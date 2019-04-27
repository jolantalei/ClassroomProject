package Lesson8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        int userInput = 0;//vienārša jebkurš cipars defaltā liek 0
        try {
            userInput = getUserInput();

        }catch (InputMismatchException whatever){
            System.out.println(whatever.getMessage());
            return;
        }
        userInput++;
        System.out.println("Your input plus one is: " + userInput);

    }
    private static int getUserInput() throws InputMismatchException {
        Scanner sc = new Scanner(System.in);
        System.out.println("input number from 1 to 10");
        int i =0;
        try {
           i = sc.nextInt();
        }catch (InputMismatchException failRead){
            throw new InputMismatchException("Please input a number");        }


        if (i < 1) {
            throw new InputMismatchException("number to small");}
        else if (i < 1 || i > 10) {
            throw new InputMismatchException("number to large");
        } else {
            return i;
        }
    }
}

