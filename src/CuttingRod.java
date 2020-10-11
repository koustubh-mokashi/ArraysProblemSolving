import java.util.HashMap;
import java.util.Map;

public class CuttingRod {

	private static Map<Integer, Integer> priceMap = new HashMap<>();

	public static void main(String[] args) {
		int[] prices = { 1, 5, 3 };
		System.out.print("Max Price we can get is "+ rodPrice(prices, prices.length));
	}

	private static int rodPrice(int[] prices, int length) {
		if (length <= 0) {
			return 0;
		}
		if(priceMap.get(length) != null) {
			return priceMap.get(length);
		}
		int maxPrice = Integer.MIN_VALUE;
		for (int i = 0; i < length; i++) {
			maxPrice = Math.max(maxPrice, prices[i] + rodPrice(prices, length - i - 1));
		}
		priceMap.put(length, maxPrice);
		return maxPrice;
	}

}
