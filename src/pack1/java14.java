package pack1;

import java.util.HashMap;
import java.util.Map;

public class java14 {

	public static void firstnonrepeatedchar(String str) {

		HashMap<Character, Integer> map = new HashMap<>();
		char[] ch = str.toCharArray();
		for (char c : ch) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " -->>" + entry.getValue());
			if (entry.getValue() == 1) {
				System.out.println("First non repeated char is " + entry.getKey());
			} else {
				System.out.println("Nonrepeated char " + entry.getKey());
			}
		}

	}
	public static void main(String[]args) {
		firstnonrepeatedchar("utter");
	}
}
