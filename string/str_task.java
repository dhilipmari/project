public class str_task {
    public static void main(String[] args) {
        String s="this is hello";
        String[]s2=s.split(" ");
        int s3=s2.length;//words count
        String s1=s.replaceAll("", "");
        int s4=s1.length();//space count

        System.out.println("number of words:"+s3);
        System.out.println("number of character without spaces:"+s4);



    }
    
}
