import java.util.Arrays;

/**
 * Write a function rotate(values[], rotateBy, rotateBy) that rotates values[]
 * of size length by rotateBy elements.
 * 
 * @author koustubhmokashi
 *
 */
public class ArrayRotation {

	public static void main(String[] args) {

		int[] values = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int rotateBy = 10;
		Arrays.stream(rotate(values, rotateBy, values.length)).forEach(System.out::print);
	}

	private static int[] rotate(int[] values, int rotateBy, int length) {
		rotateBy = rotateBy % length;
		int[] temp = new int[rotateBy];
		int i = 0;
		for (; i < rotateBy; i++) {
			temp[i] = values[i];
			values[i] = values[i + rotateBy];
		}
		for (; i < length - rotateBy; i++) {
			values[i] = values[i + rotateBy];
		}
		for (int j = 0; i < length; i++) {
			values[i] = temp[j++];
		}
		return values;
	}

}
