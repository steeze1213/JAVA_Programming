import java.util.Scanner;

public class ContinueExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter 5 integers.");
		int sum=0;
		for(int i=0; i<5; i++) {
			int n = scanner.nextInt();
			if(n <= 0)
				continue;
			else
				sum += n;
		}
		System.out.println("The sum of the positive numbers is " + sum);
		
		scanner.close();
	}
}