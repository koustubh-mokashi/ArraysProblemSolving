import java.util.Arrays;

public class FindTheMinDifferenceBtnTwoElements {

	public static void main(String[] args) {
		int a[] = { 1, 19, -4, 31, 38, 25, 100 };
		Arrays.sort(a);
		int minDiff = Integer.MAX_VALUE;
		int[] pair = new int[2];
		for (int i = 0; i < a.length - 1; i++) {
			if (minDiff > Math.abs(a[i + 1] - a[i])) {
				pair[0] = a[i];
				pair[1] = a[i + 1];
				minDiff = pair[1] - pair[0];
			}
		}
		System.out.println(pair[0] + " " + pair[1]);
	}

}
