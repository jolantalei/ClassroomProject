package Lesson7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input D for dog, C for cat!");
        Pet pet;
        String choice = sc.next();

        if (choice.equals("C")) {
            pet = new Cat();
        } else if (choice.equals("D")) {
           pet = new Dog();
        }else {
            System.out.println("We don't support such input");
            return;
        }
        String message  = pet.getVoiceMessage();
        System.out.println(message);

    }
}
