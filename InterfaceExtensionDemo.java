// Base interface
interface Animal {
    void eat();
}

// Extended interface
interface Bird extends Animal {
    void fly();
}

// Class implementing the extended interface
class Eagle implements Bird {
    public void eat() {
        System.out.println("Eagle eats meat.");
    }

    public void fly() {
        System.out.println("Eagle flies high.");
    }
}

// Main class
public class InterfaceExtensionDemo {
    public static void main(String[] args) {
        Eagle eagle = new Eagle();
        eagle.eat(); // from Animal interface
        eagle.fly(); // from Bird interface
    }
}
