
import java.util.Scanner;
public class countDigits {
    public static void main(String[] args) {
        int n,count=0;
        System.out.print("Enter any Number: ");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();
        while(n>0){
            n=n/10;
            count++;
        }   
        System.out.print("Number of Digits: " +count); 
    }
}
