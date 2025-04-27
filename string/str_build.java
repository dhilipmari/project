
public class str_build {
    public static void main(String[] args) {
       String str="besant";
       StringBuilder a=new StringBuilder("21");
       for(int i=0;i<str.length();i++)
       {
        a.append(str.charAt(i)).append(i+1);
       }
       System.out.println(a.toString());
       
        
     }
    }



