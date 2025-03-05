
import java.util.Scanner;
public class CharPrint {
    public static void main(String[] args) {
        char ch;
        System.out.print("please Enter Character ");
        Scanner r=new Scanner(System.in);
        ch=r.next().charAt(0);
        System.out.print(ch);
    }
}
