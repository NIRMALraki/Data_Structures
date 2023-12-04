package Leet;

import java.util.ArrayList;

public class Mock2 {
	
	private static ArrayList<String> getCharCount(String[] input) {
		
		if(input==null||input.length==0)
		{
			return new ArrayList<>();
		}
		int count=1;
		ArrayList<String> result = new ArrayList<>();
		int i;
		for (i = 1; i < input.length; i++) {
			if(input[i-1]==input[i])
			{
				count++;
			}
			else
			{
				result.add(input[i-1]);
				result.add(""+count);
				count=1;
			}
		}
		
		result.add(input[i-1]);
		result.add(""+count);
		
		return result;

	}

	public static void main(String[] args) {
			
		
		String[] input={"a","B","b"};
		System.out.println(getCharCount(input));
	}

}
