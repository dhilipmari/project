public class compare {
    public static void main(String[] args) {
        
        char c[]= {'H','e','l','l','o'};
		int vowel=0,cons=0;
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+" ");
		}
		System.out.println();
		
		for(int i=0;i<c.length;i++)
		{
			if((c[i]=='a')||(c[i]=='A'))
			{
				System.out.println(c[i]);
				vowel++;
			}
			else if((c[i]=='e')||(c[i]=='E'))
			{
				System.out.println(c[i]);
				vowel++;
			}
			else if((c[i]=='i')||(c[i]=='I'))
			{
				System.out.println(c[i]);
				vowel++;
			}
			else if((c[i]=='o')||(c[i]=='O'))
			{
				System.out.println(c[i]);
				vowel++;
			}
			else if((c[i]=='u')||(c[i]=='U'))
			{
				System.out.println(c[i]);
				vowel++;
			}
			else
			{
				cons++;
			}
		}
		
		System.out.println("No.of Vowels="+vowel);
		System.out.println("No.of Cons="+cons);
    }
    
}
