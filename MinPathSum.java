package Leet;

public class MinPathSum {
	
	private static int getMinPath(int[][] input) {
				
		if(input==null||input.length<=0)
		{
			return 0 ;
		}
		
			int p=input.length;//3
			int q=input[0].length;//3
			
			for (int i = 1; i < p; i++) {
				
				input[i][0]+=input[i-1][0]; //2 6
				
			}                                                                                    //{1,4,5},{2,7,6},{6,8,7}  7
			for (int j = 1; j < q; j++) {                                                         //00
				
				input[0][j]+=input[0][j-1]; //4 5
				
			}
			for (int i = 1; i < p; i++) {
				for (int j = 1; j < q; j++) {
					
					input[i][j] += Math.min(input[i-1][j],input[i][j-1]); //  input[0][1],input[1][0]  4 , 2 =7    7,5
																			// input[0][2],input[1][1]  7,5   5
																			//  input[1][1],input[2][0]  7  6 = 6 
					// in                                                        //  input[1][2],input[2][1]    6,8  6  
					
				}
			
			}
			return input[p-1][q-1]; //7
			
		
	}

	public static void main(String[] args) {

//		int[][] input= {{1,2,3},{4,5,6}};
//		int[][] input= {{1,3,1},{1,5,1},{4,2,1}};
		int[][] input= null;
		
		
		System.out.println(getMinPath(input));
		
	}

}
