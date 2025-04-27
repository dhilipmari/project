public class array {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};
        
        int evenCount = 0, oddCount = 0;
        int evenSum = 0, oddSum = 0;
        for (int num : a) {
            if (num % 2 == 0) {
                evenCount++;
                evenSum += num;
            } else { 
                oddCount++;
                oddSum += num;
            }
        }
        System.out.println("Count of Even Numbers: " + evenCount);
        System.out.println("Sum of Even Numbers: " + evenSum);
        System.out.println("Count of Odd Numbers: " + oddCount);
        System.out.println("Sum of Odd Numbers: " + oddSum);
       
        
    }

}
