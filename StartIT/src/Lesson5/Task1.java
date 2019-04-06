package Lesson5;

import java.util.Scanner;

public class Task1 {//visa cikla ciparu reizinājums piem. 4 =4*3*2*1
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        int number = myScanner.nextInt();
        int result = 1;

      //  for (int i = number; i>0; i--){
       //     result = result*i;
       // }
       // System.out.println(result);

        while (number>0){
            result*=number;//shortcut of result = result * number
            number--;
        }
        System.out.println(result);

    }
}
