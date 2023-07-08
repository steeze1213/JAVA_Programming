import java.util.Scanner;

public class MoneyConversion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] unit = { 50000, 10000, 1000, 500, 100, 50, 10, 1 };

		System.out.print("Please enter the amount>>");
		int money = sc.nextInt();

		for (int i = 0; i < unit.length; i++) {
			if (money / unit[i] != 0) {
				System.out.println(unit[i] + "won: " + money / unit[i]);
				money %= unit[i];
			}
		}
		sc.close();
	}
}