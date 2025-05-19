public class ReverseStringUsingStringBuffer {
    public static void main(String[] args) {
        String original = "Hello, World!";
        
        // Create a StringBuffer object and reverse it
        StringBuffer sb = new StringBuffer(original);
        String reversed = sb.reverse().toString();

        System.out.println("Original String: " + original);
        System.out.println("Reversed String: " + reversed);
    }
}
