package pack1;

public class java12 {

	public static void  checkstringrotation(String str1, String str2) {
		if (str1.length() != str2.length()) {
			System.out.println("Cannot validate");
		}else {
			String str3=str1.concat(str2);
			String str4=str1+null;
			//String str5=str1.concat(null);
			System.out.println(str1);
			System.out.println(str4);
			System.out.println(str3);
			//System.out.println(str5);
			if(str3.contains(str2)) {
				System.out.print("Validated that string can be rotated");
			}
		}
		

	}
	
	public static void main(String[]args) {
		checkstringrotation("hellotushar","tusharhell0");
	}

}
