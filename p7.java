public class p7 {
    public static void main (String[]args){
        int row=4;
        int sp=2*row-2;
        for(int i=1;i<=row;i++){
            int a=i;
            for(int j=1;j<=sp;j++){
                System.out.print( " ");
              
            }
            sp=sp-2;
            for(int k=1;k<=i;k++){
                System.out.print(a+" ");
                a *=i;
            }
            System.out.println();

        }
    }    

}
