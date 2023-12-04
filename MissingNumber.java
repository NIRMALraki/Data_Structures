package Lleet.optional;

import java.util.Iterator;

public class MissingNumber {

	private  static void getMissingNumber(int[] input) {

		int sum=0;
				
				for (int i = 0; i < input.length; i++) {
					sum+=input[i];
				} 
		
				System.out.println(((input.length)*(input.length+1))/2-sum);
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		getMissingNumber(new int[] {3,0,1});
	}

}
