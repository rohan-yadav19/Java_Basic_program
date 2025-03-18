import java.util.Scanner; 
public class NumberDivisibleBy5OrNot {
    public static void main(String[] args) {
        int n;
        System.out.print("Enter any Number: ");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();
        if(n%5==0){
System.out.print("The number is divisible by 5");
        }else{
            System.out.print("The number is Not divisible by 5");
        }
    }
}
