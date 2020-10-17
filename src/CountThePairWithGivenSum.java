import java.util.HashMap;
import java.util.Map;

public class CountThePairWithGivenSum {

	public static void main(String[] args) {
		int arr[] = { 1, 1, 1, 1};
		int sum = 2;
		int count = 0;
		Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
		for (int v : arr) {
			Integer cc = 0;
			if ((cc = mp.get(sum - v)) != null) {
				count += cc;
			}
			Integer vc = 0;
			if ((vc = mp.get(v)) != null) {
				mp.put(v, ++vc);
			} else {
				mp.put(v, 1);
			}
		}
		System.out.println("Pairs " + count);
	}

}
