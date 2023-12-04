package Lleet.optional;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class GoodTiplets {
	
	private static void getGoodTriplets(int[] arr, int a, int b, int c) {

		int[] triplets = new int[3];
//		Map<int[], Integer> map = new HashMap<>();
		int ans=0;
		
//		for (int i = 0; i < arr.length-3; i++) {
//			triplets[0]=arr[i];
//			triplets[1]=arr[i+1];
//			triplets[2]= arr[i+2];
//			if(Math.abs(triplets[0]-triplets[1])<=a && Math.abs(triplets[1]-triplets[2])<=b && Math.abs(triplets[0]-triplets[2])<=c)
//			{
//				System.out.println(Arrays.toString(triplets));
//				int count =map.getOrDefault(triplets, 0);
//				ans+=count;
//				map.put(triplets, ans+1);
//				
//			}
			
			
			System.out.println(ans);
			
//		}
	
		
		int i=0,j=1,k=2;
		triplets[0]=arr[i];
		triplets[1]=arr[j];
		triplets[2]= arr[k];
		
		while(i<arr.length&&j<arr.length&&k<arr.length)
		{
			
			if((Math.abs(triplets[0]-triplets[1]))>a)
			{
				i++;
			}
			else if(Math.abs(triplets[1]-triplets[2])>b)
			{
				j++;
			}
			else if(Math.abs(triplets[0]-triplets[2])>c)
			{
				k++;
			}
			else
			{
				triplets[0]=arr[i];
				triplets[1]=arr[j];
				triplets[2]= arr[k];
				System.out.println(Arrays.toString(triplets));
				i++;j++;k++;
			}
			
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getGoodTriplets(new int[] {3,0,1,1,9,7}, 7, 2, 3);
	}

}
