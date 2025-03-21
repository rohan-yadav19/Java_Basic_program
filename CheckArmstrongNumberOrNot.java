import java.util.Scanner;
public class CheckArmstrongNumberOrNot {
    public static void main(String[] args) {
        int n,rem,arm=0;
        System.out.print("Enter any Number: ");
        Scanner ref=new Scanner(System.in);
        n=ref.nextInt();
       int  c=n;
        while(n>0){
            rem=n%10;
            arm=(rem*rem*rem)+arm;
            n=n/10;
        }
        if(c==arm){
            System.out.print("Armstrong Number");
        } else{
            System.out.print(" Not Armstrong Number");
        }
    }
}
