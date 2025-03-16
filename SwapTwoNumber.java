import java.util.Scanner;
public class SwapTwoNumber {
    public static void main(String[] args) {
        int a,b,temp;
        System.out.print("Enter two Numbers: ");
        Scanner r=new Scanner(System.in);
        a=r.nextInt();
        b=r.nextInt();
        System.out.print("Before swapping:"+ a+" "+b);
        temp=a;
        a=b;
        b=temp;
        System.out.print("\nAfter swapping:"+ a+" "+b);
    }
}
