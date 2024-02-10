import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		char a;
		
		System.out.println("Enter any letter from the alphabet " );
		a = sc.next().charAt(0);
		switch (a) {
		case 'a','e','i','o','u' : 
			System.out.println("Vowels");
			break;
		case 'A','E','I','O','U' : 
			System.out.println("Vowels in uppercase");
			break;
		default :
			System.out.println("SORRY ! PLEASE DO ENTER A VALID VALUE WITHIN THE SPACE");
			
		}
	}

}
