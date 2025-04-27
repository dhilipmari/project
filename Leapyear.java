import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER YOUR YEAR:");
        int year=sc.nextInt();


        if (year % 4==0) {
           System.out.println(year +"leap year");
            
        }
        else{
            System.out.println(year +"not a leap year");
        }
    }

}

