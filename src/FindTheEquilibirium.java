import java.util.Arrays;

public class FindTheEquilibirium {

	public static void main(String[] args) {
		int[] v = { -7, 1, 5, 2, -4, 3, 0 };
		int rightSum = Arrays.stream(v).sum();
		int leftSum = 0;
		for (int i = 0; i < v.length; i++) {
			rightSum -= v[i];
			if (rightSum == leftSum) {
				System.out.println("Index is " + i);
			}
			leftSum += v[i];
		}
	}

}
