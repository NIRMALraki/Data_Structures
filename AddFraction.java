package Leet;

import java.util.Arrays;

public class AddFraction {
	
	public static int[] add(int[] a, int[]b) {

		if(a==null||b==null)
		{
			return new int[]{0,0};
		}
		
		int[] result = {0,0};
		int temp;
		int x=0,y=0;
		
		result[0] = a[0]*b[1] + b[0]*a[1];
		result[1] = a[1]*b[1];
		
		if(result[0]!=result[1]) {
			x=result[0];
			y=result[1];
			while(y!=0)  //x=8 y=12
			{
				temp=y;    //  temp=12      temp=4
				y=x%y;     //y=8%12=4        12%4=0
						
				x=temp;		// x=12				x=4
			}
			
			result[0]=result[0]/x;
			result[1]=result[1]/x;
			
			return result;
		
		}
		else
		{
			result[0]=1;
			result[1]=1;
			return result;
		}
		
	}
	
	public static void main(String[] args) {
		
		int[] result= add(new int[]{1,2},new int[] {1,6});
		
		System.out.println(Arrays.toString(result));
		
	}

}
