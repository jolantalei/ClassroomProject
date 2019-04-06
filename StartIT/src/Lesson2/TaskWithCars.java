package Lesson2;

import java.util.Scanner;

public class TaskWithCars {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter number of passengers: ");

        int numberOfPassengers = myScanner.nextInt();
        int sumOfCars = 12;
        int number = numberOfPassengers / sumOfCars;
        int module = numberOfPassengers % sumOfCars;
        int countOfCars = number * 2;


        if (module == 0){
            System.out.println("You have to take " + countOfCars + " cars");
        }else if(module <= 5) {
            countOfCars++;
            System.out.println("You have to take " + countOfCars + " cars");
        } else if (module >= 6) {
            countOfCars = countOfCars + 2;// countOfCars+ =2
            System.out.println("You have to take " + countOfCars + " cars");
        } else {
            System.out.println("Error");
        }

    }

}
