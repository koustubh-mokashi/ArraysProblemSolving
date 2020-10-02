import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Minimum swaps required to bring all elements less than or equal to k together
 * Input: arr[] = {2, 1, 5, 6, 3}, k = 3 Output: 1
 * 
 * Input: arr[] = {2, 7, 9, 5, 8, 7, 4}, k = 5 Output: 2
 * 
 * @author koustubhmokashi
 *
 */
public class MinSwapBringElementTogether {

	public static void main(String[] args) {
		int[] values = { 8, 2, 1, 3, 5, 6 };
		System.out.println(minSwap(values, 3));
	}

	private static long minSwap(int[] values, int k) {
		long count = Arrays.stream(values).filter(v -> v <= k).count();
		long swaps = IntStream.range(0, ((int) count)).filter(i -> values[i] > k).count();
		long minSwaps = swaps;
		for (int i = 0, j = (int) count; j < values.length; j++, i++) {
			if (values[i] > k) {
				swaps--;
			}
			if (values[j] > k) {
				swaps++;
			}
			minSwaps = Math.min(minSwaps, swaps);
		}
		return minSwaps;
	}

}
