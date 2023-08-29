package pack1;

import java.util.Scanner;

public class java21 {

	public static int trailingzeros(int n) {
		int res=0;
		int powof5=5;
		
		while(n>=powof5) {
			res=res+n/powof5;
			powof5=powof5*5;
		}
		return res;
	}
	
	public static void main(String[]args) {
		try (Scanner scn = new Scanner(System.in)) {
			int n= scn.nextInt();
			System.out.print(trailingzeros(n));
		}
	}
}
