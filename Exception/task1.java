public class task1 {
    public static void main(String[] args) {
        try{
            int a[]=new int[5];
            a[5]=20;
            System.out.println(a[5]);

        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Out of Bounds Exception");
            System.out.println(e.getMessage());
            e.printStackTrace();

        }
        finally {
            System.out.println("only use  finally block");

        }
        
        
    }
    
}
