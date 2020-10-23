import java.util.HashMap;
import java.util.Map;

public class FindThePairWithGivenDifference {

	public static void main(String[] args) {
		int[] values = { 5, 20, 3, 2, 50, 20 };
		int diff = 0;
		Map<Integer, Integer> hm = new HashMap<>();
		for (int v = 0; v < values.length; v++) {
			Integer index = 0;
			int toSearch = diff < values[v] ? values[v] - diff : values[v] + diff;
			if ((index = hm.get(toSearch)) != null) {
				System.out.println(values[v] + " " + values[index]);
			}
			hm.put(values[v], v);
		}
	}

}
