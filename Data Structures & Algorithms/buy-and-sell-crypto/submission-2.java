class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;

        for (int buy = 0; buy < prices.length; buy++){
            for (int sell = buy; sell < prices.length; sell++){
                if (prices[sell] > prices[buy] && sell > buy){
                    maxProfit = Math.max(maxProfit, prices[sell] - prices[buy]);
            }
            }
        }
        return maxProfit;
    }
}
