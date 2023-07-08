import java.util.Scanner;

public class MoneyConversion {
	final static int K50000won = 50000;
	final static int K10000won = 10000;
	final static int K1000won = 1000;
	final static int K500won = 500;
	final static int K100won = 100;
	final static int K50won = 50;
	final static int K10won = 10;
	final static int K1won = 1;
	
	public static void main (String args[])  {
		int res, money;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the amount>>");
		money = scanner.nextInt();
		
		res = money/K50000won;
		money = money%K50000won;
		if(res > 0) {
			System.out.println("A 50000won bill "+ res + "sheet");
		}
		res = money/K10000won;
		money = money%K10000won;
		if(res > 0) {
			System.out.println("A 10000won bill "+ res + "sheet");
		}
		res = money/K1000won;
		money = money%K1000won;
		if(res > 0) {
			System.out.println("A 1000won bill "+ res + "sheet");
		}
		res = money/K500won;
		money = money%K500won;
		if(res > 0) {
			System.out.println("A 500won coin "+ res + "thing");
		} 
		res = money/K100won;
		money = money%K100won;	
		if(res > 0) {
			System.out.println("A 100won coin "+ res + "thing");
		}
		res = money/K50won;
		money = money%K50won;
		if(res > 0) {
			System.out.println("A 50won coin "+ res + "thing");
		}
		res = money/K10won;
		money = money%K10won;
		if(res > 0) {
			System.out.println("A 10won coin "+ res + "thing");
		}
		res = money/K1won;
		money = money%K1won;	
		if(res > 0) {
			System.out.println("A 1won coin "+ res + "thing");
		}	
		scanner.close();
	}
}