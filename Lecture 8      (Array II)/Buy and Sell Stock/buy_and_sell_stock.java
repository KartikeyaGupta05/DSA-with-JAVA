public class buy_and_sell_stock {
    public static void main(String[] args) {
        // Stock prices array, jisme har din ka stock price diya hai
        int prices[] = {7, 1, 5, 3, 6, 4};
        
        int buyPrice = Integer.MAX_VALUE;  // Buy price ko initially infinity set karte hain
        int max_profit = 0;  // Maximum profit ko initially 0 set karte hain

        // Loop to traverse through the array
        for (int i = 0; i < prices.length; i++) {
            if (buyPrice < prices[i]) {   // Agar current price sell karne ke liye profitable ho
                int profit = prices[i] - buyPrice;  // Current profit calculate karte hain
                max_profit = Math.max(max_profit, profit);  // Maximum profit update karte hain
            } else {
                // Agar current price buy karne ke liye better ho
                buyPrice = prices[i];  // Buy price ko update karte hain
            }
        }

        // Maximum profit print karte hain
        System.out.println("Maximum profit is = " + max_profit);
    }
}
