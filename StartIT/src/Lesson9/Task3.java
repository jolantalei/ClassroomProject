package Lesson9;

import jdk.nashorn.internal.ir.IfNode;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("you want to log in (L) or register (R)");
        String choise = myScanner.nextLine();

        if (choise.equals("R")) {
            try {
                registerUser();
                System.out.println("registred succesfuly");
            }catch (IOException ex){
                System.out.println("file error" + ex);
            }catch (RuntimeException ex){
                System.out.println("runtime error" + ex);

            }

            }else if (choise.equals("L")) {

            } else {
                System.out.println("input error");
            }

        }

        private static void registerUser () throws IOException, RuntimeException {
            Scanner myScanner = new Scanner(System.in);
            System.out.println("ENTER username: ");
            String username = myScanner.nextLine();
            System.out.println("ENTER password: ");
            String password = myScanner.nextLine();
            System.out.println("Please confirm: ");
            String passwordConfirmation = myScanner.nextLine();
            if (!password.equals(passwordConfirmation)){
                throw new RuntimeException("password do not match");// nevar lietot returs jo tad printētu soli par veikmīgu reģistrāciju, tāpēc jāliek exeption
            }

            File file = new File("User_data.txt");
            FileWriter fw = new FileWriter(file);
            fw.write(username);
            fw.write(System.lineSeparator());//šis nodrošina, ka nākamais jaunāarindā
            fw.write(password);
            fw.flush();

        }
    }
