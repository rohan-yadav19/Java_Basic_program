import java.util.Scanner;

public class InsertElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Initial array size
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        // Original array
        int[] arr = new int[n + 1]; // extra space for new element
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Element to insert and position
        System.out.print("Enter the element to insert: ");
        int element = sc.nextInt();
        System.out.print("Enter the position (0 to " + n + "): ");
        int pos = sc.nextInt();

        // Shift elements to the right
        for (int i = n; i > pos; i--) {
            arr[i] = arr[i - 1];
        }

        // Insert the element
        arr[pos] = element;

        // Print new array
        System.out.println("Array after insertion:");
        for (int i = 0; i <= n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
