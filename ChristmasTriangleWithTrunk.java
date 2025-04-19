import java.util.Scanner;

public class ChristmasTriangleWithTrunk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows for the Christmas Triangle: ");
        int rows = sc.nextInt();

        System.out.println("\nChristmas Tree:\n");

        // Print the triangle (tree top)
        for (int i = 1; i <= rows; i++) {
            // Print spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Print the trunk
        int trunkWidth = rows / 2;
        if (trunkWidth % 2 == 0) trunkWidth++; // Make sure trunk is odd width for symmetry

        int trunkHeight = rows / 3;
        if (trunkHeight < 1) trunkHeight = 1;

        for (int i = 0; i < trunkHeight; i++) {
            // Print spaces to center the trunk
            for (int j = 1; j <= rows - trunkWidth / 2 - 1; j++) {
                System.out.print(" ");
            }

            // Print the trunk
            for (int k = 1; k <= trunkWidth; k++) {
                System.out.print("|");
            }

            System.out.println();
        }

        sc.close();
    }
}

