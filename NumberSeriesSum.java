import java.util.Scanner;

public class NumberSeriesSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        scanner.close();

        int sum1 = 0, sum2 = 0, sum3 = 0;
        for (int i = 1; i <= n; i++) {
            sum1 += i;
        }
        System.out.println("Sum of 1+2+3+...+n: " + sum1);
        
        
        for (int i = 1; i <= n; i += 2) {
            sum2 += i;
        }
        System.out.println("Sum of 1+3+5+...+n: " + sum2);
        
         for (int i = 2; i <= n; i += 2) {
            sum3 += i;
        }
        System.out.println("Sum of 2+4+6+...+n: " + sum3);
    }
}

