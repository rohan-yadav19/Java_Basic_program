import java.util.Scanner;
public class AreaOfSquare {
    public static void main(String[] args) {
        int side,area;
        System.out.print("Enter the Side of Square: ");
        Scanner r=new Scanner(System.in);
        side=r.nextInt();
        area=side*side;
        System.out.print("Area of Square: "+area );
    }
}
