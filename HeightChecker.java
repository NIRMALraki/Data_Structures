package Lleet.optional;

public class HeightChecker {

		private static void getUmatchedHeight(int[] heights) {

			int unmatched =0;
			int len =heights.length;
			for (int i = 0; i < len-1; i++) {
				if(heights[i]>heights[i+1] ||( heights[i]!=heights[i+1]&&heights[i]-1!=i))
				{
//					System.out.println(heights[i]-1);
					unmatched++;
				}
				
			}
			
			if(heights[len-2]>heights[len-1]||heights[len-1]!=len&&heights[len-2]!=heights[len-1])
			{
				unmatched++;
			}
			System.out.println(unmatched);
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		getUmatchedHeight(new int[] {1,1,4,2,1,3});
		
		
	}

}
