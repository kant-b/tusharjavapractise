package pack1;

import java.util.Arrays;

public class java8 {

	public static void IsAnagram(String str1, String str2) {
		String s1 = str1.replaceAll("//s", "");
		String s2 = str2.replaceAll("//s", "");
		boolean status = true;
		if (s1.length() != s2.length()) {
			status = false;
		} else {
			char[] ch1 = s1.toLowerCase().toCharArray();
			char[] ch2 = s2.toLowerCase().toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			Arrays.equals(ch1, ch2);

		}
		
		if(status) {
			System.out.print(s1+" "+ s2 +" is Anagram ");
			
		}else {
			System.out.print(s1+" "+s2+" not Anagram");
			}

	}
	
	public static void main(String[]args) {
		String str1="Ana";
		String str2="anah";
		 IsAnagram( str1,  str2);
	}
	
	

}
