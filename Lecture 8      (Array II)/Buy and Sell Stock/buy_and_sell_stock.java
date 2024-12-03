public class buy_and_sell_stock{
    public static void main(String[] args) {
        int prices[] = {7, 1, 5, 3, 6, 4};
        int buyPrice = Integer.MAX_VALUE;
        int max_profit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (buyPrice < prices[i]) {   // profit
                int profit = prices[i] - buyPrice;   // today's profit
                max_profit = Math.max(max_profit, profit);
            } else{
                buyPrice = prices[i];
            }
        }
        System.out.println("Maximum profit is = " + max_profit);

    }
}