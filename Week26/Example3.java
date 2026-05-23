package Week26;

public class Example3 {
    public static void main(String[] args) {
        System.out.println("Sum: " + sumOfDigits(1234));
    }
    public static int sumOfDigits(int number) {
      if (number < 10) { return number; }
      return (number % 10) + sumOfDigits(number / 10);
    }
}
