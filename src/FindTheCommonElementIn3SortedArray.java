
public class FindTheCommonElementIn3SortedArray {

	public static void main(String[] args) {
		int[] v1 = { 1, 5, 10, 20, 40, 80 };
		int[] v2 = { 6, 7, 20, 80, 100 };
		int[] v3 = { 3, 4, 15, 20, 30, 70, 80, 120 };

		for (int i = 0, j = 0, k = 0; i < v1.length && j < v2.length && k < v3.length; ) {
			if (v1[i] == v2[j] && v2[j] == v3[k]) {
				System.out.println(v1[i]);
				break;
			} else if (v1[i] < v2[j] && v1[i] < v3[k]) {
				i++;
			} else if (v2[j] < v1[i] && v2[j] < v3[k]) {
				j++;
			} else {
				k++;
			}
		}
	}

}
