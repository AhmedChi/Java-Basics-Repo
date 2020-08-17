import java.util.Scanner;

public class TrackOnRepeat {
    public static void main(String[] args) {
        System.out.println("Do you want the track to repeat? \n Please enter true for yes or false for no. ");
        
        Scanner input = new Scanner(System.in);
        boolean isOnRepeat = input.nextBoolean();

        while(isOnRepeat){
            System.out.println("Playing Current song");
            System.out.println("Would you like to repeat this song? \n Please enter yes or no");
            String userInput = input.next();

            if(userInput.equals("no")){
                isOnRepeat = false;
            }
        }

        System.out.println("Playing Next song");

    }
}