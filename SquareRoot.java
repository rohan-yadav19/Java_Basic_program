import java.util.Scanner;
public class SquareRoot {
    public static void main(String[] args) {
        int n;
        System.out.print("Enter any Number: ");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();
        double m=Math.sqrt(n);
        System.out.print("Square root of "+n+" is "+m  );
    }
    
}
