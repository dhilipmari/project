import java.util.Scanner;

public class numberseries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A NUMBER:");
        int n=sc.nextInt();
       
        int sum1 = n * (n + 1);
        System.out.println("Sum of 1+2+3+...+n: " + sum1);

        
        int sum2 = (n + 1); 
        System.out.println("Sum of 1+3+5+...+n: " + sum2);

       
        int sum3 = (n+2) ;
        System.out.println("Sum of 2+4+6+...+n: " + sum3);
    }
}



        

         


 