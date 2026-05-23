package Week26;
import java.util.Scanner;

/**Fibonacci series*/
public class Fibonacci {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.print("Fibonacci series: ");
        for (int i = 0; i < num; i++) {
            System.out.print(fibonacci(i) + " ");
        }

    }
    public static int fibonacci(int n) {
        if (n == 0 ) { return 0; }
        if (n == 1) { return 1; }
        return fibonacci(n-1) + fibonacci(n-2);
    }

}
