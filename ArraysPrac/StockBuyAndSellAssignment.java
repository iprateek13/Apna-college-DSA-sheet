public class StockBuyAndSellAssignment {
    public static int stockbuyAndSell(int prices[]) {
        int buyPrice = prices[0];
        int maxprofit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < buyPrice) {
                buyPrice = prices[i];
            } else {
                int currprofit = prices[i] - buyPrice;
                maxprofit = Math.max(maxprofit, currprofit);
            }
        }
        return maxprofit;
    }

    public static void main(String[] args) {
        int num[] = { 7, 1, 5, 3, 6, 4 };
        int totalProfit = stockbuyAndSell(num);
        System.out.println(" maxProfit is : " + totalProfit);
    }
}
