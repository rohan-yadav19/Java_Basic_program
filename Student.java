public class Student {
    String name;
    int age;

    // Default constructor
    Student() {
        name = "Unknown";
        age = 0;
    }

    // Constructor with one parameter
    Student(String n) {
        name = n;
        age = 18; // default age
    }

    // Constructor with two parameters
    Student(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Student s1 = new Student();               // Calls default constructor
        Student s2 = new Student("Alice");        // Calls 1-parameter constructor
        Student s3 = new Student("Bob", 22);      // Calls 2-parameter constructor

        s1.display();
        s2.display();
        s3.display();
    }
}
