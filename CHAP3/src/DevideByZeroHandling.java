import java.util.Scanner;

public class DevideByZeroHandling {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print("Enter how many numbers you want to divide:"); 
			int dividend = scanner.nextInt();
			System.out.print("Please enter a number to divide:"); 
			int divisor = scanner.nextInt();
			try {
				System.out.println("If you divide "+dividend+" by "+ divisor + ", the share is "
						 + dividend/divisor);
				break;
			}
			catch(ArithmeticException e) {
				System.out.println("Can't be divided by 0! Please enter it again");
			}
		}
		scanner.close();
	}
}