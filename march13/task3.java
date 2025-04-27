package march13;
import java .util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float pi=3.14f;
        System.out.println("enter radius val:");
        float r=sc.nextFloat();
        System.out.println("enter height:");
        float h=sc.nextFloat();
        float voc=pi*(r*r)*h;
        float meter=voc/100;
       // System.out.println("value of cylinder="+voc);
        System.out.println("meter="+meter);
        


    }
    
}
