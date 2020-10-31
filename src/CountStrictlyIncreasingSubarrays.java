
public class CountStrictlyIncreasingSubarrays {

	public static void main(String ar[]) {
		int arr[] = { 1, 2, 3, 4 };
		int count = 0;
		int prevElement = Integer.MIN_VALUE;
		int subArryCount = 0;
		for (int v : arr) {
			if ((v < prevElement) || (v == prevElement)) {
				subArryCount = (count * (count - 1)) / 2;
				count = 0;
			}
			count++;
			prevElement = v;
		}
		subArryCount += (count * (count - 1)) / 2;
		System.out.println(subArryCount);
	}

}
