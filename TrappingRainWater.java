package Leet;

import java.util.Arrays;

public class TrappingRainWater {

	private static int getWater(int[] height) {

		if (height == null || height.length == 0) {
			return 0;
		}
		
		int[] rarray = new int[height.length];
		int max = 0, water = 0;

		
		for (int i = rarray.length - 1; i >= 0; i--) {

			if (height[i] > max) {
				max = height[i];
			}
			rarray[i] = max;

		}

		max = 0;
		for (int i = 0; i < height.length; i++) {

			if (height[i] > max) {
				max = height[i];
			}
			

			int min = Integer.min(max, rarray[i]);
			water += min - height[i];
		}

//		for (int i = 0; i < height.length; i++) {
//			int min = Integer.min(larray[i], rarray[i]);
//			water += min - height[i];
//		}

		return water;

	}
	
	

	public static void main(String[] args) {

		int[] height1 = { 3, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 3 }; // 2+3+1+2+3+2+0+1+2+1
		int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
		System.out.println(getWater(height));
	}

}
