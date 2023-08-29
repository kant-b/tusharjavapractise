package pack1;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class java13 {

	public static void firstnonrepeatedstr(String str) {
		HashMap<Character , Integer>map= new HashMap<Character, Integer>();
		char[] ch= str.toCharArray();
		for(char c:ch) {
			
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}else {
				map.put(c, 1);
			}
		}
			for(Map.Entry<Character, Integer> entry:map.entrySet()) {
				System.out.println(entry.getKey()+"-->>"+entry.getValue());
				if(entry.getValue()==1) {
					System.out.println("First non repeated char is "+entry.getKey());
				}else {System.out.println("Nonrepeated char "+entry.getKey());}
			}
			
			
			
	}
	
	public static void main(String[]args) {
		firstnonrepeatedstr("google");
	}
	
	
	
}
