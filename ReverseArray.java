import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        int a[]=new int[5];
        Scanner r=new Scanner(System.in);
        System.out.print("Enter Elements in Array: ");
        for(int i=0;i<5;i++){
            a[i]=r.nextInt();
        }
        System.out.print("Array Elements: ");
        for(int i=0;i<5;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println("");
        System.out.print("Reverse Array Elements: ");
        for(int i=5-1;i>=0;i--){
            System.out.print(a[i]+" ");
        }
    }
}
