import java.util.Arrays;

public class Seggregate0And1 {

	public static void main(String[] args) {
		int[] v = { 0, 1, 0, 1, 0, 0, 1, 1, 1, 0};
		int left = 0;
		int right = v.length - 1;
		while (left < right) {
			while (left <= right && v[left++] == 0)
				;
			while (right >= left && v[right--] == 1)
				;
			int temp = v[right + 1];
			v[right + 1] = v[left - 1];
			v[left - 1] = temp;
		}
		Arrays.stream(v).forEach(System.out::print);
	}

}
