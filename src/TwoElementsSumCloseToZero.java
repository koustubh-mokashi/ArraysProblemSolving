import java.util.Arrays;

public class TwoElementsSumCloseToZero {

	public static void main(String[] args) {
		int[] v = { 1, 60, -10, 70, -80, 85 };
		Arrays.sort(v);
		int left = 0;
		int right = v.length - 1;
		int[] pair = new int[2];
		int sum = Integer.MAX_VALUE;
		while (left < right) {
			int cS = v[left] + v[right];
			if (sum > Math.abs(cS)) {
				sum = cS;
				pair[0] = v[left];
				pair[1] = v[right];
			}
			if (cS < 0) {
				left++;
			} else {
				right--;
			}
		}
		System.out.println(pair[0] + " " + pair[1]);
	}

}
