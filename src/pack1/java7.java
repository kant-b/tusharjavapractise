package pack1;

public class java7 {

	public static void rev(String str ){

		if(str==null||str.length()<=1) {
			System.out.print(str);
		}else {
			System.out.print(str.charAt(str.length()-1));
			rev(str.substring(0, str.length()-1));
			System.out.println(str.substring(0, str.length()-1));
		}
	}

	public static void main(String[]args) {

		String str= "tushar";
		rev(str);

	}

}
