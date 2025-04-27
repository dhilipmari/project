import java.util.Scanner;

public class sqp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A NUMBER:");
        int n=sc.nextInt();
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){
                if(i==0||j==0||i==n||j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                    
                }

                
            }
            
        }

    }
}
    


