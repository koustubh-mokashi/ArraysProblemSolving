
public class FindTheIncreasingSequenceOfLengthThree {

	public static void main(String ar[]) {
		int arr[] = { 6, 7, 8, 1, 2, 3, 9, 5 };
		int[] lge = new int[arr.length];
		int[] rge = new int[arr.length];
		int left = 0;
		int right = arr.length - 1;
		int lefH = Integer.MIN_VALUE;
		int rigH = Integer.MIN_VALUE;
		while (left < arr.length && right >= 0) {
			lge[left] = lefH;
			lefH = Math.max(lefH, arr[left++]);
			rge[right] = rigH;
			rigH = Math.max(rigH, arr[right--]);
		}
		int[] sq = new int[3];
		int prod = Integer.MIN_VALUE;
		for (int i = 1; i < arr.length - 1; i++) {
			int pr = lge[i] * arr[i] * rge[i];
			if (prod < pr) {
				prod = pr;
				sq[0] = lge[i];
				sq[1] = arr[i];
				sq[2] = rge[i];
			}
		}
		System.out.println(sq[0] + " " + sq[1] + " " + sq[2]);
	}

}
