package Leet;

public class NonRepeatingNumber {

	private static int getNonRepeatingNumber(int[] input) {
		int count = 1;
		int i = 1;
		if(input==null||input.length==0)
		{
			return -1;
		}
		if(input.length==1)
		{
			return input[0];
		}
		input = sort(input);
		for (; i < input.length; i++) {

			if (input[i - 1] == input[i]) {
				count++;

			} else {
				if (count == 1) {
					return input[i - 1];
				}
				count = 1;

			}

		}
		if (count == 1) {
			return input[i-1];
		}

		return 0;

	}

	private static int[] sort(int[] input) {

		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input.length; j++) {

				if (input[i] < input[j]) {
					int temp = input[i];
					input[i] = input[j];
					input[j] = temp;
				}

			}
		}

		return input;

	}

	public static void main(String[] args) {

		System.out.println(getNonRepeatingNumber(new int[] {2,2,3,5,5,3,4,4,1,1,6}));
		System.out.println(getNonRepeatingNumber(new int[] {2,2,3,3,1}));
		System.out.println(getNonRepeatingNumber(new int[] {2,3,3,1,1}));
		
		
															//1,1,2,2,3,3,4
	}

}
