package pack1;

import java.util.HashSet;

public class java10 {

	public static void uniquechar(String str) {

		HashSet<Character> set = new HashSet<Character>();
		char[] ch = str.toCharArray();
		for (char c : ch) {
			set.add(c);
		}
		if (set.size() == str.length()) {
			System.out.print(true);
		} else {
			System.out.print(false);
		}

	}
	public static void main(String[]args) {
		uniquechar("abc");
	}

}
