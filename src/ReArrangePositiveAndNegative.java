import java.util.Arrays;

/**
 * Rearrange positive and negative numbers using inbuilt sort function
 * 
 * Input : arr[] = [12, 11, -13, -5, 6, -7, 5, -3, -6] Output : arr[] = [-13,
 * -5, -7, -3, -6, 12, 11, 6, 5]
 * 
 * Input : arr[] = [-12, 11, 0, -5, 6, -7, 5, -3, -6] Output : arr[] = [-12, -5,
 * -7, -3, -6, 0, 11, 6, 5]
 * 
 * @author koustubhmokashi
 *
 */
public class ReArrangePositiveAndNegative {

	public static void main(String[] args) {
		int[] arr = { 12, 11, -13, -5, 6, -7, 5, -3, -6 };
		int temp = 0;
		for (int i = 0, j = 0; i < arr.length; i++) {
			if (arr[i] >= 0) {
				while (++j < arr.length && arr[j] >= 0);
				if (j<arr.length && arr[j]<0) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		Arrays.stream(arr).forEach(System.out::println);
	}

}
