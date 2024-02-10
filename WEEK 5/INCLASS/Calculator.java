import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		int n1 , n2 ;
		
		System.out.println("Enter first number");
		n1 =sc.nextInt ();
		System.out.println("Enter second number");
		n2 =sc.nextInt ();
		System.out.println("Enter the operators +,-,*,/,%");
		char a = sc.next().charAt(0);
		switch (a) {
		case '+' :
			n1+=n2;
			System.out.println("Addition of two numbers "+n1);
			break;
		case '-' : 
			n1-=n2;
			System.out.println("Substraction of the second the number from the first number "+n1);
			break;
		case '*' :
			n1*=n2;
			System.out.println("Multiplication of two numbers "+n1);
			break;
		case '/' : 
			n1/=n2;
			System.out.println("Division of the first number by the second number "+n1);
			break;
		case '%' :
			n1%=n2;
			System.out.println("Modules of the first number by the second number "+n1);
			break;
		
		default :
			System.out.println("SORRY ! PLEASE DO ENTER A VALID VALUE WITHIN THE SPACE");
			
		}
	}

}
