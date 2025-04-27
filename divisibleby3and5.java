import java.util.Scanner;

public class divisibleby3and5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER A NUMBER:");
        int num=sc.nextInt();
        if(num%3==0 || num%5==0){
            System.out.println("divisible by 3 and 5");

        }
        else{
            System.out.println("not divisible by 3 and 5");
        }

    }
    


    
      

}
