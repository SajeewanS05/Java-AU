import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a base number: ");
        double base = scanner.nextDouble();
        System.out.print("Enter an exponent: ");
        double exponent = scanner.nextDouble();
        double result = Math.pow(base, exponent);
        System.out.println("The result of raising " + base + " to the power of " + exponent + " is " + result);
        scanner.close();
    }
}