import java.util.Arrays;

public class reversingarray {
    public static void main(String[] args) {
        

 
        int[] arr = {1, 2, 3, 4, 5};
        
        reverseArray(arr);
        
        System.out.println("Reversed Array: " + Arrays.toString(arr));
    }

    public static void reverseArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            // Swap arr[i] and arr[n-i-1]
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
    }
}

       
        


        
    
    

