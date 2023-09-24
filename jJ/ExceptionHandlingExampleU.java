// Custom exception class
class MyCustomException extends Exception {
    public MyCustomException(String message) {
        super(message);
    }
}

// Class to perform some operation and throw the custom exception
class MyOperation {
    public void performOperation(int value) throws MyCustomException {
        if (value < 0) {
            throw new MyCustomException("Value cannot be negative.");
        }
        // Perform your operation here
        System.out.println("Operation completed successfully.");
    }
}

// Main class to demonstrate exception handling
public class ExceptionHandlingExampleU {
    public static void main(String[] args) {
        MyOperation operation = new MyOperation();
        int input = -5;

        try {
            operation.performOperation(input);
        } catch (MyCustomException e) {
            System.out.println("Custom Exception Caught: " + e.getMessage());
        } finally {
            System.out.println("This block will always execute.");
        }
    }
}
