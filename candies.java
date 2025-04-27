import java.util.Scanner;

public class candies {
    public static void main(String[] args) {
        int initialCandies = 10; 
        int extraCandies=4;
        int totalCandies = initialCandies + extraCandies; 

        System.out.println("Total candies: " + totalCandies);

        int exchangedCandies = 3; 
        int remainingCandies = totalCandies % exchangedCandies; 

        System.out.println("Remaining candies: " + remainingCandies);
       
       
    }
}    
