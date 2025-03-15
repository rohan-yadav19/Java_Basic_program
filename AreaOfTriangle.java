 import java.util.*;
 //import java.lang.Math;
 public class AreaOfTriangle {
    public static void main(String[] args) {
        int a,b,c; double sp,area;
        System.out.print("Enter the values of sides of Triangle: ");
        Scanner r=new Scanner(System.in);
        a=r.nextInt();
        b=r.nextInt();
        c=r.nextInt();
sp=(a+b+c)/2;
area=Math.sqrt(sp*(sp-a)*(sp-b)*(sp-c));
System.out.print("Area of Triangle: "+area);
    }
}
