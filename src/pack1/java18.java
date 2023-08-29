package pack1;

public class java18 {
	
	public static void findleader(int []arr) {
		int curr_leader = arr[arr.length-1];
		System.out.print(curr_leader);
		for(int i=arr.length-2;i>=0;i--) {
			if(arr[i]>curr_leader) {
				curr_leader=arr[i];
				System.out.print(arr[i]+" ");
			}
			//System.out.print(curr_leader);
		}
		//System.out.print(curr_leader);
	}
      
	public static void main(String[]args) {
		int[]arr= {3,5,2,8,7};
		findleader(arr);
		
	}
}
