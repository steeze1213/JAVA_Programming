import java.util.Scanner;

class Grade{
	private int math, science, english;
	
	Grade(int math, int science, int english) {
		this.math = math;
		this.science = science;
		this.english = english;
	}
	
	int average() {
		return (math+science+english)/3;
	}
}

public class AverageGrade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter scores in the order of math, science, and English >>");
		int math = sc.nextInt();
		int science = sc.nextInt();
		int english = sc.nextInt();
		
		Grade me = new Grade(math, science, english);
		System.out.println("The average is "+me.average());
		
		sc.close();
	}
}