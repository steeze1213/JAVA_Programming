import java.util.Scanner;

class Reservation {	
	Seat SeatObjArray[];
	String[] seatlevel = {"S","A","B"};

	Scanner sc = new Scanner(System.in);
		
	Reservation() {
		SeatObjArray  = new Seat[seatlevel.length];
		for(int i=0; i<SeatObjArray.length; i++) {
			SeatObjArray[i] = new Seat();
		}
	}
	void reservation() {
		System.out.print("Classification of seats S(1), A(2), B(3) >> ");
		int input = sc.nextInt();
		System.out.print(seatlevel[input-1]+">> "); 
		SeatObjArray[input-1].show();
		
		System.out.print("Name >> ");
		String name = sc.next();
		System.out.print("Number >> ");
		int number = sc.nextInt();
		
		SeatObjArray[input-1].Set(name, number);
	}
	void check() {
		for(int i=0; i<SeatObjArray.length; i++) {
			System.out.print(seatlevel[i]+">> ");
			SeatObjArray[i].show();
		}
		System.out.println();
		System.out.println("<<<Inquiry completed.>>>");
		System.out.println();
	}
	void cancel() {
		System.out.print("Seat S:1, A:2, B:3>>");
		int input = sc.nextInt();
		
		System.out.print(seatlevel[input-1]+">> ");
		SeatObjArray[input-1].show();
		
		System.out.print("Name >> ");
		String name = sc.next();
		
		boolean getName = SeatObjArray[input-1].reset(name);
		
		if(!getName) System.out.println("Information does not exist.");
	}
	void Run() {
		int input;
		
		while (true) {
			System.out.print("Reservation:1, Inquiry:2, Cancellation:3, End it:4 >> ");
			input = sc.nextInt();
			
			switch(input) {
			case 1 : reservation(); break;
			case 2 : check(); break;
			case 3 : cancel(); break;
			case 4 : System.out.println("Exit the program."); return;
			default : System.out.println("You have entered the wrong one.");
			}
		}
	}
}

class Seat {
	final int SEAT_NUM = 10;
	String[] seat = new String[SEAT_NUM];
	
	Seat() {
		for(int i=0; i<seat.length; i++) 
			seat[i] = "---";
	}
	void show() {
		for(int i=0; i<seat.length; i++)
			System.out.print(seat[i]+" ");
		System.out.println();
	}
	void Set(String name, int number) {  
		seat[number-1] = name;
	}
	boolean reset(String input) {
		for(int i=0; i<seat.length; i++) {
			if(seat[i].equals(input)) {
				seat[i] = "----";
				return true;
			}
		}
		return false;
	}
}

public class ConcertReservationSystem {
	public static void main(String[] args) {
		
		System.out.println("It's a reservation system for the luxury concert hall.");
		Reservation r = new Reservation();
		r.Run();
	}
}