package Leet;

import java.util.Arrays;

public class ProductExpectSelf {


	private static int[] getProduct(int[] input) {

		
		int[] d = {-1};
		if(input == null||input.length==0) {
			return d;
		}

		int n = input.length;
		int[] rightP = new int[n];
		int[] leftP = new int[n];
		rightP[n-1] = 1;
		leftP[0]=1;
		for(int i=1,j = n-2;j>=0&&i<=leftP.length;j--,i++) 
		{
			leftP[i] = leftP[i-1]*input[i-1];
			rightP[j] = rightP[j+1]*input[j+1];
			rightP[i]= rightP[i]*leftP[i];
			
		}
		return rightP;
	}
	
	public static void main(String[] args) {
		
		int[] input= {1,2,3,4};
//		int[] input= {1,2,3};
		System.out.println(Arrays.toString(getProduct(input)));
	}

}
