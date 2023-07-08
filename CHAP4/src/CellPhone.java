import java.util.Scanner;

class Phone {
	private String name, tel;
	
	Phone(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	String getName() { return name; }
	
	String getTel() { return tel; }
	
}
class PhoneBook {
	
	Scanner sc = new Scanner(System.in);
	int num ;
	Phone PhoneArray[];
	String name;
	String tel;
	
	void submit() { 
		
		System.out.print("The number of people >> ");
		this.num = sc.nextInt();
		
		PhoneArray = new Phone[num];
		
		for(int i=0; i<num; i++) {
			System.out.print("Enter name and number without spaces >> ");
			name=sc.next();
			tel=sc.next();
			
			PhoneArray[i] = new Phone(name, tel);
			
		}
		System.out.println("It's saved...");
		System.out.println();
	}	
	void Search() {
		System.out.print("Name to search >> ");
		
		String input = sc.next();
		
		while(!input.equals("Stop")) {
			int i;
			for(i=0; i<num; i++) {
				if(input.equals(PhoneArray[i].getName())) {
					System.out.println("The number of " + input + " is " + tel + ".");
					break;	
				}
			}
			if(i>=num) System.out.println(input + " does not exist.");
			
			
			System.out.print("Name to search >> ");
			input = sc.next();
		}
		System.out.println("Exit the program...");
		sc.close();
	}
}
public class CellPhone {
	public static void main(String[] args) {
		
		PhoneBook pb = new PhoneBook();
		pb.submit();
		pb.Search();
	}
}