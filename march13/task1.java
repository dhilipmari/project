package march13;

import java.util.Scanner;


public class task1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the breath:");
        int b=sc.nextInt();
        System.out.println("enter the height:");
        int h=sc.nextInt();
        System.out.println("enter the length:");
        int l=sc.nextInt();
        float tsa=2*(b*h+h*l+l*b);
        System.out.println(tsa);


    }
    
}

    

