import java.util.Scanner;

public class RockPaperScissorsGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Play Rock-paper-scissors with the computer.");
		String input;
		String str[] = {"Rock", "Paper", "Scissors"};
		
		while(true) {
			System.out.print("Rock paper scissors!>>");
			input = sc.nextLine();
			
			if(input.equals("Stop"))
				break;
			
			int r = (int)(Math.random() * 3);
			String strCom = str[r];
			
			System.out.print("User = " + input + " , Computer = " + strCom + ", ");
			
			 if(input.equals("Rock")) {
				if(strCom.equals("Rock"))
					System.out.println("It's a tie.");
				else if(strCom.equals("Paper"))
					System.out.println("The computer won.");
				else if(strCom.equals("Scissors"))
					System.out.println("User won.");
			}
			else if(input.equals("Paper")) {
				if(strCom.equals("Rock"))
					System.out.println("User won.");
				else if(strCom.equals("Paper"))
					System.out.println("It's a tie.");
				else if(strCom.equals("Scissors"))
					System.out.println("The computer won.");
			}
			else if(input.equals("Scissors")) {
				if(strCom.equals("Rock"))
					System.out.println("The computer won.");
				else if(strCom.equals("Paper"))
					System.out.println("User won.");
				else if(strCom.equals("Scissors"))
					System.out.println("It's a tie.");
			}
			else
				System.out.println("You have entered an incorrect one.");
		}
		System.out.println("End the game...");
		
		sc.close();
	}
}