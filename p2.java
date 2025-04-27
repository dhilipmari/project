public class p2 {
    public static void main (String[]args){
        int row=4;
        for(int i=1;i<=row;i++){
            int a=i;
            for(int j=1;j<=i;j++){
                System.out.print (a +" ");
                a *=i;
                
            }
            System.out.println();

        }
    }    

} 
