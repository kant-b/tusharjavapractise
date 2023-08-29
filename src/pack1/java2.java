package pack1;

import java.util.HashMap;
import java.util.Map;

public class java2 {

	@SuppressWarnings("rawtypes")
	public static void countoccurence(String str) {

		@SuppressWarnings({ "unchecked" })
		Map<Character, Integer> map = new HashMap();
		char[] ch = str.toCharArray();
		for (char c : ch) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}

		}

		for (Map.Entry entry : map.entrySet()) {
			System.out.println(entry.getKey() + "->> " + entry.getValue());
		}

	}

	public static void main(String[] args) {
		String str = "google";
		countoccurence(str);

	}

}
