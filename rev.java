public class rev {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char c[]= {'m','a','d','e','m'};
		char d[]=new char[c.length];
		for(int i=0;i<c.length;i++)
		{
			d[i]=c[(c.length-1)-i];// d[0]=c[4-0]=c[4]
		}
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+" ");
		}
		System.out.println();
		for(int i=0;i<d.length;i++)
		{
			System.out.print(d[i]+" ");
		}
		int count=0;
		for(int i=0;i<c.length;i++)
		{
			if(c[i]==d[i])
			{
				count++;
			}
		}
		if(count==c.length)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}

    
}
