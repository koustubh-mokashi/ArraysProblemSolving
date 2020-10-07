
public class MinimumJumpsToReachEnd {

	public static void main(String[] args) {
		int arr[] = { 1, 3, 6, 3, 2, 3, 6, 8, 9, 5 };
		int[][] maxSoFar = new int[1][2];
		int jump = 1;
		for (int i = 0; i < arr.length;) {
			int j = 1;
			for (; j <= arr[i] && (j + i) < arr.length; j++) {
				if (maxSoFar[0][0] <= arr[i + j]) {
					maxSoFar[0][0] = arr[i + j];
					maxSoFar[0][1] = i + j;
				}
			}
			if (maxSoFar[0][0] == 0) {
				System.out.println("Not possible");
				break;
			}
			jump++;
			if (maxSoFar[0][1] + maxSoFar[0][0] >= arr.length - 1) {
				System.out.println("jumps" + jump);
				break;
			}
			maxSoFar[0][0] = 0;
			i = maxSoFar[0][1];
		}
	}

}
