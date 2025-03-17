import java.util.Scanner;
public class checkLeapYear {
    public static void main(String[] args) {
        int y;
        System.out.print("Enter any year: ");
        Scanner r=new Scanner(System.in);
        y=r.nextInt();
        if(y%100==0 && y%400==0 || y%100!=0 && y%4==0){
System.out.print("Leap Year");
        } else{
            System.out.print("Not Leap Year");
        }
    }
}
