 
 import java.util.Scanner;
 public class CheckVowelOrConsonent {
    public static void main(String[] args) {
        char ch;
        System.out.print("Enter any Character ");
        Scanner r=new Scanner(System.in);
        ch=r.next().charAt(0);
        if(ch=='a' || ch=='e' || ch=='i'|| ch=='0'|| ch=='u'){
System.out.print("The enterd character is vowel");
        }
        else{
            System.out.print("The enterd character is Consonant");
        }
    }
}
