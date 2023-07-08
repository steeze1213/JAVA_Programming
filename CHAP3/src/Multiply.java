import java.util.InputMismatchException;
import java.util.Scanner;

public class Multiply {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.print("Enter two numbers to multiply>>");
			try {
				int n = scanner.nextInt();
				int m = scanner.nextInt();
				System.out.print(n + "x" + m + "=" + n*m);
				break;
			} catch(InputMismatchException e) {
				System.out.println("A real number must not be entered.");
				scanner.nextLine();
				continue;
			}
		} while(true);

		scanner.close();
	}
}