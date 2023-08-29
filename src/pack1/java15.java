package pack1;

public class java15 {

	public static void printsubstr(String str) {

		for (int i = 0; i < str.length(); i++) {
			for (int j = i+1; j <= str.length(); j++) {
				System.out.println(str.substring(i, j));
			}
		}
	}
	
	public static void main(String[]args) {
		printsubstr("google") ;
	}

}
