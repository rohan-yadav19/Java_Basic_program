import java.util.Scanner;

public class DeleteElementFromArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Initial array size
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Position to delete
        System.out.print("Enter the index to delete (0 to " + (n - 1) + "): ");
        int pos = sc.nextInt();

        if (pos < 0 || pos >= n) {
            System.out.println("Invalid index!");
        } else {
            // Shift elements to the left
            for (int i = pos; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }

            // Print updated array
            System.out.println("Array after deletion:");
            for (int i = 0; i < n - 1; i++) {
                System.out.print(arr[i] + " ");
            }
        }

        sc.close();
    }
}
