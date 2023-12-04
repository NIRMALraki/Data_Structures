package Leet;

public class StairCase {
	
	public static int getWays(int n) {
		
		
		if(n==1 || n==2 || n==0)
		{
			return n;
		}
		
		int a=1;
		int b=2;
		int c=4;
		int result=0;
		
		if(n==3)
		{
			return c;
		}
		for (int i = 3; i<n; i++) {
			result=a+b+c;
			a=b;
			b=c;
			c=result;
			
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(getWays(5));
	}

}
