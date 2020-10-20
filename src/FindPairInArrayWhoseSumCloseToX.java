
public class FindPairInArrayWhoseSumCloseToX {

	public static void main(String[] args) {
		int[] v = { 10, 22, 28, 29, 30, 40 };
		int sum = 60;
		int left = 0;
		int right = v.length - 1;
		int diff = Integer.MAX_VALUE;
		int index[] = new int[2];
		while (left < right) {
			if (Math.abs((v[left] + v[right]) - sum) < diff) {
				index[0] = v[left];
				index[1] = v[right];
				diff = Math.abs((v[left] + v[right]) - sum);
			}
			if ((v[left] + v[right]) < sum) {
				left++;
			} else {
				right--;
			}
		}
		System.out.println("Pairs are " + index[0] + " and " + index[1]);
	}

}
