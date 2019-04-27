package Lesson6;

import java.util.Scanner;

public class HomeworkCircleTest {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("please select object: T for triangle or C for circle");
        String object = myScanner.next();

        if (object.equals("C")){
            System.out.println("Enter radius: ");
            double radius = myScanner.nextDouble();
            HomeworkCircle circleMain = new HomeworkCircle();
            System.out.println("Perimeter is: " + circleMain.circlePerimeter(radius));
            System.out.println("Area is: " + circleMain.circleArea(radius));
        }else {
            System.out.println("Enter length: ");
            double length = myScanner.nextDouble();
            System.out.println("Enter width: ");
            double width = myScanner.nextDouble();
            HomeworkRectangle rectangle = new HomeworkRectangle();
            System.out.println("Perimeter is: " + rectangle.rectangleArea(length,width));
            System.out.println("Area is: " + rectangle.rectanglePerimeter(length,width));
        }

    }
}
