package Leet;

public class Median {
	
	private static double getMedian(int[] a, int[] b) {

		if(a==null||b==null)
		{
			return 0;
		}
			int length = a.length+b.length;
			double m;
			int i=0,j=0,k=0;
			int m1=0;
			int m2=0;
			int temp=0;
			
			
			while(i<a.length&&j<b.length&&k<=length/2)
			{ 
				m1=temp;//0 1 2
			   
				if(a[i]<b[j]) //
				{
					temp=a[i];//temp=1,2,3
						i++;
				}
				else 
				{
					temp=b[j];
						j++;
				}
				    
    				m2=temp;
				k++;
				
			}
			
			
			while(i<a.length&&k<=length/2)
			{
				m1=temp;
				temp=a[i];
				i++;
				k++;
			}
			while(j<b.length&&k<=length/2)
			{
				m1=temp; //3
				temp=b[j]; //4
				j++;
				k++;
			}
			
			m2=temp;//4
			if(length%2==0)
			{
				 m=(double)(m1+m2)/2;
			}
			else
			{
				m=m2;
			}
			return  m;		
	}
	
	private static float getMedinOptimal(int[] a, int[] b) {
		// TODO Auto-generated method stub
		
		if(a==null&&b==null||a.length==0&&b.length==0)
		{
			return 0.0f;
		}
		
		if(b.length<a.length)
		{
			getMedinOptimal(b, a);
		}
		
		int l=0,h=a.length;
		
		while(l<=h)
		{
			
			int m1=(l+h)/2;
			int m2= ((a.length+b.length+1)/2)-m1;
			
			int l1 = m1==0 ? Integer.MIN_VALUE : a[m1-1];
			int l2 = m2==0 ? Integer.MIN_VALUE : b[m2-1];
			
			int r1=  m1==a.length ? Integer.MAX_VALUE : a[m1];
			int r2 =  m2==b.length ? Integer.MAX_VALUE : b[m2];
			
			if(l1<=r2&&l2<=r1)
			{
				if((a.length+b.length)%2==0)
				{
					return (float)(Math.max(l1,l2)+Math.min(r1, r2))/2;
				}
				else
				{
					return Math.max(l1, l2);
				}
				
			}
			else if(l2>r1)
			{
				l=m1+1;
			}
			else	
			{
				h=m1-1;
			}
			
		}
		
		return 0.0f;

	}
	
	public static void main(String[] args) {
		
		//System.out.println(getMedian(new int[] {1,2,3}, new int[] {4,5,6}));
		System.out.println(getMedinOptimal(new int[] {1,3,8,17}, new int[] {5,6,7,19,21,25}));
		//duplicate elements
		
	}
	

}
