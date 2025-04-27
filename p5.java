public class p5 {
    public static void main(String[] args) {
        int row=5;
        int sp=2*row-2;
        for(int i=1;i<=row;i++){
            for(int k=1;k<=sp;k++){
                System.out.print(" ");
            }
            sp=sp-2;
            for( int j=1;j<=i;j++){
                System.out.print("* ");

            }
            System.out.println();
        }
    }

}
