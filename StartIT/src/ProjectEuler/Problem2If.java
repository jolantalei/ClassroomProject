package ProjectEuler;

import java.util.Scanner;

public class Problem2If {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter number");
        int userNumber = myScanner.nextInt();

        if (userNumber > 0) {
            System.out.println("Number ir positive");
        } else {
            System.out.println("Number is negative");
        }
    }
}
