public class str_hello {
    public static void main(String[] args) {
         String str="Hello";
        System.out.println(str);
        System.out.println(str.substring(1,4));
        System.out.println(str.charAt(3));
        System.out.println(str.substring(1,4));
        System.out.println(str);
        
       /*  * String str="ABCD";
        int key=2;
        StringBuilder r=new StringBuilder();
        for(char c:str.toCharArray()){
            char result=(char) (c+key);
            r.append(result);
        }
        System.out.println("result:"+r.toString());/* */
    }

    
}
