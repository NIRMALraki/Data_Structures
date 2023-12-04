package Leet;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    
	private static int[] findIndex(int[] input,int target) {
		
		if(input==null)
		{
			return new int[]{};
		}
			
		 Map<Integer, Integer> check = new HashMap<>();
	        for (int i = 0; i < input.length; i++) {
	            int b = target - input[i];
	            if (check.containsKey(b)) {
	                return new int[]{check.get(b), i};
	            }
	            check.put(input[i], i);
	        }
			return new int[]{};
	}
	
	
	
	public static void main(String[] args) {
		
		int[] input = {2,15,11,7};
		System.out.println(Arrays.toString(findIndex(input,9)));
//		System.out.println(Arrays.toString(findIndex(new int[]{3,2,4},6)));
		
		//return more than ]
		
	}
}
