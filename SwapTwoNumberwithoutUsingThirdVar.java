import java.util.Scanner;
public class SwapTwoNumberwithoutUsingThirdVar {
    public static void main(String[] args) {
        int a,b;
        System.out.print("Enetr two Numbers: ");
        Scanner ref=new Scanner(System.in);
        a=ref.nextInt();
        b=ref.nextInt();
        System.out.println("Before SWapping: "+a+ " " +b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After SWapping: "+a+ " " +b);
    }
}
