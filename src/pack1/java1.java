package pack1;

public class java1 {
	
	public static int findmissno(int[]arr,int n) {
		int total ;
		total=(n+1)*(n+2)/2;
		for(int i=0;i<n;i++) {
			total=total-arr[i];
		}
		return total;
		
	}
	
	public static void main(String... s)
    {
      	int arr[ ] = {1, 2, 4, 5, 6};
      	int n=arr.length-1;
      	int miss=findmissno(arr,n);
      	System.out.println("The number missing is : "+miss);
    }
	
	
	

}
