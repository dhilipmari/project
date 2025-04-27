package exam;
import java.util.Scanner;

public class exam2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the amount:");
        int amount=sc.nextInt();
        int taxtopay=0;

        if(amount<=500000)
        {
            
            System.out.println("no tax");
        }
        else if(amount>500001 && amount<=700000)
         {
            taxtopay=(amount-50000)*10/100;
            System.out.println(taxtopay);

        }
        else if(amount>700000 && amount<=1000000){
            taxtopay=((amount-500000)*10/100)+((amount-700000)*20/100);
            System.out.println(taxtopay);
        }
        else if (amount>=1000001){
            taxtopay=((amount-500000)*10/100)+((amount-700000)*20/100)+((amount-1000000)*30/100);
            System.out.println(taxtopay);

        }
        //System.out.println("Tax to pay"+taxtopay);
    }
    
}
