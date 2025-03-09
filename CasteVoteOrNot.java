import java.util.Scanner;
public class CasteVoteOrNot {
   public static void main(String[] args) {
    int age;
    System.out.print("Enter your age: ");
    Scanner r=new Scanner(System.in);
    age=r.nextInt();
    if(age>=18){
        System.out.print("You are eligible for cast vote.");
    }else{
        System.out.print("You are not eligible for cast vote.");
    }
   } 
}
