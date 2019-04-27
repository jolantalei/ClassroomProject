package Lesson9;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;

public class Task2 {
    public static void main(String[] args) throws IOException {//nav nozīmes ku liek
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        File f = new File("userstuff.txt");
        FileWriter writer = new FileWriter(f,true);
        writer.write(input);//liek ierakstīt usera inputu, bet tas palik starpatmiņā, fails izvedojās automātiski. \n ieliek jaunā līnijā
        writer.flush();//tikai pēc šī saglabā īstā failā



    }
}
