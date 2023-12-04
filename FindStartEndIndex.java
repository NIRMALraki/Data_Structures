package Lleet.optional;

import java.util.Arrays;

public class FindStartEndIndex {
	
	private static int findIndex(int[] arr,int target,boolean startindex) {

		
		int start=0,
			end=arr.length-1,
			mid=0,
			index=0;
		
		
		while(start<=end)
		{
			mid=(start+end)/2;
			
			if(arr[mid]<target)
			{
				start=mid+1;
			}
			else if(arr[mid]>target)
			{
				end=mid-1;
			}
			else 
			{
				index=mid;
				if(startindex)
				{
					end=mid-1;
					
				}
				else
				{
					start=mid+1;
				}
				
			}
		}
		return index;
	}
	
	
	private static int[] getStartEnd(int[] arr,int target) {
		if(arr==null||arr.length==0)
		{
			return new int[]{-1,-1};
		}
		
		int[] result= {0,0};
		
		result[0]=findIndex(arr, target, true);
		result[1]=findIndex(arr, target, false);
		return result;
	}
	

	public static void main(String[] args) {

		System.out.println(Arrays.toString(getStartEnd(new int[] {1,1,1,1,2,2,2,3,3,3},3)));
		
	}

}
