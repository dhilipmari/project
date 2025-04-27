import java.util.Scanner;

public class twoarr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of row:");
        int r=sc.nextInt();
        System.out.println("Enter the number of coloum:");
        int c=sc.nextInt();
        int arr[][]=new int[r][c];
        System.out.println("Enter the value:");
        for( int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();

            }

        }
        System.out.println("Matrix:");
        for( int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Transport Matrix:");
        for( int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();

        }
        System.out.println();
        System.out.println( "Access flatten:");
        for( int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }

        }
        System.out.println();



        
        
    
        
    }

}
