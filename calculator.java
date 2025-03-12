import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        int num1,num2,ch,cal;
        System.out.print("Enter two Numbers: ");
        Scanner r=new Scanner(System.in);
        num1=r.nextInt();
        num2=r.nextInt();
System.out.print("Select Operation: ");
ch=r.nextInt();
if(ch==1){
    cal=num1+num2;
    System.out.print("Addition: "+cal);
} else if(ch==2){
    cal=num1-num2;
    System.out.print("Subtraction: "+cal);

}else if(ch==3){
    cal=num1*num2;
    System.out.print("Multiplication: "+cal);

    }else if(ch==4){
        cal=num1/num2;
        System.out.print("Division: "+cal);
    }
}
}

