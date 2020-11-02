import java.util.HashMap;

public class PythagoreanTriplet {

	public static void main(String[] args) {
		int arr[] = { 3, 1, 4, 6, 5 };
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i] * arr[i];
		}
		for (int i = 0; i < arr.length; i++) {
			int cuV = arr[i];
			HashMap<Integer, Integer> hm = new HashMap<>();
			for (int j = 0; j < arr.length; j++) {
				if (i == j)
					continue;
				Integer value = 0;
				if ((value = hm.get(cuV - arr[j])) != null) {
					System.out.println(Math.sqrt(cuV) + " " + Math.sqrt(arr[j]) + " " + Math.sqrt(arr[value]));
				}
				hm.put(arr[j], j);
			}
		}
	}

}
