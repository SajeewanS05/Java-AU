import java.util.Scanner;

public class lucky {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number : ");
		
		int number = sc.nextInt();
		int lucky = number % 7;
		if (lucky == 0) {
			System.out.println (number + " is a lucky number.");
		}else {
			System.out.println(number + " is not a lucky number.");
		}

	}

}
