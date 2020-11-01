import java.util.HashMap;

public class FindTheTripletSumToGivenValue {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5};
		int sum = 9;
		for (int i = 0; i < array.length - 2; i++) {
			int requiredSum = sum - array[i];
			HashMap<Integer, Integer> hm = new HashMap<>();
			for (int j = i + 1; j < array.length; j++) {
				Integer index = 0;
				if ((index = hm.get(requiredSum - array[j])) != null) {
					System.out.println(array[i] + " " + array[index] + " " + array[j]);
					break;
				}
				hm.put(array[j], j);
			}
		}
	}

}
