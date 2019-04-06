package ProjectEuler;

import java.util.Scanner;

public class Problem3If {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int number1= myScanner.nextInt();
        int number2= myScanner.nextInt();
        int number3= myScanner.nextInt();
        int greatestNumber = Math.max(number1, Math.max(number2,number3));

        System.out.println("Greatest number is: " + greatestNumber);
    }
}
