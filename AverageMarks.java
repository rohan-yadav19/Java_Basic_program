import java.util.Scanner;

public class AverageMarks {
    public static void main(String[] args) {
        int a,b,c,d,e;
        System.out.print("Enter the marks of Five Subjects ");
        Scanner r=new Scanner(System.in);
        a=r.nextInt();
        b=r.nextInt();
        c=r.nextInt();
        d=r.nextInt();
        e=r.nextInt();
        int sum=a+b+c+d+e;
        System.out.println("Total Marks: " +sum);
        double Avg=sum/5;
        System.out.println("Average Marks: " +Avg);
    }
}
