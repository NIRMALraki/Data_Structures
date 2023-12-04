package Leet;

import java.util.Arrays;
import java.util.HashMap;

public class LenOfCycle {

	private static int findLen(int[] input, int startind) {

		
		
		if(input==null)
		{
			return 0;
		}
		int temp = startind;
		HashMap<Integer, Integer> result = new HashMap<>();

		while ( temp< input.length) {

			result.put(temp, input[temp]);
			
			if (result.containsKey(input[temp]))
			{
				return result.size()-input[temp]+startind;
			}

			temp = input[temp];

			
			if (result.size() == input.length)
			{

				return 0;

			}

		}

		return 0;

	}

	public static void main(String[] args) {

		int[] input = {1,4,5,2,5,0,0};
		
//		int[] input = {1, 4, 5, 2, 5, 0, 0};
//		int[] input = {1,2,3,1};
//		int[] input = {2,3,0};
		
		
		System.out.println(findLen(input, 1));
		
		//{1,2,1) 0

	}

}
