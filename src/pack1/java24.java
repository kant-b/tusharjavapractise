package pack1;

import java.util.Scanner;

public class java24 {

	public static int fibousingrecursion(int n) {
		if (n == 1 || n == 2) {
			return 1;
		} 
			return fibousingrecursion(n - 1) + fibousingrecursion(n - 2);
		
	}

	@SuppressWarnings("resource")
	public static void main(String[]args) {
		Scanner scn= new Scanner(System.in);
		int n= scn.nextInt();
		System.out.print(fibousingrecursion(n));
	}
	
	
	
}
