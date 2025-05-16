import java.util.Scanner;

public class StringCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two strings
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        // Content comparison
        if (str1.equals(str2)) {
            System.out.println("Strings are equal (using equals()).");
        } else {
            System.out.println("Strings are NOT equal (using equals()).");
        }

        // Lexicographical comparison
        int result = str1.compareTo(str2);
        if (result == 0) {
            System.out.println("Strings are lexicographically equal (using compareTo()).");
        } else if (result < 0) {
            System.out.println("First string comes before second string lexicographically.");
        } else {
            System.out.println("First string comes after second string lexicographically.");
        }

        sc.close();
    }
}
