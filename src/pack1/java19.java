package pack1;

import java.util.HashSet;

public class java19 {

	public static void removedup(String[]arr) {
		
		HashSet<String> set= new HashSet<>();
		for(int i=0;i<arr.length;i++) {
			set.add(arr[i]);
			System.out.print(arr[i]+" ");
		}
		//return arr[i];
		System.out.println(set);
	}
	
	public static void main(String[]args) {
		String[]arr= {"Delhi","Blore","Blore","Hyd"};
		removedup(arr);
	}
	
	
}
