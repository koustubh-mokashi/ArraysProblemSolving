import java.util.Arrays;

public class Waveform {

	public static void main(String[] args) {
		int[] values = { 10, 90, 49, 2, 1, 5, 23 };
		for (int i = 0; i < values.length; i += 2) {
			int temp = values[i];
			if (i != 0 && values[i - 1] > temp) {
				values[i] = values[i - 1];
				values[i - 1] = temp;
				temp = values[i];
			}
			if ((i + 1) < values.length && temp < values[i + 1]) {
				values[i] = values[i + 1];
				values[i + 1] = temp;
			}
		}
		Arrays.stream(values).forEach(System.out::println);
	}

}
