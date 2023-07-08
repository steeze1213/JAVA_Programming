import java.util.Scanner;
public class Calculator_if_else {

	public static void main(String[] args) {
		System.out.print("calculation>>");
		Scanner s=new Scanner(System.in);
		int op1=s.nextInt();
		String op=s.next();
		int op2=s.nextInt();
		
		int res=0;
		if(op.equals("+"))
			res=op1+op2;
		else if(op.equals("-"))
			res=op1-op2;
		else if(op.equals("*"))
			res=op1*op2;
		else if(op.equals("/")) {
			if(op2==0) {
				System.out.print("Can't be divided by 0.");
				s.close();
				return;
			}
			else
				res=op1/op2;
			}
		else {
			System.out.print("Not the four fundamental arithmetic operations.");
			s.close();
			return;
		}
		System.out.println(op1+op+op2+" Calculation Result "+res);
		s.close();
	}
}