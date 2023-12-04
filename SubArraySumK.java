package Leet;

import java.util.HashMap;
import java.util.Map;

public class SubArraySumK {
	
	private static int getMinArray(int target, int[] nums) 
	{
		
			int count=0;
				
			
			for (int i = 0; i < nums.length; i++) {
				int sum=0;
				for (int j = i; j <nums.length; j++) {
						sum+=nums[j];
						if(sum==target)
						{
							count++;
							
						}
				}
				
			}
			
			return count;
	}
	private static void getMinArrayOpti(int target, int[] nums) {

		HashMap<Integer,Integer> map = new HashMap<>();
		int sum=0;
		int count=0;
		map.put(0, 1);
		for (int i = 0; i < nums.length; i++) {
			sum+=nums[i];
			int x =sum-target;
//				if(x==0)
//				{
//					count++;
//				}
//				
//				System.out.println(count);
			count+=map.getOrDefault(x,0);
			System.out.println(map.getOrDefault(0, 0));

				map.put(sum, map.getOrDefault(sum, 0)+1);
		}
		System.out.println(map);
		System.out.println(count);
		
	}
	
	
	public static void main(String[] args) {
		
		int input[]= {1,1,1};
		int target=1;
		
//		System.out.println(getMinArray(target, input));
		getMinArrayOpti(target, input);
	}

}
