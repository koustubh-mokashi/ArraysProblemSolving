import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Given an array of n elements. Our task is to write a program to rearrange the
 * array such that elements at even positions are greater than all elements
 * before it and elements at odd positions are less than all elements before it.
 * 
 * Input : values[] = {1, 2, 3, 4, 5, 6, 7} Output : 4 5 3 6 2 7 1
 * 
 * Input : values[] = {1,3,4,5,7,8,9} Output : 5 7 5 8 3 9 1
 * 
 * @author koustubhmokashi
 *
 */
public class RearrangeByOddEven {

	public static void main(String[] args) {
		int[] values = { 1, 2, 3, 4, 5, 6, 7 };
		int[] aCopy = Arrays.copyOf(values, values.length);
		Arrays.sort(aCopy);
		int position = values.length % 2 == 0 ? values.length - 1 : values.length - 2;
		int count = values.length - 1;
		while (position < values.length && count >= 0) {
			if (position % 2 != 0 && position >= 1) {
				values[position] = aCopy[count--];
				position -= 2;
			} else if (position > 0) {
				values[position] = aCopy[count--];
				position += 2;
			} else {
				position = 0;
				values[position] = aCopy[count--];
				position = position + 2;
			}
		}
		Arrays.stream(values).forEach(System.out::print);
	}

}
