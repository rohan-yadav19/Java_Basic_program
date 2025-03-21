import java.util.Scanner;
public class CheckPalindrome {
    public static void main(String[] args) {
        int n,r,s=0;
        System.out.print("Enter any Number: ");
        Scanner ref=new Scanner(System.in);
        n=ref.nextInt();
       int c=n;
       while(n>0){
        r=n%10;
        s=(s*10)+r;
       n=n/10;
       }
       if(c==s){
        System.out.print("Palindrome Number");
       } else {
        System.out.print("Not a palindrome Number");
       }
    }
}
