package WeekSixteen;

public class AdmissionProcessor {

    public static String reverse(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = s.length()-1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String name1 = "Hello";
        String name2 = "Java";
        String name3 = "hello";

        System.out.println(reverse(name1));
        System.out.println(reverse(name2));
        System.out.println(reverse(name3));
    }
}
