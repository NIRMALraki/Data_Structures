package Leet;

public class MinSubArraySumLen {

	private static int getMinArray(int target, int[] nums) 
	{
		if(nums==null||nums.length==0)
		{
			return 0;
		}
		
		int sum = 0;
		int window=0;
		int time=0;
		int len=Integer.MAX_VALUE;

		for (int i = 0; i < nums.length; i++) {
			
			sum+=nums[i];
			System.out.println(time++ +" out");
			while(sum>=target)
			{
				len= Math.min(len, i-window+1);
				sum=sum-nums[window];
				window++;
			}
			
		}
		
		return len;
			
	}
	
	public static void main(String[] args) {
		
		int input[]= {0,0,0,0,5,1};
		int target=6;
		
		System.out.println(getMinArray(target, input));
		
	}
}
