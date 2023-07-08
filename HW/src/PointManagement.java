import java.util.*;

public class PointManagement {
	public static void main(String[] args) {

		HashMap<String,Integer> hm = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("** It's a point management program **");
		
		while(true) {
			System.out.print("Enter a name and point >> ");
			String name = sc.next();
			if(name.equals("Stop"))
				break;
			
			int point = sc.nextInt();
			if(hm.get(name) == null)
				hm.put(name, point);
			else
				hm.put(name, hm.get(name)+point);
			
			Set<String> keys = hm.keySet();
			Iterator<String> it = keys.iterator();
			
			while(it.hasNext()) {
				String keyName = it.next();
				Integer sum = hm.get(keyName);
				System.out.print("("+keyName+","+sum+")");
			}
			System.out.println();	
		}
		
		System.out.println("Exit the program.");
		sc.close();
	}
}