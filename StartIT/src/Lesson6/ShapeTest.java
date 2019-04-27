package Lesson6;

import java.util.Scanner;

public class ShapeTest {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Input R for rectangle, C for circle!");
        Shape sh;

        String choice = myScanner.next();

        if (choice.equals("C")) {
            CircleClass c = new CircleClass();
            c.radius = myScanner.nextDouble();
            sh = c;
        } else {
            RectangleClass r = new RectangleClass();
            r.width = myScanner.nextDouble();
            r.height = myScanner.nextDouble();
            sh = r;
        }
        System.out.println(sh.getArea());
        System.out.println(sh.getPerimeter());
    }
}
