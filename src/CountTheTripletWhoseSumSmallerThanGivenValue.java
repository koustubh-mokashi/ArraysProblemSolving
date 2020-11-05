
import java.util.Arrays;

public class CountTheTripletWhoseSumSmallerThanGivenValue {

	public static void main(String[] args) {
		int arr[] = {-2, 0, 1, 3};
		int sum = 2;
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			int j = i + 1, k = arr.length - 1;
			while (j < k) {
				if (arr[i] + arr[j] + arr[k] >= sum) {
					k--;
				} else {
					System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
					int right = k;
					right--;
					while(j<right) {
						System.out.println(arr[i] + " " + arr[j] + " " + arr[right--]);
					}
					j++;
				}
			}
		}
	}

}
