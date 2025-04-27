package exam;
import java.util.Arrays;

public class exam3 {
    



    public static void main(String[] args) {
        int[] numbers = {3, 2, 1, 4, 6, 5, 7};

        double mean = calculateMean(numbers);
        double median = calculateMedian(numbers);
        String mode = calculateMode(numbers);
        int method = calculateMethod(numbers);
        double stdDeviation = calculateStandardDeviation(numbers, mean);

        System.out.println("Values: " + Arrays.toString(numbers));
        System.out.println("Mean: " + mean);
        System.out.println("Median: " + median);
        System.out.println("Mode: " + mode);
        System.out.println("Method (Range): " + method);
        System.out.println("Standard Deviation: " + stdDeviation);
    }

    static double calculateMean(int[] arr) {
        double sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum / arr.length;
    }

    static double calculateMedian(int[] arr) {
        int[] sorted = arr.clone();
        Arrays.sort(sorted);
        int middle = sorted.length / 2;
        if (sorted.length % 2 == 1) {
            return sorted[middle];
        } else {
            return (sorted[middle - 1] + sorted[middle]) / 2.0;
        }
    }

    static String calculateMode(int[] arr) {
        int maxCount = 0;
        boolean hasMode = false;
        int mode = 0;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == arr[i]) count++;
            }
            if (count > maxCount) {
                maxCount = count;
                mode = arr[i];
            }
        }
        for (int value : arr) {
            int count = 0;
            for (int num : arr) {
                if (value == num) count++;
            }
            if (count > 1) {
                hasMode = true;
                break;
            }
        }
        return hasMode ? String.valueOf(mode) : "None";
    }

    static int calculateMethod(int[] arr) {
        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();
        return max - min;
    }

    static double calculateStandardDeviation(int[] arr, double mean) {
        double sumSquaredDiffs = 0;
        for (int num : arr) {
            sumSquaredDiffs += Math.pow(num - mean, 2);
        }
        return Math.sqrt(sumSquaredDiffs / arr.length); // population standard deviation
    }
}

    

