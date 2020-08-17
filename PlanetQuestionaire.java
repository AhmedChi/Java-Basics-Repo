import java.util.Scanner;

public class PlanetQuestionaire {
    public static void main(String[] args) {

        String firstAnswer = "Jupiter";
        String secondAnswer = "Mars";
        String thridAnswer = "Earth";

        System.out.println("Whats the biggest planet in our solor system: " + firstAnswer+ ", " + secondAnswer + ", " + thridAnswer);        

        String correctAnswer = firstAnswer;

        Scanner input = new Scanner(System.in);

        String answer = input.next();

        if(correctAnswer.equals(answer.toUpperCase())){
            System.out.println("Correct Answer");
        } else {
            System.out.println("Wrong Answer, the Correct answer is " + correctAnswer);
        }
    }
}