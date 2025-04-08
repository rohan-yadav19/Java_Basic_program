import java.util.Scanner;

public class LengthOfArray {
   public static void main(String[] args) {
    int a[]=new int[5];
    Scanner r=new Scanner(System.in);
    System.out.print("Enter elements in array: ");
    for(int i=0;i<a.length;i++){
        a[i]=r.nextInt();
    }
    System.out.print("Arrays Elements: ");
    for(int i=0;i<a.length;i++){
        System.out.print(a[i]+" ");
    }
    System.out.println("\nArray length: "+a.length);
   } 
}
