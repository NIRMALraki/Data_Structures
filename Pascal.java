package Leet;

import java.util.ArrayList;
import java.util.Iterator;

public class Pascal {
	public static ArrayList<ArrayList<Integer>> getPascal(int n) {
		
		ArrayList<ArrayList<Integer>> pascal= new ArrayList<>() ;
		pascal.add(new ArrayList<>());
        pascal.get(0).add(1);
	    for (int row = 1; row <= n; row++) {
	    	ArrayList<Integer> newRow = new ArrayList<>();
	        newRow.add(1);
	        int i;
	        for (i = 1; i <pascal.get(row-1).size(); i++) {
	        	newRow.add(pascal.get(row-1).get(i-1)+pascal.get(row-1).get(i));
	        	
	        }
	        newRow.add(1);
	        pascal.add(newRow);
	    }
	    
	    return pascal;
	}
	
	private static int getIndex(int row , int col)
	{
		if(col>row)
		{
			return 0;
		}
		
		ArrayList<ArrayList<Integer>> p=getPascal(row);
		
		return p.get(row).get(col);
	}
	
	 private static int getPascalOpti(int row , int col) {

		 if(col>row||row<0||col<0)
			{
				return 0;
			}
		 
		 if(row==col||col==0)
		 {
			 return 1;
		 }
		 
		 
		 int nFact=1,rFact=1;
		 
		 for (int i = 2; i <= row; i++) {
			nFact*=i;
		}
		 
		 for (int i = 2; i <=col; i++) {
				rFact*=i;
			}
		 
		 int value = nFact/(rFact*(row-col));
		 
		 return value;
		 
	}
	
	
	public static void main(String[] args) {
		
//		System.out.println(getIndex(2,1));
//		System.out.println(getIndex(3,2));
//		System.out.println(getIndex(4,4));
		
		
		System.out.println(getPascalOpti(10,0));
		
	}

}
