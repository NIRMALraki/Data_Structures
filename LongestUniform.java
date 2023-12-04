package Leet;

import java.util.Arrays;

public class LongestUniform {

	public static int[] getCount(String s) {
		if (s == null || s.isEmpty()) {
			return new int[] { 0, 0 };
		}
		int[] result = { 0, 0 };
		int count = 1;
		int max = 1;
		int index = 0;
		for (int i = 1; i < s.length(); i++) {

			if (s.charAt(i - 1) == s.charAt(i)) {
				count++;
			} else {

				if (max <= count) {
					result[0] = index;
					result[1] = count;
					max = count;
					count = 1;

				}
				index = i;

			}

		}

		if (max < count) {

			result[0] = index;
			result[1] = count;

		}

		return result;
	}

	public static void main(String[] args) {

		int[] ans = getCount("abbbc");
		System.out.println(Arrays.toString(ans));
	}

}
