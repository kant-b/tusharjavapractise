package pack1;

public class TestException {

	public static void main(String[]args) {
		int a=10 , b=0; //MyException e= new MyException("Invalid Message");
		
		try {
			int z=a/b;
			//System.out.print(z);
			if(b<=0) {
				throw new MyException("Invalid Number");
				
			}
		}catch(MyException e){
			System.out.print(e.getMessage());
			
		}
		
	
		
		
		
		
		
	}
	
	
}
