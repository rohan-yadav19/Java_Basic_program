import java.util.Scanner;
public class CheckNumISPositiveOrNegative {
    public static void main(String[] args) {
        int n;
        System.out.print("Enter any Number: ");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();
        if(n>0){
            System.out.print("The number is positive:");
        }else if(n<0){
            System.out.print("The number is negative:");
        }else{
            System.out.print("The number is neither negative nor positive:");
        }
    }
}
