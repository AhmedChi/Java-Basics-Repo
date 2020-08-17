import java.util.Scanner;

public class MealPricing {
    public static double calculateTotalMealPrice(double listedMealPrice, double tipRate, double taxRate){
        double tip = tipRate * listedMealPrice;
        double tax = taxRate * listedMealPrice;
        double result = listedMealPrice + tip + tax;

        return result;
    }

    public static void main(String[] args) {
        double groupTotalMealPrice = calculateTotalMealPrice(100,.2,.08);
        
        System.out.println("The total meal price is £" + groupTotalMealPrice + "p");

        System.out.println("How many people ate this meal? ");
        Scanner input = new Scanner(System.in);
        int numberOfPeopleAtMeal = input.nextInt();

        double individualMealPrice = groupTotalMealPrice / numberOfPeopleAtMeal;
        System.out.println("You should pay £" + individualMealPrice + "p each. \n Thank you and have a good day");
    }
}