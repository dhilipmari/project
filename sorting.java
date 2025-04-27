public class sorting {
    public static void main(String[] args) {
        int [] a={2,0,1,1,0,2,1,2,0,};
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();

        int temp=0;
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=0;j<a.length-i-1;j++)
            {
                if(a[j]>=a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();

        
    }

}
