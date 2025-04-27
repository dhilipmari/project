import java.util.Scanner;

public class str_suff {

    public static void main(String[] args) {
        
        /*/Scanner in=new Scanner(System.in);
        System.out.println("enter the first string:");
        String s1=in.next();
        System.out.println("enter the second string:");
        String s2=in.next();
        String s3="";
        for(int i=0;i<s1.length();i++)
        {
            s3=s3+s1.charAt(i)+s2.charAt(i);
            
        }
        System.out.println(s3);/* */
        String s1="ABC";
        String s2="cde";
        String s3="";
        for(int i=0;i<s1.length();i++)
        {
            s3=s3+s1.charAt(i)+s2.charAt(i);
        }
        System.out.println(s3);
        
        
    }
    
}
