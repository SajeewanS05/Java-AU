import java.util.Scanner;

public class Year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the month as integer :");
		int month =sc.nextInt ();
		System.out.println("Enter the year as integer :");
		int year =sc.nextInt ();
		
		boolean leapyear =
				(year % 4 == 0 && year % 100 != 100) || (year % 400 ==0);
		
		switch (month) {
		case 1 :
			System.out.println("January "+ year + " had 31 days");
			break;
		case 2 : 
			System.out.println("Febuary "+ year + " had " + ((leapyear)?"29 days":"28 days"));
			break;
		case 3 :
			System.out.println("March "+ year + " had 31 days");
			break;
		case 4 : 
			System.out.println("April " + year +  "had 30 days");
			break;
		case 5 :
			System.out.println("May " + year + " had 31 days");
			break;
		case 6 :
			System.out.println("June " + year + " had 30 days");
			break;
		case 7 :
			System.out.println("July " + year + " had 31 days");
			break;
		case 8 :
			System.out.println("August " + year + " had 31 days");
			break;
		case 9 :
			System.out.println("September " + year + " had 30 days");
			break;
		case 10 :
			System.out.println("Octomber " + year + " had 31 days");
			break;
		case 11 :
			System.out.println("November " + year + " had 30 days");
			break;
		case 12 :
			System.out.println("December " + year + " had 31 days");
			break;
		
		default :
			System.out.println("SORRY ! PLEASE DO ENTER A VALID VALUE WITHIN THE SPACE");
			
		}
	}

}
