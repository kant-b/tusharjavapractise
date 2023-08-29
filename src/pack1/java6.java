package pack1;

public class java6 {

	public static void segregate(int[]arr) {

      int count=0;
      for(int i=0;i<arr.length;i++) {
    	 if( arr[i]==0) {
    	  count++;
    	  //System.out.print(count);
    	  }
    	}
      
      System.out.print(count+" ");
      
      
      for(int i=0;i<count;i++) {
    	  arr[i]=0;
      }
      for(int i=count;i<arr.length;i++) {
    	  arr[i]=1;
      }
      
     }
	public static void print(int[]arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
	
	public static void main(String[]args) {
		
		int[]arr= {1,0,1,0,1,0,1,0};
		segregate(arr);
		print(arr);
		
		
	}
	
	
	
}
