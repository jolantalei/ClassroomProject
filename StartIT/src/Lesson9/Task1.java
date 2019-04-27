package Lesson9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) throws FileNotFoundException {
        File myFile = new File("UserInput");//nestrādās jo nav izdevots tāds fails
        Scanner sc = new Scanner(myFile);
        sc.hasNext();
    }
}
