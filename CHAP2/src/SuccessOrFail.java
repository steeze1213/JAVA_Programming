import java.util.Scanner;

public class SuccessOrFail {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please enter your score: ");
		int score = scanner.nextInt();
		if (score >= 80)
			System.out.println("Congratulations! You passed.");
		
		scanner.close();
	}
}