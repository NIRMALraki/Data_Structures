package Leet;

public class PowerOfTen {
	
	public static boolean find(int num)
	{
//		int temp=1;
//		System.out.println(num%10);
		if(num==1)
		{
			return true;
		}
		
		while(num>1)
		{
			
			if(num%10!=0)
			{
				return false;
			}
			num=num/10;
		}
		
		return true;
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(find(100005));
		
	}

}
