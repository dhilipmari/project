public class day7 {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int[] a1={6,7,8,9,10};
        int a2[]=new int[10];
        int j=0;
        for(int i=0;i<a2.length;i=i+2)
        {
            if(j<a2.length)
            {
                a2[i]=a[j];
                a2[i+1]=a1[j];
                j++;
            }
        }
        for(int i=0;i<a2.length;i++)
        {
            System.out.print(a2[i]+",");
        }

    }
    
}
