public class TrianglePattern {
   public static void main(String[] args) {
    int rows=8;
    for (int i = 0; i <=rows; i++) {
        for (int j = 1; j <=i; j++) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
    for (int i = rows-1; i>=1; i--) {
        for (int j = 1; j <=i; j++) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
   } 
}
