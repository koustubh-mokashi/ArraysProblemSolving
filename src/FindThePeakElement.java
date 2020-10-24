
public class FindThePeakElement {

	public static void main(String[] args) {
		int v[] = { 1, 3, 20, 4, 1, 0 };
		for (int i = 1; i < v.length - 2; i++) {
			if (v[i - 1] < v[i] && v[i] > v[i + 1]) {
				System.out.println(i);
			}
		}
	}

}
