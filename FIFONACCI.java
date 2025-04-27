import java.util.Scanner;

public class FIFONACCI {
    public static void main(String[] args) {
        Scanner A=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF TERM:");
        int n=A.nextInt();
        int n1=0;
        int n2=1;
        System.out.println("FIFONACCI SERIES:");
        for( int i=1;i<n;i++){
            System.out.print(n1+" ");

            int n3=n1+n2;
            n1=n2;
            n2=n3;
        }
        
        
    }

}
