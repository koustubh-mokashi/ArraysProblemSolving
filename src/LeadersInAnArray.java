
public class LeadersInAnArray {

	public static void main(String[] args) {
		int[] v = { 16, 17, 4, 3, 5, 2 };
		int max_till = Integer.MIN_VALUE;
		for (int i = v.length - 1; i >= 0; i--) {
			if (v[i] > max_till) {
				System.out.println(v[i]);
				max_till = v[i];
			}
		}
	}

}
