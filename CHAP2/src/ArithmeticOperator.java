import java.util.Scanner;

public class ArithmeticOperator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);		

		System.out.print("Please enter an integer: ");
		int time = scanner.nextInt();
		int second = time % 60;
		int minute = (time / 60) % 60;
		int hour = (time / 60) / 60;
		
		System.out.print(time + "seconds is ");
		System.out.print(hour + "hour, ");
		System.out.print(minute + "minutes, ");
		System.out.println(second + "seconds.");
		scanner.close();
	}
}