import java.util.Arrays;

/**
 * Move all zeroes to end of array
 * 
 * @author koustubhmokashi
 *
 */
public class MoveAllZerosToEnd {

	public static void main(String[] args) {
		int[] values = { 1, 3, 0, 5, 0, 4, 0, 0, 6, 9 };
		for (int i = 0; i < values.length; i++) {
			int count = i;
			if (values[count] == 0) {
				while (count < values.length - 1 && values[++count] <= 0);
				int temp = values[i];
				values[i] = values[count];
				values[count] = temp;
			}
		}
		Arrays.stream(values).forEach(System.out::print);
	}

}
