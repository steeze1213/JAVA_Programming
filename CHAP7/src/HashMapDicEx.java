import java.util.*;
public class HashMapDicEx {
	public static void main(String[] args) {
		HashMap<String, String> dic = new HashMap<String, String>();
		
		dic.put("baby", "ah-gi");
		dic.put("love", "sa-rang"); 
		dic.put("apple", "sa-gwa");
		
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print("What word do you want to find?");
			String eng = scanner.next();
			if(eng.equals("exit")) {
				System.out.println("Termination...");
				break;
			}
			
			String kor = dic.get(eng);
			if(kor == null) 
				System.out.println(eng + "is a word that doesn't exist.");
			else
				System.out.println(kor); 
		}
		scanner.close();
	}
}