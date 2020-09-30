import java.util.Arrays;

public class ReArrangeByIndex {

	public static void main(String[] args) {
		int[] v = { 9, -1, -1, -1, 2, 3, 4, -1, 5, -1, 6};
		int temp = 0;
		for (int i = 0; i < v.length; i++) {
			if (v[i] != -1) {
				if (v[i] != i) {
					temp = v[i];
					v[i] = v[temp];
					v[temp] = temp;
				}
			}
		}
		Arrays.stream(v).forEach(System.out::print);
	}

}
