import java.util.Scanner;
public class GreatestNumberAmongTwoNumber {
    public static void main(String[] args) {
        int a,b;
        System.out.print("Enter two Number ");
        Scanner r=new Scanner(System.in);
        a=r.nextInt();
        b=r.nextInt();
        if(a>b){
            System.out.print("The greates number is: " + a);
        }
else{
    System.out.println("The greatest number is: " + b);
}
    }
}
