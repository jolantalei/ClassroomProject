package ProjectEuler;

import java.util.Scanner;

public class Problem4If {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        int number = myScanner.nextInt();

        if (number==0){
            System.out.println("zero");

        }else if (number>0){
            if (number>1000000){
                System.out.println("large");
            }
            System.out.println("positive");
        }else {
            System.out.println("negative");
        }
    }
}
