import java.util.Arrays;

public class ArraysElementsUsingArrayClassMethods {
    public static void main(String[] args) {
        String a[]={"Learn","Coding","Gaming","Education"};
        System.out.println("toString() "+Arrays.toString(a));
        System.out.println("asList() "+Arrays.asList(a));
        int arr[][]={{10,20},{30,40}};
        System.out.println("deeptoString() "+Arrays.deepToString(arr));
    }
}
