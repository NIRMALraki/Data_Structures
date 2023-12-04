package Leet;

import java.util.HashMap;

public class FractionToDecimal {
	
	private static String getFractionToDecimal(int num, int den) {
		
		if(den==0)
		{
			return "invalid";
		}
		
		StringBuilder result = new StringBuilder();
		if(num<0&&den>0||num>0&&den<0)
		{
			result.append('-');
		}
		long q=num/den;
		long rem=0;
		result.append(Math.abs(q));
		if(num%den==0)
		{
			return result.toString();
		}
		result.append('.');
		rem=num%den;
		System.out.println(rem);
		HashMap<Long, Integer> map = new HashMap<>();
		while(rem!=0)
		{
			if(map.containsKey(rem))
			{
				result.insert(map.get(rem), "(");
				result.append(')');
				return result.toString();
			}
			map.put(rem, result.length());
			System.out.println(map);
			rem=rem*10;
			System.out.println(rem);
			System.out.println(result);
			result.append(Math.abs(rem/den));
			System.out.println(result);
			rem= rem%den;
			System.out.println();
		}
		return result.toString();

	}
	
	public static void main(String[] args) {
		
		System.out.println(getFractionToDecimal(5, 3));
//		System.out.println(getFractionToDecimal(1,2));
//		System.out.println(getFractionToDecimal(1,17));
		
		//negative values
		//edge cases
		
	}

}
