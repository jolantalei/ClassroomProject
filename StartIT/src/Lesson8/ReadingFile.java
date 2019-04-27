package Lesson8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFile {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("input.txt");
        System.out.println(f.getAbsolutePath());//absolute path ir ceļš kur atrodas fails, pilns ceļš. Relative Path ir nepilns ceļš
        Scanner sc = new Scanner(f);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        System.out.println("numbers in file: ");
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
    }

}
