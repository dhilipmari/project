import java.util.Scanner;

public class Batsman {
    public static void main(String[] args) {
        Scanner cricket=new Scanner(System.in);
        System.out.println("Enter the number of ball facted by bastman:");
        int Ball=cricket.nextInt();
        if(Ball==0)
        System.out.println("Diamond Duck");
        else if (Ball==1) 
        {
            System.out.println("Golden Duck");

            
        }
        else{
            System.out.println("Duck out");
        }
    }

}
