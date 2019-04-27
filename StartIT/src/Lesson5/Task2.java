package Lesson5;

import java.util.Scanner;

public class Task2 {

    private static void sayHallo(String name, String niceness){//parametra veids un lokālais nosaukums, var būt tukšs//ārpus fumkcijas argumnetus var saukta arī citādāk
        System.out.println( niceness+ " to meet you " + name + "!");
        System.out.println("Hello!");

    }

    public static void main(String[] args) {
        System.out.println("Hello, dear!");
        System.out.println("How should we address you!");
        Scanner myScanner = new Scanner(System.in);
        String name = myScanner.next();

        if (name.length()>5){
            sayHallo(name,"Nice");
        }else {
            sayHallo(name, "Not Nice");
        }
        }
    }

