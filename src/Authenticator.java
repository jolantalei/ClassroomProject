import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// Copy of one of our lessons, but changed main to authenticate
// authenticate now returns the username
    public class Authenticator {
        private static String fileName = "userData.txt";

        public static String login(String userName, String password) throws FileNotFoundException {

            File f = new File(fileName);

            if (! f.exists()){
                return null;
            }
            Scanner fileScan = new Scanner(f);

            while (fileScan.hasNext()) {
                String userPassPair = fileScan.nextLine();
                String[] result = userPassPair.split(",");
                if (userName.equals(result[0])
                        && password.equals(result[1])) {
                    return result[0];
                }
            }
            return null;
        }
        public static String registerUser(String username,String password) throws IOException, RuntimeException {

            if (userExists(username)) {
                throw new RuntimeException("The user exists already!");
            }
            File f = new File(fileName);
            FileWriter fw = new FileWriter(f,true);//Kapēc true?
            fw.write(username + "," + password + System.lineSeparator());//line seperator ielike jaunā rindā
            fw.flush();

            return username;//kapēc atgriež username?
        }

        private static boolean userExists(String username) {
            File f = new File(fileName);
            Scanner fileScan;

            try {
                fileScan = new Scanner(f);
            } catch (FileNotFoundException ex) {
                return false;
            }

            while (fileScan.hasNext()) {
                String userPassPair = fileScan.nextLine();
                String[] result = userPassPair.split(",");
                if (username.equals(result[0])) {
                    return true;
                }
            }

            return false;
        }
}
