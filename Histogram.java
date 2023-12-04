package Leet;

import java.util.Stack;

public class Histogram {
	
	private static int findLargestRect(int[] input) {
                      
		if(input==null||input.length==0)
		{
			return 0;
		}
		
		if(input.length==1)
		{
			return input[0];
		}
		
		int len = input.length;
		int[] lmin = new int[len];
		int[] rmin = new int[len];
		
		Stack<Integer> check = new Stack<>();
		
		for (int i = 0; i < len; i++) {
			while(!check.isEmpty()&& input[check.peek()]>= input[i])
			{
				check.pop();
			}
			if(check.isEmpty())
			{
				lmin[i]=0;
			}
			else
			{
				lmin[i]=check.peek()+1; 
				
			}
			check.push(i);
		}

		while(!check.isEmpty())
		{
			check.pop();
		}
		
		for (int i =len-1; i>=0; i--) {
			while(!check.isEmpty()&& input[check.peek()]>= input[i])
			{
				check.pop();
			}
			if(check.isEmpty())
			{
				rmin[i]=len - 1;
			}
			else
			{
				rmin[i]=check.peek()-1; 

			}
			check.push(i);

		}

		int max=0;
		for (int i = 0; i <input.length; i++) {
			
			max= Math.max(max,((rmin[i]-lmin[i])+1)*input[i]);
			
		}
		
		return max;
	}
	
	public static void main(String[] args) {
//		int[] input = {2,1,5,6,2,3,1};
		int[] input = {5,1};
		System.out.println(findLargestRect(input));
	}

}
