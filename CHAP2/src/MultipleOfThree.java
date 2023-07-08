import java.util.Scanner;

public class MultipleOfThree {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please enter the number: ");
		int number = scanner.nextInt();	// 정수를 입력받는다.
		if (number % 3 == 0) // 3으로 나눈 나머지가 0인지 검사
			System.out.println("It's a multiple of three.");
		else 
			System.out.println("It is not a multiple of 3.");
		
		scanner.close();
	}
}