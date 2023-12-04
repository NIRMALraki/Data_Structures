package Leet;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

public class Practice {

	private static void getCharcount(String a) {

		int count=1;
		StringBuilder sb = new StringBuilder();
		int i ;	
		
		for (i=1; i <a.length(); i++) {
				
			if(a.charAt(i)==a.charAt(i-1))
			{
				count++;
			}
			else
			{
				sb.append(a.charAt(i-1));
				sb.append(count);
				count=1;
				
			}
			
			
		}
		
			sb.append(a.charAt(i-1));
			sb.append(count);
			System.out.println(sb.toString());
	}
	
	private static void getUniqSubstr(String input) {

			
			int count=1;
			StringBuilder out = new StringBuilder();
			int j ,max=1;
			char c=' ';int countof=0,index=0;
			
			for (j=1; j < input.length(); j++) {
				
				if(input.charAt(j)==input.charAt(j-1))
				{
					count++;
				}
				else
				{
					
					if(count>max)
					{
						max=count;
						 c=input.charAt(index);
						 countof= count;
						
					}
					count=1;
					index=j;
				}
				
			}
			
			if(max<count)
			{
				c=input.charAt(index);
				 countof= count;
			}
			
			System.out.println(c);
			System.out.println(countof);
			
			
		
	}
	
	private static void getRecurringDeci(int num,int den) {

		
			
		if(num%den==0)
		{
			System.out.println(Integer.toString(num/den));
			
		}
		StringBuilder sb = new StringBuilder();
		sb.append(num/den).append('.');
		long rem = num%den;
		Map<Long,Integer> map = new HashMap<>();
		while(rem!=0)
		{
			if(map.containsKey(rem))
			{
				sb.insert(map.get(rem),"(");
				sb.append(")");
				System.out.println(sb);
				break;
			}
			map.put(rem, sb.length());
			rem= rem*10;
			sb.append(rem/den);
			rem = rem%den;
		}
		
		System.out.println(sb);
		
	}
	
	private static void getHistogram(int[] input) {

		int len = input.length;
		int[] lmin = new int[len];
		int[] rmin = new int[len];
		
		Stack<Integer> check = new Stack<>();
		
		for (int i = 0; i < len; i++) {
			while(!check.isEmpty()&&input[check.peek()]>=input[i])
			{
				check.pop();
			}
			if(check.isEmpty())
			{
				lmin[i] =0;
			}
			else
			{
				lmin[i]= check.peek()+1;
			}
			check.push(i);
		}
		
		while(!check.isEmpty())
		{
			check.pop();
		}
		
		for (int i = len-1; i>=0; i--) {
			
			while(!check.isEmpty()&& input[check.peek()]>=input[i])
			{
				check.pop();
			}
			if(check.isEmpty())
			{
				rmin[i]= len-1;
				
			}
			else
			{
				rmin[i]=check.peek()-1;
			}
			check.push(i);
			
			
		}
		int max=0;
		for (int i = 0; i < rmin.length; i++) {
			
			max= Math.max(max, ((rmin[i]-lmin[i])+1)*input[i]);
			
		}
		
		System.out.println(max);
	}
	
	private static boolean isPowerOfTen(int num)
	{
		if(num==1)
		{
			return true;
		}
		
		while (num>1)
		{
			if(num%10!=0)
			{
				return false;
			}
			num= num/10;
		}
		
		return true;
	}
	
	private static void stairCase(int input)
	{
		if(input==0||input==1||input==2)
		{
			System.out.println(input);
		}
		
		if(input==3)
		{
			System.out.println(4);
		}
		
		int a=1,b=2,c=4,sum=0;
		
		for (int i = 3; i < input; i++) {
			
			sum=a+b+c;
			a=b;
			b=c;
			c=sum;
		}
		
		System.out.println(sum);
	}
	
	private static void getGcd(int p,int q)
	{
		
		while(q!=0)
		{
			int temp=q;
			q=p%q;
			p=temp;
		}
		System.out.println(p);
	}
	
	private static void compressSting(String input)
	{
		int len = input.length();
		StringBuilder ans = new StringBuilder();
		while(len>1)
		{
			if(len%2==0&&input.substring(0, len/2).equals(input.substring(len/2,len)))
			{
				ans.insert(0,'*');
				len= len/2;
			}
			else
			{
				ans.insert(0,input.charAt(len-1));
				len--;
			}
			
		}
		
		ans.insert(0, input.charAt(0));
		
		System.out.println(ans);
		
	}

	public static void sortedArray(int[] a, int[] b)
	{
		if(b.length<a.length)
		{
			sortedArray(b, a);
		}
		int h=a.length;
		int l=0;
		while(h>=l)
		{
			int m1=(l+h)/2;
			int m2 = ((a.length+b.length+1)/2) - m1;
			
			int l1= m1==0 ?0:a[m1-1];
			int l2= m2==0?0:b[m2-1];
			
			int r1= m1==a.length?Integer.MAX_VALUE:a[m1];
			int r2= m2==b.length?Integer.MAX_VALUE:b[m2];
			
			if(l1<=r2&&l2<=r1)
			{
				if(a.length+b.length%2==0)
				{
					System.out.println((Math.max(l1, l2)+Math.min(r1, r2))/2);
					break;
				}
				else
				{
					System.out.println(Math.max(l1, l2));
					break;
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
		
	}
	
	private static void winnerOfCircle(int n, int k)
	{
		
		Queue<Integer> q = new LinkedList<Integer>();
		
		for(int i=0;i<n;i++)
		{
			q.add(i);
			
		}
		
		while (q.size()>1)
		{
			for(int i =0; i<k;i++)
			{
				q.add(q.poll());
			}
			q.poll();
		}
		
		System.out.println(q.peek());
		
	}
	
	private static void twoSum(int[] nums, int t)
	{
		
		Map<Integer, Integer> m = new HashMap<>();	
		for (int i = 0; i < nums.length; i++) {
			int b= t-nums[i];
			
			if(m.containsKey(b))
			{
				System.out.println(m.get(b)+" "+i);
				break;
			}
			m.put(nums[i], i);
		}
	}
	
	public static void main(String[] args) {
		
//		getCharcount("aaabbbccd");
		
//		getUniqSubstr("aaabbbbccdddddc");
		
		getRecurringDeci(1, 3);
		
//		getHistogram(new int[] {2,1,5,6,2,3});
		
//		System.out.println(isPowerOfTen(50));
		
//		stairCase(0);
		
//		getGcd(2, 4);
			
//		compressSting("abcba");
		
//		sortedArray(new int[] {1,2,3,7,8,9}, new int[] {4,5,6,10,11,12,13});
		
//		winnerOfCircle(5, 2);
		
//		twoSum(new int[] {3,2,4}, 6);
		
		System.out.println(1 ^ 2);
	}
}
