import java.util.HashMap;

/**
 * Longest Span with same Sum in two Binary arrays Input: arr1[] = {0, 1, 0, 0,
 * 0, 0}; arr2[] = {1, 0, 1, 0, 0, 1};
 * 
 * Output: 4 The longest span with same sum is from index 1 to 4.
 * 
 * @author koustubhmokashi
 *
 */
public class LargestSpanWithSameSum {

	public static void main(String ar[]) {
		int[] arr1 = { 0, 1, 0, 0 };
		int[] arr2 = { 1, 0, 1, 0 };
		int[] arr = new int[arr1.length];
		for (int i = 0; i < arr1.length; i++) {
			arr[i] = arr1[i] - arr2[i];
		}
		HashMap<Integer, Integer> hm = new HashMap<>();
		int sum = 0;
		int maxLen = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			if (sum == 0) {
				maxLen = i + 1;
			}
			if (hm.containsKey(sum)) {
				maxLen = Math.max(maxLen, i - hm.get(sum));
			} else {
				hm.put(sum, i);
			}
		}
		System.out.println(maxLen);
	}
}
