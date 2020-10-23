import java.util.Arrays;

public class FindTheTripletWithZeroSum {

	public static void main(String[] args) {
		int[] v = { 0, -1, 2, -3, 1 };
		Arrays.sort(v);
		for (int k = 0; k < v.length; k++) {
			int i = k;
			int j = v.length - 1;
			while ((i < j) && i + 1 < v.length) {
				if (v[i] + v[i + 1] + v[j] == 0) {
					System.out.println(v[i] + " " + v[i + 1] + " " + v[j]);
					i++;
				} else if (v[i] + v[i + 1] + v[j] > 0) {
					j--;
				} else {
					i++;
				}
			}
		}
	}

}
