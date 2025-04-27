import java.util.Scanner;

public class Biggestnumber {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("ENTER THE FIRST NUM:");
        int A=in.nextInt();
        System.out.println("ENTER THE SECOND NUM:");
        int B=in.nextInt();
        System.out.println("ENTER THE THRID NUM:");
        int C=in.nextInt();
        if(A>B){
            if(A>C){
                System.out.println("A IS BIGGEST NUMBER");

            }
        }
        else
        if(B>C){
            System.out.println("B IS BIGGEST NUMBER");
        }
    

        else{
            System.out.println("C IS BIGGEST NUMBER");
        }


    }

}
