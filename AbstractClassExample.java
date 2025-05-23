// Abstract class
abstract class Animal {
    // Abstract method (does not have a body)
    abstract void makeSound();

    // Concrete method
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Subclass (inherits from Animal)
class Dog extends Animal {
    // Providing implementation for abstract method
    void makeSound() {
        System.out.println("Dog barks: Woof woof");
    }
}

// Another subclass
class Cat extends Animal {
    void makeSound() {
        System.out.println("Cat meows: Meow meow");
    }
}

public class AbstractClassExample {
    public static void main(String[] args) {
        Animal a1 = new Dog();  // Polymorphism
        Animal a2 = new Cat();

        a1.makeSound();
        a1.eat();

        a2.makeSound();
        a2.eat();
    }
}
