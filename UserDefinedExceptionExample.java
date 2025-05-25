// User-defined Exception Class
class InvalidAgeException extends Exception {
    // Constructor
    public InvalidAgeException(String message) {
        super(message);
    }
}

// Main Class
public class UserDefinedExceptionExample {

    // Method to check age
    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            // Throwing user-defined exception
            throw new InvalidAgeException("Age is less than 18. Not eligible to vote.");
        } else {
            System.out.println("Eligible to vote.");
        }
    }

    // Main Method
    public static void main(String[] args) {
        try {
            // Test with invalid age
            checkAge(16);
        } catch (InvalidAgeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        try {
            // Test with valid age
            checkAge(20);
        } catch (InvalidAgeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
