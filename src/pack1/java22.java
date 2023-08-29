package pack1;

import java.util.Scanner;

public class java22 {

	public static int factorialusingrecursion(int n) {

		if (n == 0 || n == 1) {
			return 1;
		}
		return n * factorialusingrecursion(n - 1);

	}
	
	public static void main(String[]args) {
		try (Scanner scn = new Scanner(System.in)) {
			int n= scn.nextInt();
			System.out.print(factorialusingrecursion(n));
		}
	}
}
