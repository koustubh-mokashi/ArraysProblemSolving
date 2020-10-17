import java.util.HashMap;

public class FindIfSubArrayWithSumZero {

	public static void main(String[] args) {
		int[] values = { 1, 2, 3, 4, -3, -2, -1 };
		HashMap<Integer, Boolean> hm = new HashMap<>();
		int sum = 0;
		boolean isSubArrayZero = false;
		for (int v : values) {
			sum += v;
			if ((hm.get(sum) != null && hm.get(sum) == true) || sum == 0) {
				isSubArrayZero = true;
				break;
			}
			hm.put(sum, true);
		}
		if (isSubArrayZero) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}

}
