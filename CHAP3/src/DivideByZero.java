import java.util.Scanner;

public class DivideByZero {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int dividend;
		int divisor;
		
		System.out.print("Enter how many numbers you want to divide:"); 
		dividend = scanner.nextInt();
		System.out.print("Please enter a number to divide:"); 
		divisor = scanner.nextInt();
		System.out.println("If you divide "+dividend+" by "+ divisor + ", the share is "
				 + dividend/divisor);
		scanner.close();
	}
}