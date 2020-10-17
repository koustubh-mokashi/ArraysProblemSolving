import java.util.Arrays;
import java.util.HashMap;

/**
 * Given an array with n distinct elements, convert the given array to a form
 * where all elements are in range from 0 to n-1. The order of elements is same,
 * i.e., 0 is placed in place of smallest element, 1 is placed for second
 * smallest element, … n-1 is placed for largest element.
 * 
 * Input: arr[] = {10, 40, 20} Output: arr[] = {0, 2, 1}
 * 
 * @author koustubhmokashi
 *
 */
public class ConvertAnArrayToReducedForm {

	public static void main(String[] args) {

		int[] arr = { 15, 10, 40, 30, 20};

		int[] temp = Arrays.copyOf(arr, arr.length);
		Arrays.sort(temp);
		int v = 0;
		HashMap<Integer, Integer> hm = new HashMap<>();
		for (int vv : temp) {
			hm.put(vv, v++);
		}
		for(int av : arr) {
			System.out.print(hm.get(av)+" ");
		}
	}

}
