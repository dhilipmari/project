package exam;

public class numberpramid {
        public static void main(String[] args) {
            int rows = 4; // Total number of rows
            int num = 1;
    
            for (int i = 1; i <= rows; i++) {
                // Print leading spaces
                for (int space = 1; space <= (rows - i); space++) {
                    System.out.print("  ");
                }
                // Print numbers with spacing
                for (int j = 1; j <= i; j++) {
                    System.out.print(num + "   ");
                    num++;
                }
                System.out.println(); // Move to next line
            }
        }
    }
    

