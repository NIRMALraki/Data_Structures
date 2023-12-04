package Lleet.optional;

import java.util.HashMap;
import java.util.Map;

public class GoodPairs {

	private static int getGoodPairs(int[] input) {
		int ans=0;
		if(input==null || input.length<3)
		{
			return 0;
		}
		
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < input.length; i++) {
			
			int count=map.getOrDefault(input[i], 0);
			ans+=count;
			map.put(input[i], count+1);
			
		}
		
		return ans;

	}
	
	
	public static void main(String[] args) {

		
		System.out.println(getGoodPairs(new int[] {1,1,2}));
		
		
	}

}
