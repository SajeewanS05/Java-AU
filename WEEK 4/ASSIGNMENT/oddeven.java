import java.util.Scanner;

public class oddeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number : ");
		int number = sc.nextInt();
		int Number = number % 2;
		if (Number == 0 ) {
			System.out.println(number + " is a Even number");
		}else {
			System.out.println(number + " is a Odd number");
		
		}
		
		
	}

}
