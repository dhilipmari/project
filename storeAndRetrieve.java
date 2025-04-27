import java.util.Scanner;

public class storeAndRetrieve {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter no.of Values:");
		int n=in.nextInt();
		
		int a[]=new int[n];
		System.out.println("Enter Values:");
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter value for:"+i);
			a[i]=in.nextInt();
		}
		
		System.out.println("Values:");
		for(int i=0;i<a.length;i++)
		{
			System.out.println("a["+i+"]="+a[i]);
		}
		
		System.out.println(a[2]);
		a[2]=15;
		System.out.println(a[2]);

	}
    
}
