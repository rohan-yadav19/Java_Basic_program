import java.util.Scanner;

public class TribonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: number of terms
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();

        int first = 0, second = 1, third = 1;

        System.out.println("Tribonacci Series up to " + n + " terms:");

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");

            // Calculate next term
            int next = first + second + third;
            first = second;
            second = third;
            third = next;
        }

        sc.close();
    }
}
