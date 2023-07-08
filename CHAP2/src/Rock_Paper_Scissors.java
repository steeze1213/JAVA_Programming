import java.util.Scanner;

public class Rock_Paper_Scissors {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);	
		System.out.println("It's a rock-paper-scissors game. Please type in between rock, paper, scissors.");
		System.out.print("Chul-soo >> ");
		String a = scanner.next();
		System.out.print("Younghee >> ");
		String b= scanner.next();
		
		if(a.equals("Scissors")) {
			if(b.equals("Scisssors"))
				System.out.println("It's a tie.");
			else if(b.equals("Rock"))
				System.out.println("Younghee won.");
			else 
				System.out.println("Chul-soo won.");				
		}
		else if(a.equals("Rock")) {
			if(b.equals("Scissors"))
				System.out.println("Chul-soo won.");
			else if(b.equals("Rock"))
				System.out.println("It's a tie.");
			else 
				System.out.println("Younghee won.");							
		}
		else {
			if(b.equals("Scissors"))
				System.out.println("Younghee won.");
			else if(b.equals("Rock"))
				System.out.println("Chul-soo won.");
			else 
				System.out.println("It's a tie.");										
		}
		scanner.close();
	}
}