import java.util.Scanner;
public class AreaOfCircle {
    public static void main(String[] args) {
         final double PI=3.14,area;
         int r;
        System.out.print("Enter the radius of circle: ");
        Scanner R=new Scanner(System.in);
        r=R.nextInt();
        area=PI*r*r;
        System.out.print("Area of Circle: "+area);

    }
    
}
