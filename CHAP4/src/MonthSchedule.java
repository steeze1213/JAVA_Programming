import java.util.Scanner;

class Day {
	private String work;
	public void set(String work) { this.work = work; }
	public String get() { return work; }
	public void show() {
		if(work == null) System.out.println("nothing.");
		else System.out.println(work + ".");
	}
}

public class MonthSchedule {
	private int nDays; 
	private Day [] days;
	private Scanner scanner;
	
	public MonthSchedule(int nDays) {
		this.nDays = nDays;		
		this.days = new Day [nDays];
		for(int i=0; i<days.length; i++) {
			days[i] = new Day();
		}
		scanner = new Scanner(System.in);		
	}
	
	private void input() {
		System.out.print("Date(1~30)?");
		int day = scanner.nextInt();
		System.out.print("To Do (Enter Without Blank)?");
		String work = scanner.next();
		day--;
		
		if(day < 0 || day > nDays) {
			System.out.println("You entered the wrong date!");			
			return;
		}
		days[day].set(work);
	}
	
	private void view() {
		System.out.print("Date(1~30)?");
		int day = scanner.nextInt();
		day--;
		if(day < 0 || day > nDays) {
			System.out.println("You entered the wrong date!");			
			return;
		}
		System.out.print("The thing to do on the " + (day+1) + "(st, nd, rd, th) is " );
		days[day].show();
	}
	

	private void finish() {
		scanner.close();
		System.out.println("Exit the program.");
	}
	
	public void run() {
		System.out.println("Schedule management program for this month.");

		while(true) {
			System.out.print("To Do (Enter:1, View:2, Finish:3) >>");
			int menu = scanner.nextInt();
			switch(menu) {
			case 1: input(); break;
			case 2: view(); break;
			case 3: finish(); return;
			default : 
				System.out.println("You entered it incorrectly.");
			}
			System.out.println();
		}		
	}
	public static void main(String[] args) {
		MonthSchedule april = new MonthSchedule(30);
		april.run();
	}

}