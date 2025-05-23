public class ThrowThrowsExample {

    // This method declares that it may throw an exception
    static void checkAge(int age) throws ArithmeticException {
        if (age < 18) {
            // Throwing exception using 'throw'
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(15);  // This will cause an exception
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        try {
            checkAge(21);  // This will not throw exception
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
