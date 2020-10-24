import java.util.Arrays;

public class ReplaceWithGreatestElementOfRightHand {

	public static void main(String[] args) {
		int[] v = { 16, 17, 4, 3, 5, 2 };
		int maxSoFar = -1;
		for (int i = v.length - 1; i >= 0; i--) {
			int temp = v[i];
			if (temp > maxSoFar) {
				v[i] = maxSoFar;
				maxSoFar = temp;
			} else {
				v[i] = maxSoFar;
			}
		}
		Arrays.stream(v).forEach(System.out::println);
	}

}
