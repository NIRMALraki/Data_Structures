package Leet;

import java.util.HashMap;
import java.util.Map.Entry;

public class IpAddress {
	
	public static String findMostVisited(String[] input)
	{
		if(input==null)
		{
			return "invalid";
		}
		HashMap<String,Integer> ipaddlist= new HashMap<>();
		int max=0;
		String result="";
		for (String value : input) {
			String[] ipadd = value.split(" ");
			if(!ipadd[0].isEmpty())
			{
			ipaddlist.put(ipadd[0],ipaddlist.getOrDefault(ipadd[0], 0)+1);
			}
			
		}
//		System.out.println(ipaddlist);
		

		for (Entry<String, Integer> entry : ipaddlist.entrySet()) {
			if(max<entry.getValue())
			{
				max= entry.getValue();
				result=entry.getKey();
			}
			
		}
		
		
		return result;
	}
	
	
	public static void main(String[] args) {
		
		String[] input = {"10.0.0.1 satish","10.0.0.1 Deepa","10.0.0.2 Vinay","10.0.0.2 Vinay"};
		
		System.out.println(findMostVisited(input));
	}

}
