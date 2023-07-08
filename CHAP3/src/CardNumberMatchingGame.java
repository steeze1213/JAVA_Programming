import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;

public class CardNumberMatchingGame {
	
	public static void main(String[] args) {
		int low, high;
		int card;
		Random r = new Random();
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			int i=0;
			low = 0;
			high = 99;	
			card = r.nextInt(100);
			System.out.println("The number has been determined. Try to guess.");
			
			while(true) {
				System.out.println(low +"-" + high);
				System.out.print(i+1+">>");
				int n=0;

				try {
					n= scanner.nextInt();
				} 
				catch(InputMismatchException e) {
					System.out.println("Only integers must be entered!!");
					scanner.nextLine();
					continue;
				}
				
				if(n>high || n<low)
					System.out.println("Out of range.");
				else {
					if(n==card) {
						System.out.println("You got it right.");
						break;
					}
					else if(n>card){
						System.out.println("Lower");
						high = n;					
					}
					else {
						System.out.println("Higher");
						low = n;									
					}
				}
				i++;
			}
			
			System.out.print("Do you want to do it again?(y/n)>>");
			if(scanner.next().equals("n"))
				break;
		}
		scanner.close();
	}
}