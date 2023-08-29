package pack1;

public class java23 {

	@SuppressWarnings("unused")
	public static void printfibo(int n) {

		int n1 = 1, n2 = 1, n3, counter = 0;

		for (int i = 2; i < n; i++) {
			System.out.print(n1+" ");
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			counter++;
		}

	}
	public static void main(String[]args) {
		printfibo(10);
	}

}
