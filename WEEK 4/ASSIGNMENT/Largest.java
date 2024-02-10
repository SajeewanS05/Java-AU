import java.util.Scanner;

public class Largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		System.out.println("Enter first number");
		
		int num1 = sc.nextInt();
		System.out.println("Enter second number");
		int num2 = sc.nextInt();
		int c = (num1 > num2)? num1 : num2;
		System.out.println("Largest number is "+c);
		
	}

}
