import java.util.Scanner;
public class CheckPrimeNumberOrNot {
    public static void main(String[] args) {
        int n,count=0;
        System.out.print("Enter any Number: ");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();
        for(int i=1;i<=n;i++){
       if(n%i==0){
        count++;
       }
        }
        if(count==2){
            System.out.print("Prime Number");
        } else {
            System.out.print("Not Prime Number");
        }
    }
}
