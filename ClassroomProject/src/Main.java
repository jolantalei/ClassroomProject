import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String question1 = "Which one of these is OOP programming language?\n" +
                "(a)Java\n(b)R\n(c)SQL";
        String question2 = "Which one of these belongs to primitive data type?\n" +
                "(a)String\n(b)long\n(c)Array";

        Question [] questions = {new Question (question1, "a"),new Question (question2, "b"),
        };
        takeTest (questions);
    }

    public static void takeTest (Question[] questions){
        int score = 0;
        Scanner userInput = new Scanner(System.in);

        for (int i = 0; i < questions.length; i++){
            System.out.println(questions[i].prompt);
            String answer = userInput.nextLine();
            if (answer.equals((questions[i].answer))){
                score++;
            }
        }
        System.out.println("You got " + score + "/" + questions.length);
    }
}
//input.equals.Ignore Case ("java") - ignore case ignorē ar kādu burtu lielumu ievadīts lasa tikai nozīmi