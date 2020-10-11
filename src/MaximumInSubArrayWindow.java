import java.util.LinkedList;

public class MaximumInSubArrayWindow {

	public static void main(String[] args) {
		int[] values = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		LinkedList<Integer> linkedList = new LinkedList<>();
		int k = 3;
		int i = 0;

		for (int j = 0; j < k; j++) {
			final int currentVal = values[i];
			if (!linkedList.isEmpty()) {
				linkedList.removeIf(e -> values[e] <= currentVal);
			}
			linkedList.add(i);
			i++;
		}

		while (i < values.length) {
			if (!linkedList.isEmpty()) {
				final int cuin = i-k;
				System.out.println(values[linkedList.peekFirst()]);
				linkedList.removeIf(e -> e < cuin);
			}
			if (!linkedList.isEmpty()) {
				final int currentVal = values[i];
				linkedList.removeIf(e -> values[e] < currentVal);
			}
			linkedList.add(i);
			i++;
		}
		System.out.println(values[linkedList.peekFirst()]);
	}

}
