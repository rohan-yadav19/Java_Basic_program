
import java.util.Scanner;
public class SumOfNaturalNumber {
    public static void main(String[] args) {
        int n;
        System.out.print("Enter the number ");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        System.out.println("sum  natural number is " + sum);
    }
}
