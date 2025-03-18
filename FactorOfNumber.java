import java.util.Scanner;
public class FactorOfNumber {
    public static void main(String[] args) {
        int n;
        System.out.print("Enter any number: ");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();
        for(int i=1;i<=n;i++){
            if(n%i==0){
               System.out.print(i+ " ");
            }
        }
    }
}
