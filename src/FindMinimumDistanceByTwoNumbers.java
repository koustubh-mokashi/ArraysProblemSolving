/**
 * Find the minimum distance between two numbers Input: arr[] = {1, 2}, x = 1, y
 * = 2 Output: Minimum distance between 1 and 2 is 1. Explanation: 1 is at index
 * 0 and 2 is at index 1, so the distance is 1
 * 
 * @author koustubhmokashi
 *
 */
public class FindMinimumDistanceByTwoNumbers {

	public static void main(String[] args) {
		int[] values = { 3, 5, 4, 2, 6, 5, 6, 6, 5, 4, 8, 3 };
		int x = 3;
		int y = 2;
		System.out.println(getMinimumDistance(values, x, y));
	}

	private static int getMinimumDistance(int[] values, int x, int y) {
		int preIndex = -1;
		int distance = Integer.MAX_VALUE;
		for (int i = 0; i < values.length; i++) {
			if (values[i] == x || values[i] == y) {
				if (preIndex != -1 && values[i] != values[preIndex]) {
					distance = Math.min(distance, i - preIndex);
				}
				preIndex = i;
			}
		}
		return distance;
	}

}
