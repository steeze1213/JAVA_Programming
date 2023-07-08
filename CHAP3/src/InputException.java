import java.util.Scanner;
import java.util.InputMismatchException;

public class InputException {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter 3 integers.");
		int sum=0, n=0;
		for(int i=0; i<3; i++) {
			System.out.print(i+">>");
			try {
				n = scanner.nextInt();
			}
			catch(InputMismatchException e) {
				System.out.println("It is not an integer. Please enter again!");
				scanner.next();
				i--;
				continue;
			}
			sum += n;
		}
		System.out.println("The sum is " + sum);
		scanner.close();
	}
}