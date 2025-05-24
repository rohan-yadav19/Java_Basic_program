// Interface with different types of methods
interface Vehicle {
    // Constant variable (public static final by default)
    int MAX_SPEED = 120;

    // Abstract method
    void start();

    // Default method
    default void stop() {
        System.out.println("Vehicle stopped.");
    }

    // Static method
    static void info() {
        System.out.println("Vehicle Interface - MAX SPEED: " + MAX_SPEED);
    }

    // Private method (for internal use only)
    private void log() {
        System.out.println("Logging vehicle operation...");
    }

    // Default method that uses a private method
    default void prepare() {
        log();
        System.out.println("Preparing vehicle...");
    }
}

// Class implementing the interface
class Car implements Vehicle {
    // Must implement the abstract method
    public void start() {
        System.out.println("Car started.");
    }

    // Optionally override default methods
    @Override
    public void stop() {
        System.out.println("Car stopped.");
    }
}

// Main class to run the program
public class InterfaceDemo {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.start();     // Abstract method implementation
        myCar.prepare();   // Default method calling private method
        myCar.stop();      // Overridden default method

        Vehicle.info();    // Static method accessed via interface name
    }
}
