import java.util.HashMap;
import java.util.Map;

public class FindTheSubArrayWithGivenSum {

	public static void main(String[] args) {
		Map<Integer, Integer> hm = new HashMap<>();
		int n = 33;
		int[] values = { 1, 4, 20, 3, 10, 5 };
		int sum = 0;
		for (int i = 0; i < values.length; i++) {
			sum += values[i];
			Integer v = null;
			if ((v = hm.get(sum - n)) != null) {
				v++;
				System.out.println("Exists " + v + " to " + i);
				break;
			}
			hm.put(sum, i);
		}
	}
}
