package pack1;

public class java27 {

	// String name="my name is tushar";

	public static String revstr(String str) {
		
		str=str.toLowerCase();

		if (str == null || str.length()<1) {
			return str;
		}else {

		System.out.print((str.charAt(str.length() - 1)));
		return revstr(str.substring(0, str.length()-1));}

	}
	
	public static void main(String[]args) {
		
		String str="My name is Tushar";
		revstr(str);
		
	}
	

}
