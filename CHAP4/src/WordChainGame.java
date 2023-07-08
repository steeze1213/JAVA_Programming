import java.util.Scanner;

public class WordChainGame {
	private Scanner scanner;
	private String startWord = "father";
	private Player[] players;
	
	public WordChainGame() {
		scanner = new Scanner(System.in);	
	}

	private void createPlayers() {
		System.out.print("How many people are participating in the game>>");
		int nPlayers = scanner.nextInt();
		players = new Player[nPlayers];
		
		for(int i=0; i<nPlayers; i++) {
			System.out.print("Please enter the name of the participant>>");
			String name = scanner.next();
			players[i] = new Player(name);
		}		
	}
	
	public void run() {
		System.out.println("Let's start the word chain game...");
		createPlayers();
		String lastWord = startWord;

		System.out.println("The word that starts is "+lastWord+ ".");
		int next =  0;
		
		while(true) {
			String newWord = players[next].getWordFromUser();
			if(!players[next].checkSuccess(lastWord)) {
				System.out.print(players[next].getName() + " lost.");
				break;
			}
			next++;
			next %= players.length;
			lastWord = newWord;
		}
	}
	
	public static void main(String[] args) {
		WordChainGame game = new WordChainGame();
		game.run();
	}
}

class Player {
	private Scanner scanner;
	private String name;
	private String word;
	
	public Player(String name) {
		this.name = name;
		scanner = new Scanner(System.in);	
	}
	
	public String getName() {return name;}
	
	public String getWordFromUser() {
		System.out.print(name+">>");
		word = scanner.next();
		return word;
	}
	
	public boolean checkSuccess(String lastWord) {
		int lastIndex = lastWord.length()-1;
		
		if(lastWord.charAt(lastIndex) == word.charAt(0))
			return true;
		else
			return false;
	}
}