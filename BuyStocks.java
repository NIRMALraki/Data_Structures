package Leet;

public class BuyStocks {

	private static int getmaxProfit(int[] input) {

		if (input == null || input.length == 0) {
			return 0;
		}

		int profit = 0;
		int buy = input[0];
		for (int i = 1; i < input.length; i++) {

			if (input[i] < buy) {
				buy = input[i];
			}

			if (input[i] - buy > profit) {
				profit = input[i] - buy;
			}
		}

		return profit;
	}

	public static void main(String[] args) {

		int[] input = { 7, 1, 5, 3, 6, 4 };	
//		int[] input = {7,6,4,3,1};	
		
		System.out.println(getmaxProfit(input));

	}

}
