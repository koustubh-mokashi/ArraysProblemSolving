/**
 * Maximum profit by buying and selling a share at most twice
 * 
 * Input: price[] = {10, 22, 5, 75, 65, 80} 
 * Output: 87 Trader earns 87 as sum of
 * 12 and 75 Buy at price 10, sell at 22, buy at 5 and sell at 80
 * 
 * @author koustubhmokashi
 *
 */
public class MaxProfitByBuyingAndSellingShareTwice {

	private static int getMaxProfit(int price[], int n) {
		int profit[] = new int[n];
		for (int i = 0; i < n; i++)
			profit[i] = 0;

		int maxPrice = price[n - 1];
		for (int i = n - 2; i >= 0; i--) {
			if (price[i] > maxPrice)
				maxPrice = price[i];
			profit[i] = Math.max(profit[i + 1], maxPrice - price[i]);
		}

		int min_price = price[0];
		for (int i = 1; i < n; i++) {
			if (price[i] < min_price)
				min_price = price[i];

			profit[i] = Math.max(profit[i - 1], profit[i] + (price[i] - min_price));
		}
		int result = profit[n - 1];
		return result;
	}

	public static void main(String args[]) {
		int price[] = { 10, 22, 5, 75, 65, 80 };
		int n = price.length;
		System.out.println(getMaxProfit(price, n));
	}

}