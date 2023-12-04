package Leet;

public class RoatatedSorted {
	
	private static int findMin(int[] input) {
		
		if(input==null||input.length==0)
		{
			return 0;
		}
		
		if(input.length==1)
		{
			return input[0];
		}
		
		int high = input.length-1;
		int low=0;
		int minval=Integer.MAX_VALUE;
		while(low<high)
		{
			int mid= (high+low)/2;                                      //
			
			if(input[low]<=input[mid])                      
			{
				minval=Math.min(minval, input[low]); 
				low=mid+1; 
			}
			else
			{
				minval=Math.min(minval, input[mid]);  
				high=mid-1;
			}
			
		}
		
		return minval;
		
	}
	
	public static void main(String[] args) {
//		int[] input = {5,6,1,2,3,4};
		int[] input = {1,2,3,4,5,6};
//		int[] input = {3,4,5,1,2};
//		int[] input = {4,5,2,3};
//		int[] input = {11,13,15,17};
//		int[] input = {4,5,6,7,0,1,2};
//		int[] input = {6};
		
		System.out.println(findMin(input));
		
		
		
	}

}
