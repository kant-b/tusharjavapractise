package pack1;

import java.util.Arrays;
import java.util.HashSet;

public class java9 {

	public static boolean bruteuniquechracter(String str) {

		for (int i = 0; i <= str.length() - 1; i++) {
			for (int j = i + 1; j <= str.length() - 1; j++) {
				if (str.charAt(i) == str.charAt(j)) {
					return false;
				}

			}
		}
		return true;

	}

	public static boolean effuniquechar(String str1) {
		char[] ch = str1.toCharArray();
		Arrays.sort(ch);
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == ch[i + 1]) {
				return false;
			}

		}
		return true;
	}
	
	public static boolean hashuniquechar(String str2) {
		HashSet<Character> set= new HashSet<Character>();
		for(int i=-0;i<str2.length();i++) {
			set.add(str2.charAt(i));
		}
		return set.size()==str2.length();
	}
	
	

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		String str = "abccccd";
		String str1="abc";
		if (bruteuniquechracter(str)) {
			System.out.print("unique char");
		} else {
			System.out.print(" not unique char");
		}
		
		
		

	}
	}
	
	

