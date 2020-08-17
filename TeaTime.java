import java.util.Scanner;

public class TeaTime {
    public static void announceDevTeaTime() {
        System.out.println("Waiting for Dev tea time ...");
        System.out.println("Type in a Random word and press Enter to start Dev tea time...");
        Scanner input = new Scanner(System.in);
        input.next();
        System.out.println("It's Dev tea time ...");
    }

    public static void main(String[] args) {
        announceDevTeaTime();
        
    }
}