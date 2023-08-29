package pack1;

import java.util.HashMap;
import java.util.Map;

public class java3 {

	@SuppressWarnings({ "unused" })
	public static void lengthoflongestsubstring(String str) {

		String longestSubString = null;
		int LengthofLongestSubString = 0;
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		char[] arr = str.toCharArray();
		for(int i=0;i<arr.length;i++) {
			char ch=arr[i];
		if(!map.containsKey(ch)) {
				map.put(ch, i);
			}else {
				i=map.get(ch);
				map.clear();
			}
		if(map.size()>LengthofLongestSubString) {
			LengthofLongestSubString=map.size();
			longestSubString=map.keySet().toString();
			System.out.println(LengthofLongestSubString);
			System.out.println(longestSubString);
		}
		}
	}
	
	
	public static void main(String[]args) {
		lengthoflongestsubstring("abcabcbb");
	
	}

}
