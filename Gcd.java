package Leet;

public class Gcd {
	
	public static int getGCD(int a, int b){
		
		int temp;
		
		if(a==0||b==0)
		{
			return a+b;
		}
		
		while(b!=0)
		{
			
			temp=b;
			b= a%b;
			a=temp;
		}
		
		return a;

	}
	
	public static void main(String[] args) {
		
		System.out.println(getGCD(2,3));
		
	}

}
