package Zzzz;

public class Converter {

    public  static double celsiusToFahrenheit(double c) {
       return (c * 9/5) + 32;
    }

    public static void main(String[] args) {
        double a = 15;
        double b = 23;
        double c = 56;

        try {
            System.out.printf("%.2f°C = %.2f°F\n", a,  celsiusToFahrenheit(a));
            System.out.printf("%.2f°C = %.2f°F\n", b,  celsiusToFahrenheit(b));
            System.out.printf("%.2f°C = %.2f°F\n", c,  celsiusToFahrenheit(c));
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter number format value");
        }

    }

}
