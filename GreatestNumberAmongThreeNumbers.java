import java.util.Scanner;
public class GreatestNumberAmongThreeNumbers {
    public static void main(String[] args) {
        int a,b,c;
        System.out.print("Enter any Three Number ");
        Scanner r=new Scanner(System.in);
        a=r.nextInt();
        b=r.nextInt();
        c=r.nextInt();
        if(a>b && a>c){
            System.out.print("The Greatest Number is: " +a);
        }
        else if(b>a && b>c){
            System.out.print("The Greatest Number is: " +b);
        }
        else{
            System.out.print("The Greatest Number is: " +c);
        }
    }
}
