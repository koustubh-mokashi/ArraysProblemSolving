import java.util.Arrays;

public class ReverseArray {

	public static void main(String aegs[]) {
		int[] values = { 2, 1, 4, 5, 6, 8, 9 };
		int start = 0;
		int end = values.length - 1;
		int temp = 0;
		while (start < end) {
			temp = values[start];
			values[start++] = values[end];
			values[end--] = temp;
		}
		Arrays.stream(values).forEach(System.out::print);
	}

}
