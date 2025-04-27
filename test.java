import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
        System.out.println("enter the no val:");
        int n=s.nextInt();
        System.out.println("enter the of range:");
        int r=s.nextInt();
        int m[]=new int [n];
        System.out.println("enter the value of sample:");
        for(int i=0;i<m.length;i++){
            m[i]=s.nextInt();
        }
        int num=0;
        int count = 0;
        while (num<r) {
            int e[]=new int[r];
            System.out.println("enter the range:");
            for(int i=0;i<e.length;i++)
            {
                
                e[i]=s.nextInt();

            }
            for(int i=0;i<m.length;i++)
            {
                if(m[i]>=e[0]&&m[i]<=e[1])
                {
                    count++;
                }
                System.out.println("The no of value range:"+ count);
                num++;
                count=0;
            }
            

            
        }
        


    }
    
}
