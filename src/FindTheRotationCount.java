
public class FindTheRotationCount {

	public static void main(String args[]) {
		int[] values = new int[] { 7, 9, 11, 12, 15};
		System.out.println(getRotations(values));
	}

	private static int getRotations(int[] values) {
		int start = 0;
		int end = values.length;
		int mid = 0;
		while (start < end) {
			mid = (start + end) / 2;
			if (values[mid] < values[mid - 1]) {
				return mid;
			} else if (values[mid] < values[start]) {
				end = mid;
			} else if (values[mid] > values[end - 1]) {
				start = mid;
			} else {
				start++;
			}
		}
		return 0;
	}

}
