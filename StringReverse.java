package Lleet.optional;

import java.util.Arrays;

public class StringReverse {
	
	private static String getResverse(char[] s) {
		
		if(s==null||s.length==0)
		{
			return "invalid input";
		}
		
	        for(int i=0,j=s.length-1;i<(s.length/2);j--,i++)
	        {
	            char temp=s[i];
	            s[i]=s[j];
	            s[j]=temp;   
	            
	            }
		
	        return Arrays.toString(s);
	}
	
	public static void main(String[] args) {
		
		System.out.println(getResverse(new char[] {'n','i','r','m','a','l'}));
		
	}

}
