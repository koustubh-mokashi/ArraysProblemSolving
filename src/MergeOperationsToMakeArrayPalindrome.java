
public class MergeOperationsToMakeArrayPalindrome {

	public static void main(String[] args) {
		int arr[] = { 15, 4, 15};
		int left = 0;
		int right = arr.length - 1;
		int operations = 0;
		while (left < right) {
			if (arr[left] == arr[right]) {
				left++;
				right--;
			} else if (arr[left] < arr[right]) {
				arr[left + 1] += arr[left];
				left++;
				operations++;
			} else {
				arr[right - 1] += arr[right];
				right--;
				operations++;
			}
		}
		System.out.println(operations);
	}

}
