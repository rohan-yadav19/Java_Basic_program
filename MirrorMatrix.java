import java.util.Scanner;

public class MirrorMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input matrix dimensions
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        // Input matrix elements
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Display original matrix
        System.out.println("\nOriginal Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Display mirror matrix
        System.out.println("\nMirror Matrix (Each row reversed):");
        for (int i = 0; i < rows; i++) {
            for (int j = cols - 1; j >= 0; j--) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
