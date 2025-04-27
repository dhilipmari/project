class ValueNotAcceptableException extends Exception {
    public ValueNotAcceptableException(String message) {
        super(message);
    }
}
// Define a custom exception
public class CustomExceptionDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = a + b;
        try {
            if (c > 20) {
                throw new ValueNotAcceptableException("Value of c is not acceptable: c = " + c);
            } else {
                System.out.println("Value of c is acceptable: c = " + c);
            }
        } catch (ValueNotAcceptableException e) {
            System.out.println("Custom Exception Caught: " + e.getMessage());
        }

        
    }
}
