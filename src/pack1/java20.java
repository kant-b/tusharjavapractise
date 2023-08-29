package pack1;

import java.util.Scanner;

public class java20 {

	public static void factorial(int n) {
		int res=1;
		for(int i=1; i<=n;i++) {
			res=res*i;
			}
		System.out.print(res);
	}
public static void main(String[]args) {
	Scanner scn= new Scanner(System.in);
	int n=scn.nextInt();
	factorial(n);
}	
	
	
	
}
