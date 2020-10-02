import java.util.Arrays;

/**
 * Find all elements in array which have at-least two greater elements
 * 
 * Input : arr[] = {2, 8, 7, 1, 5}; Output : 2 1 5 The output three elements
 * have two or more greater elements
 * 
 * Idea :- find 2nd most largest element in array and all elements having lesst
 * value than that.
 * 
 * @author koustubhmokashi
 *
 */
public class ElementsWithTwoGreaterElements {

	public static void main(String[] args) {
		int[] values = { 2, 8, 7, 1, 5 };
		int maxElements[] = new int[2];
		for (int i = 0; i < values.length; i++) {
			if (maxElements[0] < values[i] && maxElements[1] < values[i]) {
				int temp = maxElements[0];
				maxElements[0] = values[i];
				maxElements[1] = temp;
			} else if (maxElements[1] < values[i]) {
				maxElements[1] = values[i];
			}
		}
		Arrays.stream(values).filter(v->v<maxElements[1]).forEach(System.out::println);
	}

}
