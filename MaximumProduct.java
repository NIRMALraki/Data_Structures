package Lleet.optional;

import java.util.PriorityQueue;

public class MaximumProduct {
	
	private static int getMaxProduct(int[] input) {

		if(input==null||input.length<3)
		{
			return 0;
		}
		PriorityQueue<Integer> queue = new PriorityQueue<>();
		for (int i = 0; i < input.length; i++) {
				queue.add(input[i]);
				if(queue.size()>2)
				{
					queue.remove();
				}
				
		}
		return (queue.poll()-1)*(queue.poll()-1);
		
	}

	public static void main(String[] args) {

		System.out.println(getMaxProduct(new int[] {1,1,1}));
		
		
	}

}
