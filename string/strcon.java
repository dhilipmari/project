import java.util.Scanner;

public class strcon {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the string:");
        String s=sc.next();
        int vow=0,cons=0;
        for(int i=0;i<s.length();i++)
        {
          if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u' )
            vow=vow+1;

           else{
            cons=cons+1;

           } 
        }
        System.out.println("number of vowels ="+vow);
        System.out.println("number of consonents ="+cons);
          
          
        
    }
    
}
