package march13;
 import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter principle amount: ");
        int p=sc.nextInt();
        System.out.println("enter the  time period:");
        int n=sc.nextInt();
        System.out.println("enter interest rate:");
        float r=sc.nextFloat();
        System.out.println("simple interest="+(p*n*r));

    }
    
}
