package pack1;

public class java17 {

	public static void findleader(int [] arr) {
		
		for(int i=0;i<arr.length;i++) {
			boolean IsLeader= true;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]>=arr[i]) {
					IsLeader=false;
					break;
				}
			}
			if(IsLeader==true) {
				System.out.print(arr[i]+" ");
			}
		}
		
		
		
	}
	
	public static void main(String[]args) {
		int[]arr1= new int[]{3,5,2,8,7} ;
		int[]arr= {1,2,4,3,5};
		findleader(arr);
		findleader(arr1);
	}
	
	//int[]arr= new int[]{};
	//int[]arr= {};
	//int[]arr= new int[5];
	//arr={};
	
	
}
