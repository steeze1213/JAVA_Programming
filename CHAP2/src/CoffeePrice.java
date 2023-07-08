import java.util.Scanner;

public class CoffeePrice {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("What coffee would you like? ");
		String order = scanner.next();
		int price=0;
		switch (order) {
			case "Espresso":
			case "Cappuccino":
			case "Cafe latte":
				price = 3500;
				break;
			case "아메리카노" :
				price = 2000;
				break;
			default:
				System.out.println("Not on the menu!");
		}
		if(price != 0)
			System.out.print(order + " is " + price + "won.");
		scanner.close();
	}
}