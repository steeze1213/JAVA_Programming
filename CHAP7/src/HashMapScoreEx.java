import java.util.*;
public class HashMapScoreEx {
	public static void main(String[] args) {

		HashMap<String, Integer> scoreMap = new HashMap<String, Integer>();
		
		scoreMap.put("Kim Sung Dong", 97); 
		scoreMap.put("Hwang Gi-tae", 88); 
		scoreMap.put("Kim Namyoon", 98);
		scoreMap.put("Lee Jae-moon", 70);		
		scoreMap.put("Han Won-sun", 99);
		
		System.out.println("Number of elements in HashMap: " + scoreMap.size());
		
		Set<String> keys = scoreMap.keySet();
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			String name = it.next();
			int score = scoreMap.get(name);
			System.out.println(name + ": " + score);
		}
	}
}