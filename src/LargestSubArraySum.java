/**
 * Largest Sum Contiguous Subarray
 * 
 * Input : a[] = {-2, -3, 4, -1, -2, 1, 5, -3} Output : 7 Solution :- Kaden's
 * Algorithm.
 * 
 * @author koustubhmokashi
 *
 */
public class LargestSubArraySum {

	public static void main(String[] args) {
		int maxSum = 0;
		int maxEnd = 0;
		int[] values = { 1, -2, 1, 1, -2, 1 };
		int count = 0;
		int size = 0;
		for (int i = 0; i < values.length; i++) {
			maxEnd += values[i];
			if (maxEnd < 0) {
				maxEnd = 0;
				count = 0;
			} else {
				if (maxEnd > maxSum) {
					maxSum = maxEnd;
					size = ++count;
				} else {
					count++;
				}
			}
		}
		System.out.println(maxSum);
		System.out.println(size);
	}

}
