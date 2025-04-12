import java.util.Scanner;

public class AverageOfArrayElements {
    public static void main(String[] args) {
        int a[]=new int[5];int sum=0;double avg;
        Scanner r=new Scanner(System.in);
        System.out.print("Enter Elements in Array: ");
        for(int i=0;i<a.length;i++){
            a[i]=r.nextInt();
        }
        System.out.print("Array Elements: ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        for(int i=0;i<a.length;i++){
            sum=a[i]+sum;
        }
        avg=sum/5;
        System.out.print("\nAverage of Array Elements: "+avg);
    }
}