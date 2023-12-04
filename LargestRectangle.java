package Leet;

import java.util.Arrays;
import java.util.Stack;

public class LargestRectangle {
	
	private static int findLargestArea(int[] row) {
		
		int[] lmax= new int[row.length];
		int[] rmax = new int[row.length];
		Stack<Integer> check = new Stack<>();
		for (int i = 0; i < row.length; i++) {
			
			while(!check.isEmpty()&&row[check.peek()] >= row[i])
			{
				check.pop();
			}
			
			if(check.isEmpty())
			{
				lmax[i]= 0;
			}
			else
			{
				lmax[i]=check.peek()+1;
			}
			check.push(i);
			
		}
		
		while(!check.isEmpty())
		{
			check.pop();
		}
		
		for (int i = row.length-1; i>=0; i--) {
			
			while(!check.isEmpty()&&row[check.peek()] >= row[i])
			{
				check.pop();
			}
			if(check.isEmpty())
			{
				rmax[i]=row.length-1;
			}
			else
			{
				rmax[i]=check.peek()-1;
			}
			check.push(i);
			
		}
		
		int max=0;
		for (int i = 0; i < rmax.length; i++) {
			
			max = Math.max(max,(rmax[i]-lmax[i]+1)*row[i]);
		}
		
		return max;

	}
	
	private static int findLargestRectangle(String[][] input ) {
		
		if(input==null||input.length==0)
		{
			return 0;
		}
		
		if(input.length==1&&input[0].length==1&&input[0][0].equals("1"))
		{
			return 1;
		}
		if(input.length==1&&input[0].length==1&&input[0][0].equals("0"))
		{
			return 0;
		}
		
		
		int[] hights = new int[input[0].length];
		
		int maxArea=0,area=0;
		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j <input[0].length; j++) {
				
				if(input[i][j].equals("1")){
					hights[j]++;
				}
				else
				{
					hights[j]=0;
				}
			}
			
			area= findLargestArea(hights);
//			System.out.println(area);
			maxArea = Math.max(area, maxArea);
		}

		return maxArea;
		
	}

	public static void main(String[] args) {

		String[][] input = {{"1","0","1","0","0"},{"1","0","1","1","1"},{"1","1","1","1","1"},{"1","0","0","1","0"}};
		String[][] input1 = {{"1"}};
		System.out.println(findLargestRectangle(input));
	}

}
