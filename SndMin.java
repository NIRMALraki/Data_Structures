package Leet;

import java.util.Collections;
import java.util.PriorityQueue;

public class SndMin {

	public static int find(int[] values)
	{
			for(int i=0 ; i<values.length;i++)
			{
				
				for(int j=i;j<values.length;j++)
				{
					int temp;
					if(values[i]>values[j])
					{
						temp=values[i];
						values[i]=values[j];
						values[j]=temp;
					}
				}
			}
		
		
		return values[1];
	}
	
	public static int find1(int[] values)
	{
		PriorityQueue<Integer> result = new PriorityQueue<>(Collections.reverseOrder());
		
		for (int i = 0; i < values.length; i++) {
			
			result.add(values[i]);
			if(result.size()>2)
			{
//				System.out.println(result);
				result.remove();
			}
			
			System.out.println(result);
		}
		
		
		return result.peek();
	}
	
	public static void main(String[] args) {
		
		int[] values = {2,6,5,7,8,9}; 
         
			System.out.println(find1(values));
		
	}

}
