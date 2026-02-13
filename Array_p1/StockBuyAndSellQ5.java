// package Array_p1;

public class StockBuyAndSellQ5 {
    public static int buyAndSellStocks(int prices[]) {
        int maxProfit = 0;
        int buyPrice = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if (buyPrice < prices[i]) {
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int prices[] = { 4, 3, 2, 1 };
        int maxProfit = buyAndSellStocks(prices);
        System.out.println("MaxProfit is : " + maxProfit);
    }
}
