/**
 * Given a sorted and rotated array, find if there is a pair with a given sum.
 * 
 * @author koustubhmokashi
 *
 */
public class FindIfThePairWithGivenSum {

	public static void main(String arg[]) {
		int[] values = new int[] { 2, 3, 4, 8, 9 };
		int sum = 10;
		System.out.println(isTherePairWithSum(values, sum, 4));
	}

	private static boolean isTherePairWithSum(int[] values, int sum, int size) {
		int left = 0;
		int total = 0;
		while (left < size) {
			total = values[left] + values[size];
			if (sum == total) {
				return true;
			} else if (total < sum) {
				left++;
			} else {
				size--;
			}
		}
		return false;
	}

}
