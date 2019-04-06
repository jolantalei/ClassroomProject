package Lesson2;
/* šadi raksta komentārus, viss kas pa vodu ir komentārs*/
import java.util.Scanner;

public class NewClass {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int total=0;
        int grade;
        int average;
        int counter = 0;

        while (counter<10){
        grade = myScanner.nextInt();
        total = total + grade;
        counter++;

        }
        average = total/10;
        System.out.println("Your average= " + average);
    }


}
