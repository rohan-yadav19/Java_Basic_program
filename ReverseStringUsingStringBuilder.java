public class ReverseStringUsingStringBuilder {
    public static void main(String[] args) {
        String original = "OpenAI GPT-4";
        
        // Create a StringBuilder object and reverse it
        StringBuilder sb = new StringBuilder(original);
        String reversed = sb.reverse().toString();

        System.out.println("Original String: " + original);
        System.out.println("Reversed String: " + reversed);
    }
}
