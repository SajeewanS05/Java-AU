import java.util.Scanner;

public class SquareCubeRoot {
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
    	
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();
        double squareRoot = Math.sqrt(number);
        double cubeRoot = Math.cbrt(number);
        System.out.println("The square root of " + number + " is " + squareRoot);
        System.out.println("The cube root of " + number + " is " + cubeRoot);
        scanner.close();
    }
}