import java.util.Scanner;

public class BasicMain{
    public static void main(String[] args) {
        int studentAge = 15;
        double studentGPA = 3.5;
        char studentGrade = 'A';
        String firstName = "Ahmed";
        char studentFirstInital = firstName.charAt(0); 
        String lastName = "Abdel Rahman";
        boolean hasPerfectAttendence = true;

        System.out.println(firstName + " " + lastName + " is "+ studentAge);
        System.out.println("With a GPA of " + studentGPA + " and a Grade of " + studentGrade);
        System.out.println("Does " + firstName + ", have a Perfect Attendence? " + hasPerfectAttendence);

        System.out.println("First initals of student name: " + studentFirstInital);
        
        System.out.println("Please input the correct GPA: ");

        // Lets use input information by first greating a scanner
        Scanner input = new Scanner(System.in);
        studentGPA = input.nextDouble();

        System.out.println(firstName + " " + lastName + " has a new GPA of " + studentGPA);
    }
}