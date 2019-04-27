package Lesson6;

import java.util.Scanner;

public class ExampleTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        Example calc = new Example();
        System.out.println(calc.sum(a,b));
    }
}
