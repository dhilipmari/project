import java.util.Scanner;

public class accending {



    public static void sortItems(int[] arr, int n) {
        int low = 0, mid = 0, high = n - 1;

        while (mid <= high) {
            if (arr[mid] == 0) {
                // Swap arr[low] and arr[mid]
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++; // Move forward if the value is 1
            } else {
                // Swap arr[mid] and arr[high]
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--; // Move high pointer backward
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt(); // Read size of array
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt(); // Read elements
        }

        sortItems(arr, n);

        // Print sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
        scanner.close();
    }
}

        
    


