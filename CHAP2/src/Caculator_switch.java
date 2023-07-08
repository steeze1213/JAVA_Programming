import java.util.Scanner;
public class Caculator_switch {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("calculation>>");
		int op1=s.nextInt();
		String op=s.next();
		int op2=s.nextInt();
		int res=0;
		switch(op) {
			case "+":
				res=op1+op2;
			break;
			case "-":
				res=op1*op2;
			case "*":
				res=op1*op2;
			case "/":
				if(op2==0) {
					System.out.print("Can't be divided by 0.");
					s.close();
				}
				res=op1/op2;
				break;
			default:
				System.out.print("Not the four fundamental arithmetic operations.");
				s.close();
				break;
		}
		System.out.print(op1+op+op2+" Calculation Result "+res);
		s.close();
	}
}