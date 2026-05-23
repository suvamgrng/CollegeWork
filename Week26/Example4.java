package Week26;
/**Reverse a string*/
public class Example4 {
    public static void main(String[] args) {
        System.out.println(reverseString("ABCD"));
    }
    public static String reverseString(String name) {
        if (name.isEmpty()) { return ""; }
        char last = name.charAt(name.length()-1);
        return last + reverseString(name.substring(0, name.length() - 1));
    }
}
