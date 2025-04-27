import java.util.Scanner;

public class stringsplit {
    //april task 1
    public static void main(String[] args) {
        /*Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE STRING:");
        String str=sc.nextLine();
        String []str2=str.split(" ");
        String str3="";
        for(int i=0;i<str2.length;i++)
        {
            String rev="";
            for(int j=str2[i].length()-1;j>=0;j--)
            {
                rev=rev+str2[i].charAt(j);
            }
            str3=str3+rev+" ";
        }
        System.out.println(str3);/* */


//april 11 task 2
        Scanner s1=new Scanner(System.in);
        System.out.println("enter the string:");
        String s=s1.nextLine();
        for(int i=0;i<s.length();i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.println(s.charAt(j));
            }
            System.out.println(" ");
            
        }
        


    }
    
}
